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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.appthitracnghiem.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLinkSheetBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView backLinkSheet;

  @NonNull
  public final TextView txtGoogleSheet;

  private ActivityLinkSheetBinding(@NonNull LinearLayout rootView, @NonNull ImageView backLinkSheet,
      @NonNull TextView txtGoogleSheet) {
    this.rootView = rootView;
    this.backLinkSheet = backLinkSheet;
    this.txtGoogleSheet = txtGoogleSheet;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLinkSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLinkSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_link_sheet, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLinkSheetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backLinkSheet;
      ImageView backLinkSheet = ViewBindings.findChildViewById(rootView, id);
      if (backLinkSheet == null) {
        break missingId;
      }

      id = R.id.txtGoogleSheet;
      TextView txtGoogleSheet = ViewBindings.findChildViewById(rootView, id);
      if (txtGoogleSheet == null) {
        break missingId;
      }

      return new ActivityLinkSheetBinding((LinearLayout) rootView, backLinkSheet, txtGoogleSheet);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}