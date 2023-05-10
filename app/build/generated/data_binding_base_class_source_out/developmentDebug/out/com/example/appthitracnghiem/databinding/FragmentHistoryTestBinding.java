// Generated by view binder compiler. Do not edit!
package com.example.appthitracnghiem.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.appthitracnghiem.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHistoryTestBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final ImageView backHistoryTest;

  @NonNull
  public final RecyclerView listTestFromSystem;

  @NonNull
  public final RecyclerView listTestFromUser;

  @NonNull
  public final ImageView menuHistoryTest;

  @NonNull
  public final EditText searchTest;

  @NonNull
  public final TextView txtFromSystem;

  @NonNull
  public final TextView txtFromUser;

  @NonNull
  public final TextView txtTitleHistory;

  private FragmentHistoryTestBinding(@NonNull NestedScrollView rootView,
      @NonNull ImageView backHistoryTest, @NonNull RecyclerView listTestFromSystem,
      @NonNull RecyclerView listTestFromUser, @NonNull ImageView menuHistoryTest,
      @NonNull EditText searchTest, @NonNull TextView txtFromSystem, @NonNull TextView txtFromUser,
      @NonNull TextView txtTitleHistory) {
    this.rootView = rootView;
    this.backHistoryTest = backHistoryTest;
    this.listTestFromSystem = listTestFromSystem;
    this.listTestFromUser = listTestFromUser;
    this.menuHistoryTest = menuHistoryTest;
    this.searchTest = searchTest;
    this.txtFromSystem = txtFromSystem;
    this.txtFromUser = txtFromUser;
    this.txtTitleHistory = txtTitleHistory;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHistoryTestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHistoryTestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_history_test, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHistoryTestBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backHistoryTest;
      ImageView backHistoryTest = ViewBindings.findChildViewById(rootView, id);
      if (backHistoryTest == null) {
        break missingId;
      }

      id = R.id.listTestFromSystem;
      RecyclerView listTestFromSystem = ViewBindings.findChildViewById(rootView, id);
      if (listTestFromSystem == null) {
        break missingId;
      }

      id = R.id.listTestFromUser;
      RecyclerView listTestFromUser = ViewBindings.findChildViewById(rootView, id);
      if (listTestFromUser == null) {
        break missingId;
      }

      id = R.id.menuHistoryTest;
      ImageView menuHistoryTest = ViewBindings.findChildViewById(rootView, id);
      if (menuHistoryTest == null) {
        break missingId;
      }

      id = R.id.searchTest;
      EditText searchTest = ViewBindings.findChildViewById(rootView, id);
      if (searchTest == null) {
        break missingId;
      }

      id = R.id.txtFromSystem;
      TextView txtFromSystem = ViewBindings.findChildViewById(rootView, id);
      if (txtFromSystem == null) {
        break missingId;
      }

      id = R.id.txtFromUser;
      TextView txtFromUser = ViewBindings.findChildViewById(rootView, id);
      if (txtFromUser == null) {
        break missingId;
      }

      id = R.id.txtTitleHistory;
      TextView txtTitleHistory = ViewBindings.findChildViewById(rootView, id);
      if (txtTitleHistory == null) {
        break missingId;
      }

      return new FragmentHistoryTestBinding((NestedScrollView) rootView, backHistoryTest,
          listTestFromSystem, listTestFromUser, menuHistoryTest, searchTest, txtFromSystem,
          txtFromUser, txtTitleHistory);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}