// Generated by view binder compiler. Do not edit!
package com.example.appthitracnghiem.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.appthitracnghiem.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRegisterBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final EditText edtEnterEmailRegister;

  @NonNull
  public final EditText edtEnterNameRegister;

  @NonNull
  public final EditText edtEnterYearOfBirthRegister;

  @NonNull
  public final EditText edtPhoneRegister;

  @NonNull
  public final ImageButton hidePasswordRegister;

  @NonNull
  public final ImageButton hidePasswordRegisterRepeat;

  @NonNull
  public final TextView loginNow;

  @NonNull
  public final EditText passwordRegister;

  @NonNull
  public final EditText passwordRegisterRepeat;

  @NonNull
  public final Button registerAccount;

  @NonNull
  public final ImageView selectDate;

  @NonNull
  public final TextView textString;

  @NonNull
  public final TextView warningRegister;

  private FragmentRegisterBinding(@NonNull NestedScrollView rootView,
      @NonNull EditText edtEnterEmailRegister, @NonNull EditText edtEnterNameRegister,
      @NonNull EditText edtEnterYearOfBirthRegister, @NonNull EditText edtPhoneRegister,
      @NonNull ImageButton hidePasswordRegister, @NonNull ImageButton hidePasswordRegisterRepeat,
      @NonNull TextView loginNow, @NonNull EditText passwordRegister,
      @NonNull EditText passwordRegisterRepeat, @NonNull Button registerAccount,
      @NonNull ImageView selectDate, @NonNull TextView textString,
      @NonNull TextView warningRegister) {
    this.rootView = rootView;
    this.edtEnterEmailRegister = edtEnterEmailRegister;
    this.edtEnterNameRegister = edtEnterNameRegister;
    this.edtEnterYearOfBirthRegister = edtEnterYearOfBirthRegister;
    this.edtPhoneRegister = edtPhoneRegister;
    this.hidePasswordRegister = hidePasswordRegister;
    this.hidePasswordRegisterRepeat = hidePasswordRegisterRepeat;
    this.loginNow = loginNow;
    this.passwordRegister = passwordRegister;
    this.passwordRegisterRepeat = passwordRegisterRepeat;
    this.registerAccount = registerAccount;
    this.selectDate = selectDate;
    this.textString = textString;
    this.warningRegister = warningRegister;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment__register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edtEnterEmailRegister;
      EditText edtEnterEmailRegister = ViewBindings.findChildViewById(rootView, id);
      if (edtEnterEmailRegister == null) {
        break missingId;
      }

      id = R.id.edtEnterNameRegister;
      EditText edtEnterNameRegister = ViewBindings.findChildViewById(rootView, id);
      if (edtEnterNameRegister == null) {
        break missingId;
      }

      id = R.id.edtEnterYearOfBirthRegister;
      EditText edtEnterYearOfBirthRegister = ViewBindings.findChildViewById(rootView, id);
      if (edtEnterYearOfBirthRegister == null) {
        break missingId;
      }

      id = R.id.edtPhoneRegister;
      EditText edtPhoneRegister = ViewBindings.findChildViewById(rootView, id);
      if (edtPhoneRegister == null) {
        break missingId;
      }

      id = R.id.hidePasswordRegister;
      ImageButton hidePasswordRegister = ViewBindings.findChildViewById(rootView, id);
      if (hidePasswordRegister == null) {
        break missingId;
      }

      id = R.id.hidePasswordRegisterRepeat;
      ImageButton hidePasswordRegisterRepeat = ViewBindings.findChildViewById(rootView, id);
      if (hidePasswordRegisterRepeat == null) {
        break missingId;
      }

      id = R.id.loginNow;
      TextView loginNow = ViewBindings.findChildViewById(rootView, id);
      if (loginNow == null) {
        break missingId;
      }

      id = R.id.passwordRegister;
      EditText passwordRegister = ViewBindings.findChildViewById(rootView, id);
      if (passwordRegister == null) {
        break missingId;
      }

      id = R.id.passwordRegisterRepeat;
      EditText passwordRegisterRepeat = ViewBindings.findChildViewById(rootView, id);
      if (passwordRegisterRepeat == null) {
        break missingId;
      }

      id = R.id.registerAccount;
      Button registerAccount = ViewBindings.findChildViewById(rootView, id);
      if (registerAccount == null) {
        break missingId;
      }

      id = R.id.selectDate;
      ImageView selectDate = ViewBindings.findChildViewById(rootView, id);
      if (selectDate == null) {
        break missingId;
      }

      id = R.id.textString;
      TextView textString = ViewBindings.findChildViewById(rootView, id);
      if (textString == null) {
        break missingId;
      }

      id = R.id.warningRegister;
      TextView warningRegister = ViewBindings.findChildViewById(rootView, id);
      if (warningRegister == null) {
        break missingId;
      }

      return new FragmentRegisterBinding((NestedScrollView) rootView, edtEnterEmailRegister,
          edtEnterNameRegister, edtEnterYearOfBirthRegister, edtPhoneRegister, hidePasswordRegister,
          hidePasswordRegisterRepeat, loginNow, passwordRegister, passwordRegisterRepeat,
          registerAccount, selectDate, textString, warningRegister);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
