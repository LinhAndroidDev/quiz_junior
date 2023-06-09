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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.appthitracnghiem.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLinkSheetBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CardView backCheckSheet;

  @NonNull
  public final ImageView backLinkSheet;

  @NonNull
  public final CardView checkSheet;

  @NonNull
  public final RelativeLayout layoutCheckSheet;

  @NonNull
  public final RelativeLayout layoutSheet;

  @NonNull
  public final TextView txtGoogleSheet;

  private ActivityLinkSheetBinding(@NonNull RelativeLayout rootView,
      @NonNull CardView backCheckSheet, @NonNull ImageView backLinkSheet,
      @NonNull CardView checkSheet, @NonNull RelativeLayout layoutCheckSheet,
      @NonNull RelativeLayout layoutSheet, @NonNull TextView txtGoogleSheet) {
    this.rootView = rootView;
    this.backCheckSheet = backCheckSheet;
    this.backLinkSheet = backLinkSheet;
    this.checkSheet = checkSheet;
    this.layoutCheckSheet = layoutCheckSheet;
    this.layoutSheet = layoutSheet;
    this.txtGoogleSheet = txtGoogleSheet;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
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
      id = R.id.backCheckSheet;
      CardView backCheckSheet = ViewBindings.findChildViewById(rootView, id);
      if (backCheckSheet == null) {
        break missingId;
      }

      id = R.id.backLinkSheet;
      ImageView backLinkSheet = ViewBindings.findChildViewById(rootView, id);
      if (backLinkSheet == null) {
        break missingId;
      }

      id = R.id.checkSheet;
      CardView checkSheet = ViewBindings.findChildViewById(rootView, id);
      if (checkSheet == null) {
        break missingId;
      }

      id = R.id.layoutCheckSheet;
      RelativeLayout layoutCheckSheet = ViewBindings.findChildViewById(rootView, id);
      if (layoutCheckSheet == null) {
        break missingId;
      }

      id = R.id.layoutSheet;
      RelativeLayout layoutSheet = ViewBindings.findChildViewById(rootView, id);
      if (layoutSheet == null) {
        break missingId;
      }

      id = R.id.txtGoogleSheet;
      TextView txtGoogleSheet = ViewBindings.findChildViewById(rootView, id);
      if (txtGoogleSheet == null) {
        break missingId;
      }

      return new ActivityLinkSheetBinding((RelativeLayout) rootView, backCheckSheet, backLinkSheet,
          checkSheet, layoutCheckSheet, layoutSheet, txtGoogleSheet);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
