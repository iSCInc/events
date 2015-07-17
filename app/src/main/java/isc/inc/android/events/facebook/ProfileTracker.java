@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    FacebookSdk.sdkInitialize(this.getApplicationContext());
    callbackManager = CallbackManager.Factory.create();

    profileTracker = new ProfileTracker() {
        @Override
        protected void onCurrentProfileChanged(
                Profile oldProfile,
                Profile currentProfile) {
            // App code
        }
    };
}

@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    callbackManager.onActivityResult(requestCode, resultCode, data);
}

@Override
public void onDestroy() {
    super.onDestroy();
    profileTracker.stopTracking();
}
