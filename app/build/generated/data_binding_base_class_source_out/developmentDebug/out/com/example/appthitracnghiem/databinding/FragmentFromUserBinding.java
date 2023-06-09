// Generated by view binder compiler. Do not edit!
package com.example.appthitracnghiem.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.appthitracnghiem.R;
import com.jpardogo.android.googleprogressbar.library.GoogleProgressBar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFromUserBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final LinearLayout linearTitle;

  @NonNull
  public final GoogleProgressBar loadingQuizFromUser;

  @NonNull
  public final RecyclerView recycleListFromUser;

  @NonNull
  public final TextView textQuizHomeFromUser;

  private FragmentFromUserBinding(@NonNull NestedScrollView rootView,
      @NonNull LinearLayout linearTitle, @NonNull GoogleProgressBar loadingQuizFromUser,
      @NonNull RecyclerView recycleListFromUser, @NonNull TextView textQuizHomeFromUser) {
    this.rootView = rootView;
    this.linearTitle = linearTitle;
    this.loadingQuizFromUser = loadingQuizFromUser;
    this.recycleListFromUser = recycleListFromUser;
    this.textQuizHomeFromUser = textQuizHomeFromUser;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFromUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFromUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_from_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFromUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.linearTitle;
      LinearLayout linearTitle = ViewBindings.findChildViewById(rootView, id);
      if (linearTitle == null) {
        break missingId;
      }

      id = R.id.loadingQuizFromUser;
      GoogleProgressBar loadingQuizFromUser = ViewBindings.findChildViewById(rootView, id);
      if (loadingQuizFromUser == null) {
        break missingId;
      }

      id = R.id.recycleListFromUser;
      RecyclerView recycleListFromUser = ViewBindings.findChildViewById(rootView, id);
      if (recycleListFromUser == null) {
        break missingId;
      }

      id = R.id.textQuizHomeFromUser;
      TextView textQuizHomeFromUser = ViewBindings.findChildViewById(rootView, id);
      if (textQuizHomeFromUser == null) {
        break missingId;
      }

      return new FragmentFromUserBinding((NestedScrollView) rootView, linearTitle,
          loadingQuizFromUser, recycleListFromUser, textQuizHomeFromUser);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
