package com.example.appthitracnghiem.ui.exercise.exercise

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.FragmentTransaction
import com.example.appthitracnghiem.R
import com.example.appthitracnghiem.ui.EmptyViewModel
import com.example.appthitracnghiem.ui.base.BaseFragment
import com.example.appthitracnghiem.ui.home.HomeActivity
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import kotlinx.android.synthetic.main.fragment_point.*
import kotlinx.android.synthetic.main.fragment_point.view.*
import kotlinx.android.synthetic.main.fragment_profile.*

@Suppress("DEPRECATION")
class FragmentPoint : BaseFragment<EmptyViewModel>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        progressPoint.apply {
            progressMax = 100f
            setProgressWithAnimation(80f,3000)
        }

        val lineSeries = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 1.5),
                DataPoint(1.8, 1.5),
                DataPoint(2.5, 0.8),
                DataPoint(4.0, 2.3),
                DataPoint(5.0, 2.3),
                DataPoint(5.3, 1.5),
                DataPoint(6.5, 1.5),
                DataPoint(7.3, 2.3),
                DataPoint(8.1, 1.5),
                DataPoint(9.2, 1.5),
                DataPoint(9.2, 1.5),
                DataPoint(10.0, 0.7)
            )
        )
        graphView.addSeries(lineSeries)

        click()
    }

    private fun click() {
        backPoint.setOnClickListener {
            activity?.onBackPressed()
        }

        doAgainTest.setOnClickListener {
            activity?.finish()
        }

        finishAndSaved.setOnClickListener {
            val intent: Intent = Intent(requireActivity(),HomeActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }

        seeAnswer.setOnClickListener {
            val fragmentAnswer: FragmentAnswer = FragmentAnswer()
            val fm: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            fm.replace(R.id.changeIdExam,fragmentAnswer).addToBackStack(null).commit()
        }
    }

    override fun onFragmentBack(): Boolean {
        return false
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_point, container, false)
    }
}