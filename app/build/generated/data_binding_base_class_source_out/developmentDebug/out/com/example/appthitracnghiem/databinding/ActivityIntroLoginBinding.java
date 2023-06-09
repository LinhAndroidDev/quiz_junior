// Generated by view binder compiler. Do not edit!
package com.example.appthitracnghiem.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.appthitracnghiem.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityIntroLoginBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button loginIntro;

  @NonNull
  public final ImageView logo5;

  @NonNull
  public final Button registerIntro;

  @NonNull
  public final TextView toDoLate;

  private ActivityIntroLoginBinding(@NonNull RelativeLayout rootView, @NonNull Button loginIntro,
      @NonNull ImageView logo5, @NonNull Button registerIntro, @NonNull TextView toDoLate) {
    this.rootView = rootView;
    this.loginIntro = loginIntro;
    this.logo5 = logo5;
    this.registerIntro = registerIntro;
    this.toDoLate = toDoLate;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityIntroLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityIntroLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_intro_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityIntroLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.loginIntro;
      Button loginIntro = ViewBindings.findChildViewById(rootView, id);
      if (loginIntro == null) {
        break missingId;
      }

      id = R.id.logo5;
      ImageView logo5 = ViewBindings.findChildViewById(rootView, id);
      if (logo5 == null) {
        break missingId;
      }

      id = R.id.registerIntro;
      Button registerIntro = ViewBindings.findChildViewById(rootView, id);
      if (registerIntro == null) {
        break missingId;
      }

      id = R.id.toDoLate;
      TextView toDoLate = ViewBindings.findChildViewById(rootView, id);
      if (toDoLate == null) {
        break missingId;
      }

      return new ActivityIntroLoginBinding((RelativeLayout) rootView, loginIntro, logo5,
          registerIntro, toDoLate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
