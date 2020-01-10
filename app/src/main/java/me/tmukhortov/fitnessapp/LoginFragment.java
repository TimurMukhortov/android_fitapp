package me.tmukhortov.fitnessapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link LoginFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoginFragment extends Fragment {
    private static final String ARG_LOGIN = "login";
    private static final String ARG_PASSWORD = "password";

    private String login;
    private String password;

    public LoginFragment() {
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param login    Parameter 1.
     * @param password Parameter 2.
     * @return A new instance of fragment LoginFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LoginFragment newInstance(String login, String password) {
        LoginFragment fragment = new LoginFragment();
        Bundle args = new Bundle();
        args.putString(ARG_LOGIN, login);
        args.putString(ARG_PASSWORD, password);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            login = getArguments().getString(ARG_LOGIN);
            password = getArguments().getString(ARG_PASSWORD);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);
        TextView loginView = rootView.findViewById(R.id.fragment_login_login);
        TextView passwordView = rootView.findViewById(R.id.fragment_login_password);
        rootView.findViewById(R.id.fragment_login_enter)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Navigation.findNavController(getActivity(), R.id.nav_host_fragment)
                                .navigate(R.id.action_loginFragment_to_menuFragment);
                    }
                });
        rootView.findViewById(R.id.fragment_login_register)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Navigation.findNavController(getActivity(), R.id.nav_host_fragment)
                                .navigate(R.id.action_loginFragment_to_registrationFragment);
                    }
                });
        return rootView;
    }
}
