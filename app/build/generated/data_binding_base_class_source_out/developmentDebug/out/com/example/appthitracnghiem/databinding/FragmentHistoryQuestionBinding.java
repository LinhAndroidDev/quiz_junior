// Generated by view binder compiler. Do not edit!
package com.example.appthitracnghiem.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.appthitracnghiem.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHistoryQuestionBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView backHistoryQuestion;

  @NonNull
  public final ImageView menuCreateTestAct;

  @NonNull
  public final RecyclerView rcvListHistoryQuestion;

  @NonNull
  public final TextView txtHistoryTest;

  private FragmentHistoryQuestionBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView backHistoryQuestion, @NonNull ImageView menuCreateTestAct,
      @NonNull RecyclerView rcvListHistoryQuestion, @NonNull TextView txtHistoryTest) {
    this.rootView = rootView;
    this.backHistoryQuestion = backHistoryQuestion;
    this.menuCreateTestAct = menuCreateTestAct;
    this.rcvListHistoryQuestion = rcvListHistoryQuestion;
    this.txtHistoryTest = txtHistoryTest;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHistoryQuestionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHistoryQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_history_question, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHistoryQuestionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backHistoryQuestion;
      ImageView backHistoryQuestion = ViewBindings.findChildViewById(rootView, id);
      if (backHistoryQuestion == null) {
        break missingId;
      }

      id = R.id.menuCreateTestAct;
      ImageView menuCreateTestAct = ViewBindings.findChildViewById(rootView, id);
      if (menuCreateTestAct == null) {
        break missingId;
      }

      id = R.id.rcvListHistoryQuestion;
      RecyclerView rcvListHistoryQuestion = ViewBindings.findChildViewById(rootView, id);
      if (rcvListHistoryQuestion == null) {
        break missingId;
      }

      id = R.id.txtHistoryTest;
      TextView txtHistoryTest = ViewBindings.findChildViewById(rootView, id);
      if (txtHistoryTest == null) {
        break missingId;
      }

      return new FragmentHistoryQuestionBinding((LinearLayout) rootView, backHistoryQuestion,
          menuCreateTestAct, rcvListHistoryQuestion, txtHistoryTest);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
