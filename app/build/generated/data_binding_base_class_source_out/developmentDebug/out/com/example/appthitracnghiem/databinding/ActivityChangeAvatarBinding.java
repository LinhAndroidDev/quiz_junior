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
import com.jsibbold.zoomage.ZoomageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityChangeAvatarBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ZoomageView avatarEdit;

  @NonNull
  public final ImageView backChangeAvatar;

  @NonNull
  public final CardView done;

  @NonNull
  public final RelativeLayout layoutAvatarEdit;

  @NonNull
  public final ImageView strokeAvatar;

  @NonNull
  public final TextView txtChangeAvatar;

  private ActivityChangeAvatarBinding(@NonNull RelativeLayout rootView,
      @NonNull ZoomageView avatarEdit, @NonNull ImageView backChangeAvatar, @NonNull CardView done,
      @NonNull RelativeLayout layoutAvatarEdit, @NonNull ImageView strokeAvatar,
      @NonNull TextView txtChangeAvatar) {
    this.rootView = rootView;
    this.avatarEdit = avatarEdit;
    this.backChangeAvatar = backChangeAvatar;
    this.done = done;
    this.layoutAvatarEdit = layoutAvatarEdit;
    this.strokeAvatar = strokeAvatar;
    this.txtChangeAvatar = txtChangeAvatar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChangeAvatarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChangeAvatarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_change_avatar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChangeAvatarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.avatarEdit;
      ZoomageView avatarEdit = ViewBindings.findChildViewById(rootView, id);
      if (avatarEdit == null) {
        break missingId;
      }

      id = R.id.backChangeAvatar;
      ImageView backChangeAvatar = ViewBindings.findChildViewById(rootView, id);
      if (backChangeAvatar == null) {
        break missingId;
      }

      id = R.id.done;
      CardView done = ViewBindings.findChildViewById(rootView, id);
      if (done == null) {
        break missingId;
      }

      id = R.id.layoutAvatarEdit;
      RelativeLayout layoutAvatarEdit = ViewBindings.findChildViewById(rootView, id);
      if (layoutAvatarEdit == null) {
        break missingId;
      }

      id = R.id.strokeAvatar;
      ImageView strokeAvatar = ViewBindings.findChildViewById(rootView, id);
      if (strokeAvatar == null) {
        break missingId;
      }

      id = R.id.txtChangeAvatar;
      TextView txtChangeAvatar = ViewBindings.findChildViewById(rootView, id);
      if (txtChangeAvatar == null) {
        break missingId;
      }

      return new ActivityChangeAvatarBinding((RelativeLayout) rootView, avatarEdit,
          backChangeAvatar, done, layoutAvatarEdit, strokeAvatar, txtChangeAvatar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
