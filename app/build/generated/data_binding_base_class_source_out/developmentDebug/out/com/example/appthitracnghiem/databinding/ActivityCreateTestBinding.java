// Generated by view binder compiler. Do not edit!
package com.example.appthitracnghiem.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.appthitracnghiem.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCreateTestBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView addCoverImageCreateTest;

  @NonNull
  public final ImageView backCreateTest;

  @NonNull
  public final CardView continueCreateTest;

  @NonNull
  public final ImageView imageCoverCreateTest;

  @NonNull
  public final ImageView menuCreateTestAct;

  @NonNull
  public final RecyclerView recycleListNumber;

  @NonNull
  public final TextView txtAddQuestion;

  @NonNull
  public final TextView txtCreateTest;

  @NonNull
  public final TextView txtSelectImageCt;

  private ActivityCreateTestBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView addCoverImageCreateTest, @NonNull ImageView backCreateTest,
      @NonNull CardView continueCreateTest, @NonNull ImageView imageCoverCreateTest,
      @NonNull ImageView menuCreateTestAct, @NonNull RecyclerView recycleListNumber,
      @NonNull TextView txtAddQuestion, @NonNull TextView txtCreateTest,
      @NonNull TextView txtSelectImageCt) {
    this.rootView = rootView;
    this.addCoverImageCreateTest = addCoverImageCreateTest;
    this.backCreateTest = backCreateTest;
    this.continueCreateTest = continueCreateTest;
    this.imageCoverCreateTest = imageCoverCreateTest;
    this.menuCreateTestAct = menuCreateTestAct;
    this.recycleListNumber = recycleListNumber;
    this.txtAddQuestion = txtAddQuestion;
    this.txtCreateTest = txtCreateTest;
    this.txtSelectImageCt = txtSelectImageCt;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCreateTestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCreateTestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_create_test, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCreateTestBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addCoverImageCreateTest;
      ImageView addCoverImageCreateTest = ViewBindings.findChildViewById(rootView, id);
      if (addCoverImageCreateTest == null) {
        break missingId;
      }

      id = R.id.backCreateTest;
      ImageView backCreateTest = ViewBindings.findChildViewById(rootView, id);
      if (backCreateTest == null) {
        break missingId;
      }

      id = R.id.continueCreateTest;
      CardView continueCreateTest = ViewBindings.findChildViewById(rootView, id);
      if (continueCreateTest == null) {
        break missingId;
      }

      id = R.id.imageCoverCreateTest;
      ImageView imageCoverCreateTest = ViewBindings.findChildViewById(rootView, id);
      if (imageCoverCreateTest == null) {
        break missingId;
      }

      id = R.id.menuCreateTestAct;
      ImageView menuCreateTestAct = ViewBindings.findChildViewById(rootView, id);
      if (menuCreateTestAct == null) {
        break missingId;
      }

      id = R.id.recycleListNumber;
      RecyclerView recycleListNumber = ViewBindings.findChildViewById(rootView, id);
      if (recycleListNumber == null) {
        break missingId;
      }

      id = R.id.txtAddQuestion;
      TextView txtAddQuestion = ViewBindings.findChildViewById(rootView, id);
      if (txtAddQuestion == null) {
        break missingId;
      }

      id = R.id.txtCreateTest;
      TextView txtCreateTest = ViewBindings.findChildViewById(rootView, id);
      if (txtCreateTest == null) {
        break missingId;
      }

      id = R.id.txtSelectImageCt;
      TextView txtSelectImageCt = ViewBindings.findChildViewById(rootView, id);
      if (txtSelectImageCt == null) {
        break missingId;
      }

      return new ActivityCreateTestBinding((RelativeLayout) rootView, addCoverImageCreateTest,
          backCreateTest, continueCreateTest, imageCoverCreateTest, menuCreateTestAct,
          recycleListNumber, txtAddQuestion, txtCreateTest, txtSelectImageCt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
