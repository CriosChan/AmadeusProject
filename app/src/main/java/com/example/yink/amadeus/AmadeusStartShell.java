package com.example.yink.amadeus;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AmadeusStartShell extends AppCompatActivity {

    private TextView Shell;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amadeus_shell_start);
        Shell = (TextView) findViewById(R.id.shell1);

        Shell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AmadeusStartShell.this, LaunchActivity.class);
                AmadeusStartShell.this.startActivity(intent);
                AmadeusStartShell.this.finish();
            }
        });

        Shell.setText("");

        new Handler().postDelayed(new Runnable() {
            public void run() {
                Shell.setText("Login :");
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        Shell.setText("Login");
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                Shell.setText("Login :");
                                new Handler().postDelayed(new Runnable() {
                                    public void run() {
                                        Shell.setText("Login ");
                                        new Handler().postDelayed(new Runnable() {
                                            public void run() {
                                                Shell.setText("Login :");
                                                new Handler().postDelayed(new Runnable() {
                                                    public void run() {
                                                        Shell.setText("Login : L");
                                                        new Handler().postDelayed(new Runnable() {
                                                            public void run() {
                                                                Shell.setText("Login : LE");
                                                                new Handler().postDelayed(new Runnable() {
                                                                    public void run() {
                                                                        Shell.setText("Login : LES");
                                                                        new Handler().postDelayed(new Runnable() {
                                                                            public void run() {
                                                                                Shell.setText("Login : LESK");
                                                                                new Handler().postDelayed(new Runnable() {
                                                                                    public void run() {
                                                                                        Shell.setText("Login : LESKI");
                                                                                        new Handler().postDelayed(new Runnable() {
                                                                                            public void run() {
                                                                                                Shell.setText("Login : LESKIN");
                                                                                                new Handler().postDelayed(new Runnable() {
                                                                                                    public void run() {
                                                                                                        Shell.setText("Login : LESKINE");
                                                                                                        new Handler().postDelayed(new Runnable() {
                                                                                                            public void run() {
                                                                                                                Shell.setText("Login : LESKINEN");
                                                                                                                new Handler().postDelayed(new Runnable() {
                                                                                                                    public void run() {
                                                                                                                        Shell.setText("Login : LESKINEN\n\nPassword :");
                                                                                                                        new Handler().postDelayed(new Runnable() {
                                                                                                                            public void run() {
                                                                                                                                Shell.setText("Login : LESKINEN\n\nPassword : *");
                                                                                                                                new Handler().postDelayed(new Runnable() {
                                                                                                                                    public void run() {
                                                                                                                                        Shell.setText("Login : LESKINEN\n\nPassword : **");
                                                                                                                                        new Handler().postDelayed(new Runnable() {
                                                                                                                                            public void run() {
                                                                                                                                                Shell.setText("Login : LESKINEN\n\nPassword : ***");
                                                                                                                                                new Handler().postDelayed(new Runnable() {
                                                                                                                                                    public void run() {
                                                                                                                                                        Shell.setText("Login : LESKINEN\n\nPassword : ****");
                                                                                                                                                        new Handler().postDelayed(new Runnable() {
                                                                                                                                                            public void run() {
                                                                                                                                                                Shell.setText("Login : LESKINEN\n\nPassword : *****");
                                                                                                                                                                new Handler().postDelayed(new Runnable() {
                                                                                                                                                                    public void run() {
                                                                                                                                                                        Shell.setText("Login : LESKINEN\n\nPassword : *****");
                                                                                                                                                                        new Handler().postDelayed(new Runnable() {
                                                                                                                                                                            public void run() {
                                                                                                                                                                                Shell.setText("");
                                                                                                                                                                                new Handler().postDelayed(new Runnable() {
                                                                                                                                                                                    public void run() {
                                                                                                                                                                                        Shell.setText("INIT: AMADEUS PROJECT");
                                                                                                                                                                                        new Handler().postDelayed(new Runnable() {
                                                                                                                                                                                            public void run() {
                                                                                                                                                                                                Shell.setText("INIT: AMADEUS PROJECT\n\n\nSYSTEM :");
                                                                                                                                                                                                new Handler().postDelayed(new Runnable() {
                                                                                                                                                                                                    public void run() {
                                                                                                                                                                                                        Shell.setText("INIT: AMADEUS PROJECT\n\n\nSYSTEM :\n\n\nMounting : Memories");
                                                                                                                                                                                                        new Handler().postDelayed(new Runnable() {
                                                                                                                                                                                                            public void run() {
                                                                                                                                                                                                                Shell.setText("INIT: AMADEUS PROJECT\n\n\nSYSTEM :\n\n\nMounting : Memories\nMounting : Kurisu Voice");
                                                                                                                                                                                                                new Handler().postDelayed(new Runnable() {
                                                                                                                                                                                                                    public void run() {
                                                                                                                                                                                                                        Shell.setText("INIT: AMADEUS PROJECT\n\n\nSYSTEM :\n\n\nMounting : Memories\nMounting : Kurisu Voice\nMounting : Kurisu Model");
                                                                                                                                                                                                                        new Handler().postDelayed(new Runnable() {
                                                                                                                                                                                                                            public void run() {
                                                                                                                                                                                                                                Shell.setText("INIT: AMADEUS PROJECT\n\n\nSYSTEM :\n\n\nMounting : Memories\nMounting : Kurisu Voice\nMounting : Kurisu Model\nInitialization : Amadeus");
                                                                                                                                                                                                                                new Handler().postDelayed(new Runnable() {
                                                                                                                                                                                                                                    public void run() {
                                                                                                                                                                                                                                        Shell.setText("INIT: AMADEUS PROJECT\n\n\nSYSTEM :\n\n\nMounting : Memories\nMounting : Kurisu Voice\nMounting : Kurisu Model\nInitialization : Amadeus\nExecute: Amadeus");
                                                                                                                                                                                                                                        new Handler().postDelayed(new Runnable() {
                                                                                                                                                                                                                                            public void run() {
                                                                                                                                                                                                                                                Shell.setText("INIT: AMADEUS PROJECT\n\n\nSYSTEM :\n\n\nMounting : Memories\nMounting : Kurisu Voice\nMounting : Kurisu Model\nInitialization : Amadeus\nExecute: Amadeus\n\nFinish");
                                                                                                                                                                                                                                                Intent intent = new Intent(AmadeusStartShell.this, LaunchActivity.class);
                                                                                                                                                                                                                                                AmadeusStartShell.this.startActivity(intent);
                                                                                                                                                                                                                                                AmadeusStartShell.this.finish();
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }, 1000);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }, 1000);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }, 1000);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }, 1000);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }, 1000);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }, 1000);
                                                                                                                                                                                            }
                                                                                                                                                                                        }, 1000);
                                                                                                                                                                                    }
                                                                                                                                                                                }, 1000);
                                                                                                                                                                            }
                                                                                                                                                                        }, 300);
                                                                                                                                                                    }
                                                                                                                                                                }, 300);
                                                                                                                                                            }
                                                                                                                                                        }, 300);
                                                                                                                                                    }
                                                                                                                                                }, 300);
                                                                                                                                            }
                                                                                                                                        }, 300);
                                                                                                                                    }
                                                                                                                                }, 300);
                                                                                                                            }
                                                                                                                        }, 300);
                                                                                                                    }
                                                                                                                }, 300);
                                                                                                            }
                                                                                                        }, 300);
                                                                                                    }
                                                                                                }, 300);
                                                                                            }
                                                                                        }, 300);
                                                                                    }
                                                                                }, 300);
                                                                            }
                                                                        }, 300);
                                                                    }
                                                                }, 300);
                                                            }
                                                        }, 300);
                                                    }
                                                }, 300);
                                            }
                                        }, 800);
                                    }
                                }, 800);
                            }
                        }, 800);
                    }
                }, 800);
            }
        }, 800);

    }
}
