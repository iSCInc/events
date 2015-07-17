@Override
 public void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     FacebookSdk.sdkInitialize(getApplicationContext());
     // Initialize the SDK before executing any other operations,
     // especially, if you're using Facebook UI elements.
}
