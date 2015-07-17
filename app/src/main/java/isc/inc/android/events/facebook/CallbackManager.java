public class MainActivity extends FragmentActivity {
    CallbackManager callbackManager;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        callbackManager = CallbackManager.Factory.create();
        LoginButton loginButton = (LoginButton) view.findViewById(R.id.usersettings_fragment_login_button);
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() { ... });
    }
