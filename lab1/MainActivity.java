public class MainActivity extends AppCompatActivity {

    EditText eName = (EditText)findViewById(R.id.eName);
    TextView tName = (TextView)findViewById(R.id.tName);
    Button bClick = (Button)findViewById(R.id.bClick);
    private EditText eName;
    private TextView tName;
    private Button bClick;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.eName = (EditText)findViewById(R.id.eName);
        this.bClick = (Button)findViewById(R.id.bClick);
    }

    public void clicked(View view)
@@ -51,7 +56,8 @@ public void onClick(DialogInterface dialog,
                        Toast.makeText(getApplicationContext(),"You're ugly, " + eName.getText().toString(),Toast.LENGTH_LONG).show();
                    }
                }
                );
                )
        .show();


    }
