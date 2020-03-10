package com.nieto.luis.gpr;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.InputDeviceCompat;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.view.InputDeviceCompat;

import com.example.gprtest.R;

import ca.uol.aig.fftpack.RealDoubleFFT;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class Georradar extends Activity {
    public static final int REQUEST_ID_MULTIPLE_PERMISSIONS = 1;
    public String ANTENNAS;
    public String ANTENNA_ORIENTATION;
    public String ANTENNA_SEPARATION;
    public String COMMENT;
    public String CUSTOMER;
    public String DISTANCE_FLAG;
    public double DISTANCE_INTERVAL;
    public double DISTANCE_INTERVAL2;
    public String EXTERNAL_FLAG;
    public String FIXED_INCREMENT;
    public String FIXED_MOVES_DOWN;
    public String FIXED_MOVES_UP;
    public String FIXED_POSITION;
    public String FREQUENCY;
    public String HIGH;
    public String INTERMEDIATE_FLAG;
    public int LAST_TRACE;
    public String LONG_FLAG;
    public String LOW;
    public String OPERATOR;
    public String POSITIVE;
    public String PREPROCESSING;
    public String PROGRAM_FLAG;
    public ImageView Pizzoom;
    public String RAW_SIGNAL_POSITION;
    public int SAMPLES;
    int SAMPLES2 = 1;
    public String SHORT_FLAG;
    public String SIGNAL_POSITION;
    public String SITE;
    public String STACKING_TIME;
    public String STACKS;
    public String STACK_EXPONENT;
    public String START_POSITION;
    public String STEPS;
    public String STOP_POSITION;
    public String SYSTEM_CALIBRATION;
    public double TIMEWINDOW;
    public double TIMEWINDOW2;
    public String TIME_FLAG;
    public String TIME_INTERVAL;
    public String TextoPubli = "http://www.abakal.com";
    public String WHEEL_CALIBRATION;
    double alturamodif = 0.0d;
    float ancho = 0.0f;
    public String archivoelegido = "";
    public String archivoelegido2 = "";
    boolean arreglado = false;
    /* access modifiers changed from: private */
    public int blockSize = 256;
    boolean boleofrec = true;
    public Canvas canvas;
    public Canvas canvasb;
    public Canvas canvasc;
    public int cerado = 0;
    double cero;
    public int chivatocolor = 0;
    public int chivobn = 0;
    double chivocolor = 1.0d;
    public int chivoderi = 1;
    double chivoderj = 1.0d;
    public int chivozoom = 0;
    int col;
    int col2 = 1;
    int[] colores = new int[2000];
    boolean colorexpan = false;
    int[][] colorines = ((int[][]) Array.newInstance(int.class, 12, 2000));
    double contraste = 1.0d;
    double contraste2 = 1.0d;
    public Bitmap cuadro;
    public Bitmap cuadrob;
    public Bitmap cuadroc;
    int der = 0;
    public String directorioelegido = "";
    float divi = 1.0f;
    double eerror = Math.pow(10.0d, -this.error);
    double error = 6.0d;
    double exponente = 1.0d;
    double fecumaximis = 0.0d;
    /* access modifiers changed from: private */
    public ArrayList<File> fileList = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<File> fileList2 = new ArrayList<>();
    double fin = 1.0d;
    int fondo;
    double fouri = 10.0d;
    /* access modifiers changed from: private */
    public float getescalex = 1.0f;
    /* access modifiers changed from: private */
    public float getescaley = 1.0f;
    String htmlint = "";
    int iz = 0;
    double kfrec = 1.0d;
    String[][] lidioma = ((String[][]) Array.newInstance(String.class, 4, 90));
    public double limitedivi = 10000.0d;
    /* access modifiers changed from: private */
    public float mPreviousX0;
    /* access modifiers changed from: private */
    public float mPreviousX1;
    /* access modifiers changed from: private */
    public float mPreviousY0;
    /* access modifiers changed from: private */
    public float mPreviousY1;
    public double[][] ma0;
    public double[][] ma2;
    public double[][] ma3;
    double max = 0.0d;
    float mcx = 0.0f;
    float mcy = 0.0f;
    double min = 0.0d;
    public int multiplus = 1;
    float mx = 0.0f;
    float my = 0.0f;
    public MyTimerTask myTimerTask;
    public MyTimerTask2 myTimerTask2;
    NumberFormat nF0 = new DecimalFormat("#0.0");
    NumberFormat nF00 = new DecimalFormat("#0.00");
    int nidioma = 2;
    double num = 0.0d;
    double numerodelperfil = 1.0d;
    /* access modifiers changed from: private */
    public ProgressDialog pDialog;
    public Paint paint_n = new Paint();
    public Paint paint_nb = new Paint();
    public Paint paint_nc = new Paint();
    double patron = 1.0d;
    public Activity pin;
    public ImageView pizarra;
    public ImageView pizarrab;
    public ImageView pizarrac;
    public double posicionFX = 0.0d;
    public double posicionFY = 0.0d;
    private float previodudu;
    double previomax = 0.0d;
    double previomin = 0.0d;
    /* access modifiers changed from: private */
    public File raat;
    public double refraccion = 6.0d;
    double regladim = 0.1d;
    /* access modifiers changed from: private */
    public File root;
    public String ruta_fotos = "";
    boolean sincentrar = true;
    public Spinner spin;
    public Spinner spin2;
    double suavito = 0.0d;
    double suavitoh = 0.0d;
    MiTareaAsincronaDialog tarea2;
    public TextView tecontrol;
    public String textoaux = "";
    public Timer timer;
    public Timer timer2;
    double trunca = 1.0d;
    double voy = 0.0d;
    double xmax = 0.0d;
    double xmin = 0.0d;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        getWindow().addFlags(128);
        if (checkAndRequestPermissions()) {
            Inicializador();
        }
    }

    /* access modifiers changed from: package-private */
    public void estarter() {
        if (this.archivoelegido2.equals("vacio")) {
            this.archivoelegido2 = "";
        }
        if (!this.archivoelegido2.equals("")) {
            this.timer = new Timer();
            this.myTimerTask = new MyTimerTask();
            this.timer.schedule(this.myTimerTask, 2000);
            File file = new File(this.directorioelegido + "/" + this.archivoelegido2);
            NumberFormat numberFormat = this.nF0;
            double length = (double) (file.length() / 50000);
            Double.isNaN(length);
            String format = numberFormat.format(length + 3.0d);
            Context baseContext = getBaseContext();
            Toast.makeText(baseContext, this.lidioma[this.nidioma][28] + this.archivoelegido2 + this.lidioma[this.nidioma][29] + format + " s.", 1).show();
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
    public void Inicializador() {
        leeidioma();
        this.cuadro = null;
        this.timer2 = new Timer();
        this.myTimerTask2 = new MyTimerTask2();
        this.timer2.schedule(this.myTimerTask2, 100, 30000);
        this.tecontrol = (TextView) findViewById(R.id.textViewControl);
        this.tecontrol.setText("");
        this.tecontrol.setVisibility(4);
        getfile(this.root);
        this.spin = (Spinner) findViewById(R.id.spinner);
        this.spin2 = (Spinner) findViewById(R.id.spinner2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.fileList.size(); i++) {
            arrayList.add(this.fileList.get(i).getAbsolutePath());
        }
        Collections.sort(arrayList);

        arrayList.add(0, this.root.getParentFile().toString());
        arrayList.add(0, this.root.toString());
        this.spin.setAdapter((SpinnerAdapter) new ArrayAdapter(this, 17367048, arrayList));
        this.pin = super;
        addListenerOnSpinnerItemSelection();
        this.pizarra = (ImageView) findViewById(R.id.imageView);
        this.pizarra.scrollBy(0, 0);

        //主屏幕那块
        this.pizarrab = (ImageView) findViewById(R.id.imageViewb);
        //合成雷达记录
        this.pizarrac = (ImageView) findViewById(R.id.imageView3);

        //设置主屏操作
        this.pizarrab.setOnTouchListener(new View.OnTouchListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass1 */

            public boolean onTouch(View view, MotionEvent motionEvent) {


                MotionEvent motionEvent2 = motionEvent;
                int pointerCount = motionEvent.getPointerCount() - 1;
                float x = motionEvent2.getX(0);
                float y = motionEvent2.getY(0);
                float x2 = motionEvent2.getX(pointerCount);
                float y2 = motionEvent2.getY(pointerCount);

                if (Georradar.this.col < 10) {
                    return true;
                }
                Georradar.this.col2 = (Georradar.this.col - Georradar.this.der) - Georradar.this.iz;
                double width = (double) Georradar.this.pizarra.getWidth();
                Double.isNaN(width);
                double height = (double) Georradar.this.pizarra.getHeight();
                Double.isNaN(height);
                double d = (width * 1.0d) / height;
                double width2 = (double) Georradar.this.cuadro.getWidth();
                Double.isNaN(width2);
                float f = x;
                double height2 = (double) Georradar.this.cuadro.getHeight();
                Double.isNaN(height2);
                if (d < (width2 * 1.0d) / height2) {
                    Georradar georradar = Georradar.this;
                    double d2 = (double) Georradar.this.col2;
                    Double.isNaN(d2);
                    double width3 = (double) Georradar.this.pizarra.getWidth();
                    Double.isNaN(width3);
                    double d3 = (double) ((Georradar.this.divi * 100.0f) + ((float) Georradar.this.col2));
                    Double.isNaN(d3);
                    georradar.ancho = (float) ((int) ((((d2 * 1.0d) / 2.0d) * width3) / d3));
                } else {
                    Georradar georradar2 = Georradar.this;
                    double d4 = (double) Georradar.this.col2;
                    Double.isNaN(d4);
                    double width4 = (double) Georradar.this.cuadro.getWidth();
                    Double.isNaN(width4);
                    double d5 = ((d4 * 1.0d) / 2.0d) * width4;
                    double height3 = (double) Georradar.this.cuadro.getHeight();
                    Double.isNaN(height3);
                    double d6 = d5 / height3;
                    double height4 = (double) Georradar.this.pizarra.getHeight();
                    Double.isNaN(height4);
                    double d7 = (double) ((Georradar.this.divi * 100.0f) + ((float) Georradar.this.col2));
                    Double.isNaN(d7);
                    georradar2.ancho = (float) ((int) ((d6 * height4) / d7));
                }
                switch (motionEvent.getAction()) {
                    case 0:
                        Georradar.this.mx = motionEvent2.getX(0);
                        Georradar.this.my = motionEvent2.getY(0);
                        if (Georradar.this.chivozoom == 11) {
                            Georradar.this.dibujaregla();
                        }
                        if (Georradar.this.chivozoom == 15) {
                            Georradar.this.dibujareglacua();
                        }
                        if (Georradar.this.chivozoom == 16) {
                            Georradar.this.dibujareglahip();
                        }
                        if (Georradar.this.chivozoom == 17) {
                            Georradar.this.dibujareglapar();
                            break;
                        }
                        break;
                    case 1:
                        float x3 = motionEvent2.getX(0);
                        float y3 = motionEvent2.getY(0);
                        Georradar.this.mx = x3;
                        Georradar.this.my = y3;
                        Georradar.this.pizarra.scrollBy((int) (((Georradar.this.mx - x3) / Georradar.this.pizarra.getScaleX()) * 0.5f), (int) (((Georradar.this.my - y3) / Georradar.this.pizarra.getScaleY()) * 0.5f));
                        Georradar.this.mx = x3;
                        Georradar.this.my = y3;
                        if (((float) Georradar.this.pizarra.getScrollX()) <= (-Georradar.this.ancho)) {
                            Georradar.this.pizarra.scrollTo((int) (-Georradar.this.ancho), Georradar.this.pizarra.getScrollY());
                        }
                        if (((float) Georradar.this.pizarra.getScrollX()) >= Georradar.this.ancho) {
                            Georradar.this.pizarra.scrollTo((int) Georradar.this.ancho, Georradar.this.pizarra.getScrollY());
                        }
                        if (Georradar.this.chivozoom == 11) {
                            Georradar.this.dibujaregla();
                        }
                        if (Georradar.this.chivozoom == 15) {
                            Georradar.this.dibujareglacua();
                        }
                        if (Georradar.this.chivozoom == 16) {
                            Georradar.this.dibujareglahip();
                        }
                        if (Georradar.this.chivozoom == 17) {
                            Georradar.this.dibujareglapar();
                            break;
                        }
                        break;
                    case 2:
                        if (pointerCount > 0) {
                            float abs = Math.abs(x2 - f);
                            float abs2 = Math.abs(y2 - y);
                            float abs3 = Math.abs(Georradar.this.mPreviousX1 - Georradar.this.mPreviousX0);
                            float abs4 = Math.abs(Georradar.this.mPreviousY1 - Georradar.this.mPreviousY0);
                            float width5 = ((((float) Georradar.this.pizarra.getWidth()) - (abs3 - abs)) / ((float) Georradar.this.pizarra.getWidth())) * Georradar.this.pizarra.getScaleX();
                            float height5 = ((((float) Georradar.this.pizarra.getHeight()) - (abs4 - abs2)) / ((float) Georradar.this.pizarra.getHeight())) * Georradar.this.pizarra.getScaleY();
                            Georradar.this.pizarra.setScaleX(width5);
                            Georradar.this.pizarra.setScaleY(height5);
                            float unused = Georradar.this.getescalex = width5;
                            float unused2 = Georradar.this.getescaley = height5;
                            if (Georradar.this.chivozoom == 11) {
                                Georradar.this.dibujaregla();
                            }
                            if (Georradar.this.chivozoom == 15) {
                                Georradar.this.dibujareglacua();
                            }
                            if (Georradar.this.chivozoom == 16) {
                                Georradar.this.dibujareglahip();
                            }
                            if (Georradar.this.chivozoom == 17) {
                                Georradar.this.dibujareglapar();
                            }
                            float unused3 = Georradar.this.getescalex = width5;
                            float unused4 = Georradar.this.getescaley = height5;
                        }
                        float x4 = motionEvent2.getX(0);
                        float y4 = motionEvent2.getY(0);
                        Georradar.this.pizarra.scrollBy((int) (((Georradar.this.mx - x4) / Georradar.this.pizarra.getScaleX()) * 0.5f), (int) (((Georradar.this.my - y4) / Georradar.this.pizarra.getScaleY()) * 0.5f));
                        Georradar.this.mx = x4;
                        Georradar.this.my = y4;
                        if (((float) Georradar.this.pizarra.getScrollX()) <= (-Georradar.this.ancho)) {
                            Georradar.this.pizarra.scrollTo((int) (-Georradar.this.ancho), Georradar.this.pizarra.getScrollY());
                        }
                        if (((float) Georradar.this.pizarra.getScrollX()) >= Georradar.this.ancho) {
                            Georradar.this.pizarra.scrollTo((int) Georradar.this.ancho, Georradar.this.pizarra.getScrollY());
                        }
                        int height6 = Georradar.this.pizarra.getHeight() / 2;
                        Georradar.this.pizarra.getScaleY();
                        int i = Georradar.this.col2;
                        float f2 = Georradar.this.divi;
                        int i2 = Georradar.this.SAMPLES2;
                        float f3 = Georradar.this.divi;
                        Georradar.this.pizarra.getWidth();
                        Georradar.this.pizarra.getHeight();
                        break;
                }
                float unused5 = Georradar.this.mPreviousY0 = y;
                float unused6 = Georradar.this.mPreviousX0 = f;
                float unused7 = Georradar.this.mPreviousY1 = y2;
                float unused8 = Georradar.this.mPreviousX1 = x2;
                Georradar georradar3 = Georradar.this;

                double scrollX = (double) (((float) Georradar.this.pizarra.getScrollX()) / Georradar.this.ancho);
                Double.isNaN(scrollX);
                georradar3.numerodelperfil = (scrollX * 0.5d) + 0.5d;

                //主屏幕 写字画线
                Georradar.this.perfil(Georradar.this.numerodelperfil);

                if (Georradar.this.chivozoom != 11) {
                    return true;
                }
                Georradar.this.diburegla2(Georradar.this.pizarra.getScrollY());
                return true;
            }
        });


        this.Pizzoom = (ImageView) findViewById(R.id.imageView6);

        this.Pizzoom.setOnTouchListener(new View.OnTouchListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass2 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return true;
                }
                Georradar.this.chivatocolor = (int) ((motionEvent.getY() * 6.0f) / ((float) Georradar.this.Pizzoom.getHeight()));
                if (motionEvent.getX() > ((float) (Georradar.this.Pizzoom.getWidth() / 2))) {
                    Georradar.this.chivatocolor += 6;
                }
                Georradar.this.coloracion2();
                ((ImageView) Georradar.this.findViewById(R.id.imageView6)).setVisibility(4);
                ((LinearLayout) Georradar.this.findViewById(R.id.zoombados)).setVisibility(4);
                Georradar.this.dibuja();
                Georradar.this.fondobn();
                Georradar.this.visible3();
                ((Button) Georradar.this.findViewById(R.id.buttonnor)).setVisibility(0);
                ((Button) Georradar.this.findViewById(R.id.buttonfij)).setVisibility(0);
                ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.chivocolor));
                Georradar.this.chivozoom = 13;
                return true;
            }
        });

        //合成雷达记录
        this.pizarrac.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (Georradar.this.chivozoom != 16) {
                    return true;
                }
                switch (motionEvent.getAction()) {
                    case 0:
                        Georradar.this.mcx = motionEvent.getX(0);
                        Georradar.this.mcy = motionEvent.getY(0);
                        return true;
                    case 1:
                        float x = motionEvent.getX(0);
                        float y = motionEvent.getY(0);
                        Georradar.this.mcx = x;
                        Georradar.this.mcy = y;
                        return true;
                    case 2:
                        float x2 = motionEvent.getX(0);
                        float y2 = motionEvent.getY(0);
                        Georradar georradar = Georradar.this;
                        double d = georradar.alturamodif;
                        double d2 = (double) (y2 - Georradar.this.mcy);
                        Double.isNaN(d2);
                        georradar.alturamodif = d + (d2 * 0.1d);
                        Georradar.this.dibujareglahip();
                        Georradar.this.mcx = x2;
                        Georradar.this.mcy = y2;
                        return true;
                    default:
                        return true;
                }
            }
        });
        //设置控件是否可见
        ocultar();
        //色域
        coloracion();

        ((RelativeLayout) findViewById(R.id.idlectura)).setVisibility(0);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.archivoelegido2 = extras.getString("salida");
            this.directorioelegido = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Abakal/GPR";

            if (this.archivoelegido2 != null) {
                if (!this.archivoelegido2.equals("vacio")) {
                    mostrar();
                    ((ImageView) findViewById(R.id.imageView2)).setVisibility(0);
                    ((RelativeLayout) findViewById(R.id.idlectura)).setVisibility(4);
                }
                new Handler().postDelayed(new Runnable() {
                    /* class com.nieto.luis.gpr.Georradar.AnonymousClass4 */

                    public void run() {
                        Georradar.this.estarter();
                    }
                }, 500);
            }
        }
        ((TextView) findViewById(R.id.textView10)).setText("--><--");
    }

    @TargetApi(23)
    private boolean checkAndRequestPermissions() {
        int checkSelfPermission = ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE");
        int checkSelfPermission2 = ContextCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE");
        int checkSelfPermission3 = ContextCompat.checkSelfPermission(this, "android.permission.INTERNET");
        int checkSelfPermission4 = ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_NETWORK_STATE");
        int checkSelfPermission5 = ContextCompat.checkSelfPermission(this, "android.permission.WAKE_LOCK");
        ArrayList arrayList = new ArrayList();
        if (checkSelfPermission != 0) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        if (checkSelfPermission2 != 0) {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
        }
        if (checkSelfPermission3 != 0) {
            arrayList.add("android.permission.INTERNET");
        }
        if (checkSelfPermission4 != 0) {
            arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        }
        if (checkSelfPermission5 != 0) {
            arrayList.add("android.permission.WAKE_LOCK");
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 1);
        return false;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (checkAndRequestPermissions()) {
            Intent intent = new Intent(this, Georradar.class);
            intent.setFlags(67108864);
            intent.addFlags(268435456);
            startActivity(intent);
            return;
        }
        finish();
    }

    /* access modifiers changed from: package-private */
    public void valores0() {
        this.contraste = 1.0d;
        this.contraste2 = 1.0d;
        this.trunca = 1.0d;
        this.cerado = 0;
        this.chivoderi = 1;
        this.chivoderj = 1.0d;
        this.fondo = 0;
        this.der = 0;
        this.iz = 0;
        this.suavito = 0.0d;
        this.suavitoh = 0.0d;
        this.regladim = 0.1d;
        this.exponente = 1.0d;
        this.chivocolor = 1.0d;
        this.kfrec = 1.0d;
        this.patron = 1.0d;
        this.fouri = 10.0d;
        this.chivozoom = 0;
        this.chivobn = 0;
        this.chivatocolor = 0;
        this.sincentrar = true;
        this.sincentrar = true;
        this.sincentrar = true;
    }

    /**
     * 创建/Abakal/GPR/
     */
    public void leeidioma() {
        try {
            this.ruta_fotos = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Abakal/GPR/";
            this.root = new File(this.ruta_fotos);
            this.root.mkdirs();
            FileReader fileReader = new FileReader(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Abakal/GPR/idioma.txt");
            this.nidioma = (int) cuantoes(new BufferedReader(fileReader).readLine());
            iniciaidioma();
            fileReader.close();
        } catch (IOException unused) {
            Locale locale = Locale.getDefault();
            if (locale.getLanguage().equals("es")) {
                this.nidioma = 1;
            }
            if (locale.getLanguage().equals("en")) {
                this.nidioma = 2;
            }
            if (locale.getLanguage().equals("fr")) {
                this.nidioma = 3;
            }
            guardaidioma();
        }
    }

    /* access modifiers changed from: package-private */
    public void guardaidioma() {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Abakal/GPR/idioma.txt")));
            outputStreamWriter.write(Integer.toString(this.nidioma));
            outputStreamWriter.close();
        } catch (Exception unused) {
            String str = "";
            final WebView webView = (WebView) findViewById(R.id.editText);
            this.htmlint = "<!DOCTYPE html><html>\n<head><meta http-equiv=\"Content-type\" content=\"text/html;charset=UTF-8\"><style>body{ text-align: left;padding-right: 10px;padding-left: 10px;font-family: monospace;font-size: 20px;}h1{font-size:30px;}</style></head>" + "<body bgcolor=\"#ffdfb7\"><h1>" + str + "</h1></body></html>";
            webView.loadData(this.htmlint, "text/html; charset=UTF-8", null);
            webView.reload();
            webView.getSettings().setLoadWithOverviewMode(true);
            webView.getSettings().setUseWideViewPort(true);
            new Handler().postDelayed(new Runnable() {
                /* class com.nieto.luis.gpr.Georradar.AnonymousClass5 */

                public void run() {
                    webView.loadDataWithBaseURL("", Georradar.this.htmlint, "text/html", "UTF-8", null);
                }
            }, 1000);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(false);
            if (this.nidioma == 1) {
                str = "Error de lectura";
            }
            if (this.nidioma == 2) {
                str = "Read error";
            }
            if (this.nidioma == 3) {
                str = "Erreur de lecture";
            }
            builder.setTitle(str);
            TextView textView = new TextView(this);
            builder.setView(textView);
            if (this.nidioma == 1) {
                str = "  Error: Revise permisos de lectura / escritura.";
            }
            if (this.nidioma == 2) {
                str = "  Error: Check read / write permissions.";
            }
            if (this.nidioma == 3) {
                str = "  Erreur: Check autorisations de lecture / écriture du fichier.";
            }
            textView.setText(str);
            if (this.nidioma == 1) {
                str = "Aceptar";
            }
            if (this.nidioma == 2) {
                str = "OK";
            }
            if (this.nidioma == 3) {
                str = "Accepter";
            }
            builder.setPositiveButton(str, new DialogInterface.OnClickListener() {
                /* class com.nieto.luis.gpr.Georradar.AnonymousClass6 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    Georradar.this.finish();
                }
            });
            builder.show();
        }
        iniciaidioma();
    }

    public void idioma(View view) {
        switch (this.nidioma) {
            case 1:
                this.nidioma = 2;
                Toast.makeText(getApplicationContext(), "Changed the language", 0).show();
                guardaidioma();
                return;
            case 2:
                this.nidioma = 3;
                Toast.makeText(getApplicationContext(), "Changement de la langue", 0).show();
                guardaidioma();
                return;
            case 3:
                this.nidioma = 1;
                Toast.makeText(getApplicationContext(), "Cambiado el idioma", 0).show();
                guardaidioma();
                return;
            default:
                return;
        }
    }

    public void menosea(View view) {
        double d;
        double d2;
        double d3;
        double d4;
        ((ImageView) findViewById(R.id.imageView6)).setVisibility(4);
        if (this.chivozoom == 0) {
            float scaleX = this.pizarra.getScaleX();
            float scaleY = this.pizarra.getScaleY();
            if (scaleX > 1.0f && scaleY > 1.0f) {
                this.pizarra.setScaleX(scaleX - 1.0f);
                this.pizarra.setScaleY(scaleY - 1.0f);
            } else {
                return;
            }
        }
        if (this.chivozoom == 1) {
            this.contraste *= 1.25d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(1.0d / this.contraste));
            dibujaganado();
        }
        if (this.chivozoom == 6) {
            this.contraste2 *= 0.75d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.contraste2));
            dibujaganado2();
        }
        if (this.chivozoom == 2) {
            this.trunca *= 0.75d;
            if (this.trunca < 1.0d) {
                this.trunca = 0.9d;
                Toast.makeText(getApplicationContext(), this.lidioma[this.nidioma][4], 0).show();
            }
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.trunca));
            dibujacentrado();
        }
        if (this.chivozoom == 3) {
            this.cerado -= 5;
            if (this.cerado < 0) {
                this.cerado = 0;
                Toast.makeText(getApplicationContext(), this.lidioma[this.nidioma][5], 0).show();
            }
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format((long) this.cerado));
            double d5 = this.TIMEWINDOW;
            double d6 = (double) this.SAMPLES;
            Double.isNaN(d6);
            double d7 = d5 / d6;
            double d8 = (double) ((this.SAMPLES - this.cerado) - this.fondo);
            Double.isNaN(d8);
            this.TIMEWINDOW2 = d7 * d8;
            dibujacerado();
        }
        if (this.chivozoom == 4) {
            this.chivoderi--;
            if (this.chivoderi < 0) {
                this.chivoderi = 0;
                Toast.makeText(getApplicationContext(), this.lidioma[this.nidioma][6], 0).show();
            }
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format((long) this.chivoderi));
            dibujaderideri();
        }
        if (this.chivozoom == 5) {
            this.chivoderj *= 0.75d;
            if (this.chivoderj < 0.0d) {
                this.chivoderj = 0.0d;
                Toast.makeText(getApplicationContext(), this.lidioma[this.nidioma][7], 0).show();
            }
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.chivoderj));
            dibujaderiderj();
        }
        if (this.chivozoom == 7) {
            this.fondo--;
            if (this.fondo < 0) {
                this.fondo = 0;
                Toast.makeText(getApplicationContext(), this.lidioma[this.nidioma][8], 0).show();
            }
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format((long) this.fondo));
            double d9 = this.TIMEWINDOW;
            double d10 = (double) this.SAMPLES;
            Double.isNaN(d10);
            double d11 = d9 / d10;
            double d12 = (double) ((this.SAMPLES - this.cerado) - this.fondo);
            Double.isNaN(d12);
            this.TIMEWINDOW2 = d11 * d12;
            dibujafondo();
        }
        if (this.chivozoom == 8) {
            this.der--;
            if (this.der < 0) {
                this.der = 0;
                Toast.makeText(getApplicationContext(), this.lidioma[this.nidioma][9], 0).show();
            }
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format((long) this.der));
            dibujafondo();
        }
        if (this.chivozoom == 9) {
            this.iz--;
            if (this.iz < 0) {
                this.iz = 0;
                Toast.makeText(getApplicationContext(), this.lidioma[this.nidioma][10], 0).show();
            }
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format((long) this.iz));
            dibujaiz();
        }
        if (this.chivozoom == 10) {
            this.suavito = (double) ((int) (this.suavito / 2.0d));
            if (this.suavito < 1.0d) {
                this.suavito = 1.0d;
            }
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.suavito));
            dibujasuave();
        }
        if (this.chivozoom == 18) {
            this.suavitoh = (double) ((int) (this.suavitoh / 2.0d));
            if (this.suavitoh < 1.0d) {
                this.suavitoh = 1.0d;
            }
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.suavitoh));
            dibujasuaveh();
        }
        if (this.chivozoom == 11) {
            double d13 = (double) this.divi;
            Double.isNaN(d13);
            double d14 = (double) this.col2;
            Double.isNaN(d14);
            double d15 = (d13 * 100.0d) + d14;
            double d16 = (double) this.divi;
            Double.isNaN(d16);
            double d17 = (double) this.SAMPLES2;
            Double.isNaN(d17);
            double d18 = d15 / ((d16 * 70.0d) + d17);
            double width = (double) this.pizarra.getWidth();
            Double.isNaN(width);
            double height = (double) this.pizarra.getHeight();
            Double.isNaN(height);
            if (d18 > (width + 1.0E-5d) / (height + 1.0E-5d)) {
                double d19 = (double) (((float) this.col2) + (this.divi * 99.0f));
                double d20 = (double) this.SAMPLES2;
                double d21 = (double) this.divi;
                Double.isNaN(d21);
                Double.isNaN(d20);
                Double.isNaN(d19);
                double d22 = d19 / (d20 + (d21 * 70.0d));
                double width2 = (double) this.pizarra.getWidth();
                Double.isNaN(width2);
                double d23 = d22 / width2;
                double height2 = (double) this.pizarra.getHeight();
                Double.isNaN(height2);
                d4 = height2 * d23;
            } else {
                d4 = 1.0d;
            }
            double d24 = (double) this.SAMPLES2;
            Double.isNaN(d24);
            double sqrt = ((d24 * 0.005d) / this.TIMEWINDOW2) / ((2.99792458E8d / Math.sqrt(this.refraccion)) / 2.0E9d);
            double scaleY2 = (double) this.pizarra.getScaleY();
            Double.isNaN(scaleY2);
            int height3 = this.canvasb.getHeight() / 2;
            this.pizarra.scrollTo(this.pizarra.getScrollX(), this.pizarra.getScrollY() - ((int) ((sqrt * scaleY2) / d4)));
            this.regladim -= 0.01d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.regladim));
            dibujaregla();
        }
        if (this.chivozoom == 15) {
            double d25 = (double) this.divi;
            Double.isNaN(d25);
            double d26 = (double) this.col2;
            Double.isNaN(d26);
            double d27 = (d25 * 100.0d) + d26;
            double d28 = (double) this.divi;
            Double.isNaN(d28);
            double d29 = (double) this.SAMPLES2;
            Double.isNaN(d29);
            double d30 = d27 / ((d28 * 70.0d) + d29);
            double width3 = (double) this.pizarra.getWidth();
            Double.isNaN(width3);
            double height4 = (double) this.pizarra.getHeight();
            Double.isNaN(height4);
            if (d30 > (width3 + 1.0E-5d) / (height4 + 1.0E-5d)) {
                double d31 = (double) (((float) this.col2) + (this.divi * 99.0f));
                double d32 = (double) this.SAMPLES2;
                double d33 = (double) this.divi;
                Double.isNaN(d33);
                Double.isNaN(d32);
                Double.isNaN(d31);
                double d34 = d31 / (d32 + (d33 * 70.0d));
                double width4 = (double) this.pizarra.getWidth();
                Double.isNaN(width4);
                double d35 = d34 / width4;
                double height5 = (double) this.pizarra.getHeight();
                Double.isNaN(height5);
                d3 = height5 * d35;
            } else {
                d3 = 1.0d;
            }
            double d36 = (double) this.SAMPLES2;
            Double.isNaN(d36);
            double sqrt2 = ((d36 * 0.005d) / this.TIMEWINDOW2) / ((2.99792458E8d / Math.sqrt(this.refraccion)) / 2.0E9d);
            double scaleY3 = (double) this.pizarra.getScaleY();
            Double.isNaN(scaleY3);
            int height6 = this.canvasb.getHeight() / 2;
            this.pizarra.scrollTo(this.pizarra.getScrollX(), this.pizarra.getScrollY() - ((int) ((sqrt2 * scaleY3) / d3)));
            this.regladim -= 0.01d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.regladim));
            dibujareglacua();
        }
        if (this.chivozoom == 16) {
            double d37 = (double) this.divi;
            Double.isNaN(d37);
            double d38 = (double) this.col2;
            Double.isNaN(d38);
            double d39 = (d37 * 100.0d) + d38;
            double d40 = (double) this.divi;
            Double.isNaN(d40);
            double d41 = (double) this.SAMPLES2;
            Double.isNaN(d41);
            double d42 = d39 / ((d40 * 70.0d) + d41);
            double width5 = (double) this.pizarra.getWidth();
            Double.isNaN(width5);
            double height7 = (double) this.pizarra.getHeight();
            Double.isNaN(height7);
            if (d42 > (width5 + 1.0E-5d) / (height7 + 1.0E-5d)) {
                double d43 = (double) (((float) this.col2) + (this.divi * 99.0f));
                double d44 = (double) this.SAMPLES2;
                double d45 = (double) this.divi;
                Double.isNaN(d45);
                Double.isNaN(d44);
                Double.isNaN(d43);
                double d46 = d43 / (d44 + (d45 * 70.0d));
                double width6 = (double) this.pizarra.getWidth();
                Double.isNaN(width6);
                double d47 = d46 / width6;
                double height8 = (double) this.pizarra.getHeight();
                Double.isNaN(height8);
                d2 = height8 * d47;
            } else {
                d2 = 1.0d;
            }
            double d48 = (double) this.SAMPLES2;
            Double.isNaN(d48);
            double sqrt3 = ((d48 * 0.005d) / this.TIMEWINDOW2) / ((2.99792458E8d / Math.sqrt(this.refraccion)) / 2.0E9d);
            double scaleY4 = (double) this.pizarra.getScaleY();
            Double.isNaN(scaleY4);
            int height9 = this.canvasb.getHeight() / 2;
            this.pizarra.scrollTo(this.pizarra.getScrollX(), this.pizarra.getScrollY() - ((int) ((sqrt3 * scaleY4) / d2)));
            this.regladim -= 0.01d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.regladim));
            dibujareglahip();
        }
        if (this.chivozoom == 17) {
            double d49 = (double) this.divi;
            Double.isNaN(d49);
            double d50 = (double) this.col2;
            Double.isNaN(d50);
            double d51 = (d49 * 100.0d) + d50;
            double d52 = (double) this.divi;
            Double.isNaN(d52);
            double d53 = (double) this.SAMPLES2;
            Double.isNaN(d53);
            double d54 = d51 / ((d52 * 70.0d) + d53);
            double width7 = (double) this.pizarra.getWidth();
            Double.isNaN(width7);
            double height10 = (double) this.pizarra.getHeight();
            Double.isNaN(height10);
            if (d54 > (width7 + 1.0E-5d) / (height10 + 1.0E-5d)) {
                double d55 = (double) (((float) this.col2) + (this.divi * 99.0f));
                double d56 = (double) this.SAMPLES2;
                double d57 = (double) this.divi;
                Double.isNaN(d57);
                Double.isNaN(d56);
                Double.isNaN(d55);
                double d58 = d55 / (d56 + (d57 * 70.0d));
                double width8 = (double) this.pizarra.getWidth();
                Double.isNaN(width8);
                double d59 = d58 / width8;
                double height11 = (double) this.pizarra.getHeight();
                Double.isNaN(height11);
                d = height11 * d59;
            } else {
                d = 1.0d;
            }
            double d60 = (double) this.SAMPLES2;
            Double.isNaN(d60);
            double d61 = (d60 * 0.005d) / this.TIMEWINDOW2;
            double scaleY5 = (double) this.pizarra.getScaleY();
            Double.isNaN(scaleY5);
            double sqrt4 = ((d61 / ((2.99792458E8d / Math.sqrt(this.refraccion)) / 2.0E9d)) * scaleY5) / d;
            int height12 = this.canvasb.getHeight() / 2;
            this.pizarra.scrollTo(this.pizarra.getScrollX(), this.pizarra.getScrollY() - ((int) sqrt4));
            this.regladim -= 0.01d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.regladim));
            dibujareglapar();
        }
        if (this.chivozoom == 12) {
            this.exponente *= 0.75d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.exponente));
            dibujanorma();
        }
        if (this.chivozoom == 13) {
            this.chivocolor *= 2.0d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.chivocolor));
            coloracion2();
            dibuja();
            fondobn();
        }
        if (this.chivozoom == 14) {
            this.kfrec *= 0.75d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.kfrec));
            dibufrec();
        }
        if (this.chivozoom == 19) {
            this.patron *= 0.5d;
            if (this.patron < 1.0d) {
                this.patron = 1.0d;
            }
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.patron));
            dibupatron();
        }
        if (this.chivozoom == 20) {
            this.fouri -= 1.0d;
            if (this.fouri < 2.0d) {
                this.fouri = 2.0d;
            }
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.fouri));
            dibufou();
        }
    }

    public void masosea(View view) {
        double d;
        double d2;
        double d3;
        double d4;
        ((ImageView) findViewById(R.id.imageView6)).setVisibility(4);
        if (this.chivozoom == 0) {
            float scaleX = this.pizarra.getScaleX();
            float scaleY = this.pizarra.getScaleY();
            this.pizarra.setScaleX(scaleX + 1.0f);
            this.pizarra.setScaleY(scaleY + 1.0f);
        }
        if (this.chivozoom == 1) {
            this.contraste *= 0.5d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(1.0d / this.contraste));
            dibujaganado();
        }
        if (this.chivozoom == 6) {
            this.contraste2 *= 2.0d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.contraste2));
            dibujaganado2();
        }
        if (this.chivozoom == 2) {
            this.trunca *= 2.0d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.trunca));
            dibujacentrado();
        }
        if (this.chivozoom == 3) {
            this.cerado++;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format((long) this.cerado));
            double d5 = this.TIMEWINDOW;
            double d6 = (double) this.SAMPLES;
            Double.isNaN(d6);
            double d7 = d5 / d6;
            double d8 = (double) ((this.SAMPLES - this.cerado) - this.fondo);
            Double.isNaN(d8);
            this.TIMEWINDOW2 = d7 * d8;
            dibujacerado();
        }
        if (this.chivozoom == 4) {
            this.chivoderi++;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format((long) this.chivoderi));
            dibujaderideri();
        }
        if (this.chivozoom == 5) {
            this.chivoderj *= 1.5d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.chivoderj));
            dibujaderiderj();
        }
        if (this.chivozoom == 7) {
            this.fondo += 10;
            if ((this.SAMPLES - this.cerado) - this.fondo < 0) {
                this.fondo = (this.SAMPLES - this.cerado) + 10;
                Toast.makeText(getApplicationContext(), this.lidioma[this.nidioma][11], 0).show();
            }
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format((long) this.fondo));
            double d9 = this.TIMEWINDOW;
            double d10 = (double) this.SAMPLES;
            Double.isNaN(d10);
            double d11 = d9 / d10;
            double d12 = (double) ((this.SAMPLES - this.cerado) - this.fondo);
            Double.isNaN(d12);
            this.TIMEWINDOW2 = d11 * d12;
            dibujafondo();
        }
        if (this.chivozoom == 8) {
            this.der += 10;
            if ((this.col - this.iz) - this.der < 0) {
                this.der = (this.col - this.iz) + 10;
                Toast.makeText(getApplicationContext(), this.lidioma[this.nidioma][11], 0).show();
            }
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format((long) this.der));
            dibujafondo();
        }
        if (this.chivozoom == 9) {
            this.iz += 10;
            if ((this.col - this.iz) - this.der < 0) {
                this.iz = (this.col - this.der) + 10;
                Toast.makeText(getApplicationContext(), this.lidioma[this.nidioma][11], 0).show();
            }
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format((long) this.iz));
            dibujaiz();
        }
        if (this.chivozoom == 10) {
            this.suavito *= 2.0d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.suavito));
            dibujasuave();
        }
        if (this.chivozoom == 18) {
            this.suavitoh *= 2.0d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.suavitoh));
            dibujasuaveh();
        }
        if (this.chivozoom == 11) {
            double d13 = (double) this.divi;
            Double.isNaN(d13);
            double d14 = (double) this.col2;
            Double.isNaN(d14);
            double d15 = (d13 * 100.0d) + d14;
            double d16 = (double) this.divi;
            Double.isNaN(d16);
            double d17 = (double) this.SAMPLES2;
            Double.isNaN(d17);
            double d18 = d15 / ((d16 * 70.0d) + d17);
            double width = (double) this.pizarra.getWidth();
            Double.isNaN(width);
            double height = (double) this.pizarra.getHeight();
            Double.isNaN(height);
            if (d18 > (width + 1.0E-5d) / (height + 1.0E-5d)) {
                double d19 = (double) (((float) this.col2) + (this.divi * 99.0f));
                double d20 = (double) this.SAMPLES2;
                double d21 = (double) this.divi;
                Double.isNaN(d21);
                Double.isNaN(d20);
                Double.isNaN(d19);
                double d22 = d19 / (d20 + (d21 * 70.0d));
                double width2 = (double) this.pizarra.getWidth();
                Double.isNaN(width2);
                double d23 = d22 / width2;
                double height2 = (double) this.pizarra.getHeight();
                Double.isNaN(height2);
                d4 = d23 * height2;
            } else {
                d4 = 1.0d;
            }
            double d24 = (double) this.SAMPLES2;
            Double.isNaN(d24);
            double sqrt = ((d24 * 0.025d) / this.TIMEWINDOW2) / ((2.99792458E8d / Math.sqrt(this.refraccion)) / 2.0E9d);
            double scaleY2 = (double) this.pizarra.getScaleY();
            Double.isNaN(scaleY2);
            int height3 = this.canvasb.getHeight() / 2;
            this.pizarra.scrollTo(this.pizarra.getScrollX(), this.pizarra.getScrollY() + ((int) ((sqrt * scaleY2) / d4)));
            this.regladim += 0.05d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.regladim));
            dibujaregla();
        }
        if (this.chivozoom == 15) {
            double d25 = (double) this.divi;
            Double.isNaN(d25);
            double d26 = (double) this.col2;
            Double.isNaN(d26);
            double d27 = (d25 * 100.0d) + d26;
            double d28 = (double) this.divi;
            Double.isNaN(d28);
            double d29 = (double) this.SAMPLES2;
            Double.isNaN(d29);
            double d30 = d27 / ((d28 * 70.0d) + d29);
            double width3 = (double) this.pizarra.getWidth();
            Double.isNaN(width3);
            double height4 = (double) this.pizarra.getHeight();
            Double.isNaN(height4);
            if (d30 > (width3 + 1.0E-5d) / (height4 + 1.0E-5d)) {
                double d31 = (double) (((float) this.col2) + (this.divi * 99.0f));
                double d32 = (double) this.SAMPLES2;
                double d33 = (double) this.divi;
                Double.isNaN(d33);
                Double.isNaN(d32);
                Double.isNaN(d31);
                double d34 = d31 / (d32 + (d33 * 70.0d));
                double width4 = (double) this.pizarra.getWidth();
                Double.isNaN(width4);
                double d35 = d34 / width4;
                double height5 = (double) this.pizarra.getHeight();
                Double.isNaN(height5);
                d3 = d35 * height5;
            } else {
                d3 = 1.0d;
            }
            double d36 = (double) this.SAMPLES2;
            Double.isNaN(d36);
            double sqrt2 = ((d36 * 0.025d) / this.TIMEWINDOW2) / ((2.99792458E8d / Math.sqrt(this.refraccion)) / 2.0E9d);
            double scaleY3 = (double) this.pizarra.getScaleY();
            Double.isNaN(scaleY3);
            int height6 = this.canvasb.getHeight() / 2;
            this.pizarra.scrollTo(this.pizarra.getScrollX(), this.pizarra.getScrollY() + ((int) ((sqrt2 * scaleY3) / d3)));
            this.regladim += 0.05d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.regladim));
            dibujareglacua();
        }
        if (this.chivozoom == 16) {
            double d37 = (double) this.divi;
            Double.isNaN(d37);
            double d38 = (double) this.col2;
            Double.isNaN(d38);
            double d39 = (d37 * 100.0d) + d38;
            double d40 = (double) this.divi;
            Double.isNaN(d40);
            double d41 = (double) this.SAMPLES2;
            Double.isNaN(d41);
            double d42 = d39 / ((d40 * 70.0d) + d41);
            double width5 = (double) this.pizarra.getWidth();
            Double.isNaN(width5);
            double height7 = (double) this.pizarra.getHeight();
            Double.isNaN(height7);
            if (d42 > (width5 + 1.0E-5d) / (height7 + 1.0E-5d)) {
                double d43 = (double) (((float) this.col2) + (this.divi * 99.0f));
                double d44 = (double) this.SAMPLES2;
                double d45 = (double) this.divi;
                Double.isNaN(d45);
                Double.isNaN(d44);
                Double.isNaN(d43);
                double d46 = d43 / (d44 + (d45 * 70.0d));
                double width6 = (double) this.pizarra.getWidth();
                Double.isNaN(width6);
                double d47 = d46 / width6;
                double height8 = (double) this.pizarra.getHeight();
                Double.isNaN(height8);
                d2 = d47 * height8;
            } else {
                d2 = 1.0d;
            }
            double d48 = (double) this.SAMPLES2;
            Double.isNaN(d48);
            double sqrt3 = ((d48 * 0.025d) / this.TIMEWINDOW2) / ((2.99792458E8d / Math.sqrt(this.refraccion)) / 2.0E9d);
            double scaleY4 = (double) this.pizarra.getScaleY();
            Double.isNaN(scaleY4);
            int height9 = this.canvasb.getHeight() / 2;
            this.pizarra.scrollTo(this.pizarra.getScrollX(), this.pizarra.getScrollY() + ((int) ((sqrt3 * scaleY4) / d2)));
            this.regladim += 0.05d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.regladim));
            dibujareglahip();
        }
        if (this.chivozoom == 17) {
            double d49 = (double) this.divi;
            Double.isNaN(d49);
            double d50 = (double) this.col2;
            Double.isNaN(d50);
            double d51 = (d49 * 100.0d) + d50;
            double d52 = (double) this.divi;
            Double.isNaN(d52);
            double d53 = (double) this.SAMPLES2;
            Double.isNaN(d53);
            double d54 = d51 / ((d52 * 70.0d) + d53);
            double width7 = (double) this.pizarra.getWidth();
            Double.isNaN(width7);
            double height10 = (double) this.pizarra.getHeight();
            Double.isNaN(height10);
            if (d54 > (width7 + 1.0E-5d) / (height10 + 1.0E-5d)) {
                double d55 = (double) (((float) this.col2) + (this.divi * 99.0f));
                double d56 = (double) this.SAMPLES2;
                double d57 = (double) this.divi;
                Double.isNaN(d57);
                Double.isNaN(d56);
                Double.isNaN(d55);
                double d58 = d55 / (d56 + (d57 * 70.0d));
                double width8 = (double) this.pizarra.getWidth();
                Double.isNaN(width8);
                double d59 = d58 / width8;
                double height11 = (double) this.pizarra.getHeight();
                Double.isNaN(height11);
                d = height11 * d59;
            } else {
                d = 1.0d;
            }
            double d60 = (double) this.SAMPLES2;
            Double.isNaN(d60);
            double d61 = (d60 * 0.0025d) / this.TIMEWINDOW2;
            double scaleY5 = (double) this.pizarra.getScaleY();
            Double.isNaN(scaleY5);
            int height12 = this.canvasb.getHeight() / 2;
            this.pizarra.scrollTo(this.pizarra.getScrollX(), this.pizarra.getScrollY() + ((int) (((d61 / ((2.99792458E8d / Math.sqrt(this.refraccion)) / 2.0E9d)) * scaleY5) / d)));
            this.regladim += 0.05d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.regladim));
            dibujareglapar();
        }
        if (this.chivozoom == 12) {
            this.exponente *= 2.0d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.exponente));
            dibujanorma();
        }
        if (this.chivozoom == 13) {
            this.chivocolor *= 0.5d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.chivocolor));
            coloracion2();
            dibuja();
            fondobn();
        }
        if (this.chivozoom == 14) {
            this.kfrec *= 1.5d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.kfrec));
            dibufrec();
        }
        if (this.chivozoom == 19) {
            this.patron *= 2.0d;
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.patron));
            dibupatron();
        }
        if (this.chivozoom == 20) {
            this.fouri += 4.0d;
            if (this.fouri > ((double) this.blockSize)) {
                this.fouri = (double) this.blockSize;
            }
            ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.fouri));
            dibufou();
        }
    }

    public void osea(View view) {
        ((ImageView) findViewById(R.id.imageView6)).setVisibility(4);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if (this.chivozoom == 2) {
            builder.setTitle(this.lidioma[this.nidioma][14]);
        }
        if (this.chivozoom == 1) {
            builder.setTitle(this.lidioma[this.nidioma][15]);
        }
        if (this.chivozoom == 3) {
            builder.setTitle(this.lidioma[this.nidioma][16]);
        }
        if (this.chivozoom == 4) {
            builder.setTitle(this.lidioma[this.nidioma][17]);
        }
        if (this.chivozoom == 5) {
            builder.setTitle(this.lidioma[this.nidioma][18]);
        }
        if (this.chivozoom == 6) {
            builder.setTitle(this.lidioma[this.nidioma][19]);
        }
        if (this.chivozoom == 7) {
            builder.setTitle(this.lidioma[this.nidioma][20]);
        }
        if (this.chivozoom == 8) {
            builder.setTitle(this.lidioma[this.nidioma][21]);
        }
        if (this.chivozoom == 9) {
            builder.setTitle(this.lidioma[this.nidioma][22]);
        }
        if (this.chivozoom == 10) {
            builder.setTitle(this.lidioma[this.nidioma][23]);
        }
        if (this.chivozoom == 11) {
            builder.setTitle(this.lidioma[this.nidioma][24]);
        }
        if (this.chivozoom == 15) {
            builder.setTitle(this.lidioma[this.nidioma][24]);
        }
        if (this.chivozoom == 16) {
            builder.setTitle(this.lidioma[this.nidioma][24]);
        }
        if (this.chivozoom == 17) {
            builder.setTitle(this.lidioma[this.nidioma][24]);
        }
        if (this.chivozoom == 12) {
            builder.setTitle(this.lidioma[this.nidioma][24]);
        }
        if (this.chivozoom == 13) {
            builder.setTitle(this.lidioma[this.nidioma][25]);
        }
        if (this.chivozoom == 14) {
            builder.setTitle(this.lidioma[this.nidioma][26]);
        }
        if (this.chivozoom == 19) {
            builder.setTitle(this.lidioma[this.nidioma][24]);
        }
        if (this.chivozoom == 20) {
            builder.setTitle(this.lidioma[this.nidioma][24]);
        }
        final EditText editText = new EditText(this);
        builder.setView(editText);
        if (this.chivozoom == 2) {
            editText.setText(this.nF00.format(this.trunca).replace(",", "."));
        }
        if (this.chivozoom == 1) {
            editText.setText(this.nF00.format(1.0d / this.contraste).replace(",", "."));
        }
        if (this.chivozoom == 3) {
            editText.setText(Integer.toString(this.cerado));
        }
        if (this.chivozoom == 4) {
            editText.setText(Integer.toString(this.chivoderi));
        }
        if (this.chivozoom == 5) {
            editText.setText(this.nF00.format(this.chivoderj));
        }
        if (this.chivozoom == 6) {
            editText.setText(this.nF00.format(this.contraste2).replace(",", "."));
        }
        if (this.chivozoom == 7) {
            editText.setText(Integer.toString(this.fondo));
        }
        if (this.chivozoom == 8) {
            editText.setText(Integer.toString(this.der));
        }
        if (this.chivozoom == 9) {
            editText.setText(Integer.toString(this.iz));
        }
        if (this.chivozoom == 10) {
            editText.setText(this.nF00.format(this.suavito).replace(",", "."));
        }
        if (this.chivozoom == 18) {
            editText.setText(this.nF00.format(this.suavitoh).replace(",", "."));
        }
        if (this.chivozoom == 11) {
            editText.setText(this.nF00.format(this.regladim).replace(",", "."));
        }
        if (this.chivozoom == 15) {
            editText.setText(this.nF00.format(this.regladim).replace(",", "."));
        }
        if (this.chivozoom == 16) {
            editText.setText(this.nF00.format(this.regladim).replace(",", "."));
        }
        if (this.chivozoom == 17) {
            editText.setText(this.nF00.format(this.regladim).replace(",", "."));
        }
        if (this.chivozoom == 12) {
            editText.setText(this.nF00.format(this.exponente).replace(",", "."));
        }
        if (this.chivozoom == 13) {
            editText.setText(this.nF00.format(this.chivocolor).replace(",", "."));
        }
        if (this.chivozoom == 14) {
            editText.setText(this.nF00.format(this.kfrec).replace(",", "."));
        }
        if (this.chivozoom == 19) {
            editText.setText(Integer.toString((int) this.patron));
        }
        if (this.chivozoom == 20) {
            editText.setText(Integer.toString((int) this.fouri));
        }
        editText.setInputType(12290);
        builder.setPositiveButton("Modificar", new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass7 */

            public void onClick(DialogInterface dialogInterface, int i) {
                double cuantoes = Georradar.this.cuantoes(editText.getText().toString());
                if (cuantoes >= 0.0d) {
                    if (Georradar.this.chivozoom == 2) {
                        Georradar.this.trunca = cuantoes;
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(cuantoes));
                        Georradar.this.dibujacentrado();
                    }
                    if (Georradar.this.chivozoom == 1) {
                        Georradar.this.contraste = 1.0d / cuantoes;
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(cuantoes));
                        Georradar.this.dibujaganado();
                    }
                    if (Georradar.this.chivozoom == 6) {
                        Georradar.this.contraste2 = cuantoes;
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.contraste2));
                        Georradar.this.dibujaganado2();
                    }
                    if (Georradar.this.chivozoom == 4) {
                        Georradar.this.chivoderi = (int) cuantoes;
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format((long) Georradar.this.chivoderi));
                        Georradar.this.dibujaderideri();
                    }
                    if (Georradar.this.chivozoom == 5) {
                        Georradar.this.chivoderj = cuantoes;
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.chivoderj));
                        Georradar.this.dibujaderiderj();
                    }
                    if (Georradar.this.chivozoom == 3) {
                        Georradar.this.cerado = (int) cuantoes;
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format((long) Georradar.this.cerado));
                        Georradar georradar = Georradar.this;
                        double d = Georradar.this.TIMEWINDOW;
                        double d2 = (double) Georradar.this.SAMPLES;
                        Double.isNaN(d2);
                        double d3 = d / d2;
                        double d4 = (double) ((Georradar.this.SAMPLES - Georradar.this.cerado) - Georradar.this.fondo);
                        Double.isNaN(d4);
                        georradar.TIMEWINDOW2 = d3 * d4;
                        Georradar.this.dibujacerado();
                    }
                    if (Georradar.this.chivozoom == 7) {
                        Georradar.this.fondo = (int) cuantoes;
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format((long) Georradar.this.fondo));
                        Georradar georradar2 = Georradar.this;
                        double d5 = Georradar.this.TIMEWINDOW;
                        double d6 = (double) Georradar.this.SAMPLES;
                        Double.isNaN(d6);
                        double d7 = d5 / d6;
                        double d8 = (double) ((Georradar.this.SAMPLES - Georradar.this.cerado) - Georradar.this.fondo);
                        Double.isNaN(d8);
                        georradar2.TIMEWINDOW2 = d7 * d8;
                        Georradar.this.dibujafondo();
                    }
                    if (Georradar.this.chivozoom == 8) {
                        Georradar.this.der = (int) cuantoes;
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format((long) Georradar.this.der));
                        Georradar.this.dibujafondo();
                    }
                    if (Georradar.this.chivozoom == 9) {
                        Georradar.this.iz = (int) cuantoes;
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format((long) Georradar.this.iz));
                        Georradar.this.dibujaiz();
                    }
                    if (Georradar.this.chivozoom == 10) {
                        Georradar.this.suavito = (double) ((int) Math.max(1.0d, cuantoes));
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.suavito));
                        Georradar.this.dibujasuave();
                    }
                    if (Georradar.this.chivozoom == 18) {
                        Georradar.this.suavitoh = (double) ((int) Math.max(1.0d, cuantoes));
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.suavitoh));
                        Georradar.this.dibujasuaveh();
                    }
                    if (Georradar.this.chivozoom == 11) {
                        Georradar.this.regladim = cuantoes;
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.regladim));
                        Georradar.this.dibujaregla();
                    }
                    if (Georradar.this.chivozoom == 15) {
                        Georradar.this.regladim = cuantoes;
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.regladim));
                        Georradar.this.dibujareglacua();
                    }
                    if (Georradar.this.chivozoom == 16) {
                        Georradar.this.regladim = cuantoes;
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.regladim));
                        Georradar.this.dibujareglahip();
                    }
                    if (Georradar.this.chivozoom == 17) {
                        Georradar.this.regladim = cuantoes;
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.regladim));
                        Georradar.this.dibujareglapar();
                    }
                    if (Georradar.this.chivozoom == 12) {
                        Georradar.this.exponente = cuantoes;
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(cuantoes));
                        Georradar.this.dibujanorma();
                    }
                    if (Georradar.this.chivozoom == 13) {
                        Georradar.this.chivocolor = cuantoes;
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(cuantoes));
                        Georradar.this.coloracion2();
                        Georradar.this.dibuja();
                        Georradar.this.fondobn();
                    }
                    if (Georradar.this.chivozoom == 14) {
                        Georradar.this.kfrec = cuantoes;
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(cuantoes));
                        Georradar.this.dibufrec();
                    }
                    if (Georradar.this.chivozoom == 19) {
                        Georradar.this.patron = (double) ((int) Math.max(1.0d, cuantoes));
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.patron));
                        Georradar.this.dibupatron();
                    }
                    if (Georradar.this.chivozoom == 20) {
                        Georradar.this.fouri = (double) ((int) Math.max(2.0d, Math.min((double) Georradar.this.blockSize, cuantoes)));
                        ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.fouri));
                        Georradar.this.dibufou();
                        return;
                    }
                    return;
                }
                Toast.makeText(Georradar.this.getBaseContext(), Georradar.this.lidioma[Georradar.this.nidioma][27], 1).show();
            }
        });
        builder.setNegativeButton(this.lidioma[this.nidioma][56], new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass8 */

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.show();
    }

    public void oseaosea(View view) {
        double d;
        double d2;
        ((ImageView) findViewById(R.id.imageView6)).setVisibility(4);
        if (this.chivozoom == 11 || this.chivozoom == 15 || this.chivozoom == 16 || this.chivozoom == 17) {
            double d3 = (double) this.divi;
            Double.isNaN(d3);
            double d4 = this.posicionFX;
            double d5 = (double) this.divi;
            Double.isNaN(d5);
            double d6 = (d3 * 50.0d) + (d4 * d5);
            double d7 = this.posicionFY + 50.0d;
            double d8 = (double) this.divi;
            Double.isNaN(d8);
            double d9 = ((this.regladim / this.DISTANCE_INTERVAL) / 2.0d) * d8;
            double d10 = d6;
            double sqrt = this.regladim / ((2.99792458E8d / Math.sqrt(this.refraccion)) / 2.0E9d);
            double d11 = (double) this.SAMPLES2;
            Double.isNaN(d11);
            double d12 = ((sqrt * d11) / this.TIMEWINDOW2) / 2.0d;
            this.paint_n.setStrokeWidth(0.2f);
            if (this.chivozoom == 11 || this.chivozoom == 15) {
                this.paint_n.setColor(Color.argb(200, 255, 127, 0));
                this.paint_n.setStyle(Paint.Style.FILL);
                if (this.DISTANCE_INTERVAL != 0.0d) {
                    this.canvas.drawRect((float) (d10 - d9), (float) (d7 - d12), (float) (d10 + d9), (float) d7, this.paint_n);
                    d = d12;
                } else {
                    Canvas canvas2 = this.canvas;
                    double d13 = (double) this.divi;
                    Double.isNaN(d13);
                    double width = (double) this.cuadro.getWidth();
                    d = d12;
                    double d14 = (double) this.divi;
                    Double.isNaN(d14);
                    Double.isNaN(width);
                    canvas2.drawRect((float) (d13 * 50.0d), (float) (d7 - d12), (float) (width - (d14 * 50.0d)), (float) d7, this.paint_n);
                }
                this.paint_n.setColor(Color.argb(200, 0, 255, 0));
                if (this.DISTANCE_INTERVAL != 0.0d) {
                    this.canvas.drawRect((float) (d10 - d9), (float) (d7 + d), (float) (d10 + d9), (float) d7, this.paint_n);
                } else {
                    Canvas canvas3 = this.canvas;
                    double d15 = (double) this.divi;
                    Double.isNaN(d15);
                    double width2 = (double) this.cuadro.getWidth();
                    double d16 = (double) this.divi;
                    Double.isNaN(d16);
                    Double.isNaN(width2);
                    canvas3.drawRect((float) (d15 * 50.0d), (float) (d7 + d), (float) (width2 - (d16 * 50.0d)), (float) d7, this.paint_n);
                }
                if (this.DISTANCE_INTERVAL != 0.0d) {
                    this.paint_n.setColor(-16776961);
                    this.paint_n.setStrokeWidth((float) (Math.min(this.cuadro.getWidth(), this.cuadro.getHeight()) / 250));
                    this.paint_n.setStyle(Paint.Style.STROKE);
                    double d17 = 1.5d * d9;
                    float f = (float) (d10 - d17);
                    float f2 = (float) (d7 - d);
                    float f3 = (float) (d10 + d17);
                    this.canvas.drawRect(f, f2, f3, f2, this.paint_n);
                    float f4 = (float) (d7 + d);
                    this.canvas.drawRect(f, f4, f3, f4, this.paint_n);
                    float f5 = (float) (d10 - d9);
                    double d18 = d * 1.25d;
                    float f6 = (float) (d7 - d18);
                    float f7 = (float) (d18 + d7);
                    this.canvas.drawRect(f5, f6, f5, f7, this.paint_n);
                    float f8 = (float) (d10 + d9);
                    this.canvas.drawRect(f8, f6, f8, f7, this.paint_n);
                }
            } else {
                d = d12;
            }
            if (this.chivozoom == 11 || this.chivozoom == 16) {
                this.paint_n.setColor(Color.argb(100, 255, 127, 0));
                this.paint_n.setStyle(Paint.Style.FILL);
                if (this.DISTANCE_INTERVAL != 0.0d) {
                    RectF rectF = new RectF();
                    rectF.set((float) (d10 - d9), (float) (d7 - d), (float) (d10 + d9), (float) (d7 + d));
                    RectF rectF2 = rectF;
                    this.canvas.drawArc(rectF2, 180.0f, 180.0f, true, this.paint_n);
                    this.paint_n.setColor(Color.argb(200, 0, 255, 0));
                    this.canvas.drawArc(rectF2, 180.0f, -180.0f, true, this.paint_n);
                    this.paint_n.setColor(Color.argb(150, 0, 255, 255));
                    float f9 = this.divi;
                    double d19 = this.posicionFY;
                    double d20 = this.alturamodif;
                    float f10 = this.divi;
                    double d21 = (this.posicionFY - d) - this.alturamodif;
                    double d22 = d + d21;
                    double d23 = (d22 * d22) - (d21 * d21);
                    this.paint_n.setStrokeWidth((float) (Math.min(this.cuadro.getWidth(), this.cuadro.getHeight()) / 250));
                    this.paint_n.setStyle(Paint.Style.STROKE);
                    double d24 = -12.0d;
                    boolean z = true;
                    float f11 = 0.0f;
                    float f12 = 0.0f;
                    while (d24 <= 12.0d) {
                        double d25 = d24 * d;
                        float f13 = (float) (d10 + ((d25 * d9) / d));
                        RectF rectF3 = rectF;
                        float sqrt2 = (float) ((((Math.sqrt(Math.abs(((d25 * d25) / d23) + 1.0d)) * d21) - d21) + d7) - d);
                        if (z) {
                            z = false;
                        } else {
                            this.canvas.drawLine(f13, sqrt2, f11, f12, this.paint_n);
                        }
                        d24 += 0.1d;
                        f12 = sqrt2;
                        f11 = f13;
                        rectF = rectF3;
                    }
                    RectF rectF4 = rectF;
                    this.paint_n.setColor(Color.argb(200, 0, 200, 255));
                    double d26 = ((20.0d * d) * d9) / d;
                    float sqrt3 = (float) ((((Math.sqrt(Math.abs((((d * d) * 400.0d) / d23) + 1.0d)) * d21) - d21) + d7) - d);
                    Canvas canvas4 = this.canvas;
                    d2 = d10;
                    float f14 = (float) d2;
                    float f15 = (float) ((d7 - d21) - d);
                    float f16 = sqrt3;
                    canvas4.drawLine(f14, f15, (float) (d10 + d26), f16, this.paint_n);
                    this.canvas.drawLine(f14, f15, (float) (d2 - d26), f16, this.paint_n);
                    this.paint_n.setColor(-16776961);
                    this.paint_n.setStyle(Paint.Style.STROKE);
                    this.canvas.drawArc(rectF4, 180.0f, 360.0f, false, this.paint_n);
                } else {
                    d2 = d10;
                    Canvas canvas5 = this.canvas;
                    double d27 = (double) this.divi;
                    Double.isNaN(d27);
                    double width3 = (double) this.cuadro.getWidth();
                    double d28 = (double) this.divi;
                    Double.isNaN(d28);
                    Double.isNaN(width3);
                    canvas5.drawRect((float) (d27 * 50.0d), (float) (d7 - d), (float) (width3 - (d28 * 50.0d)), (float) d7, this.paint_n);
                }
                this.paint_n.setColor(Color.argb(100, 0, 255, 0));
                if (this.DISTANCE_INTERVAL == 0.0d) {
                    this.canvas.drawRect((float) (d2 - d9), (float) (d7 + d), (float) (d2 + d9), (float) d7, this.paint_n);
                }
            } else {
                d2 = d10;
            }
            if (this.chivozoom == 11 || this.chivozoom == 17) {
                this.paint_n.setColor(Color.argb(100, 255, 127, 0));
                this.paint_n.setStyle(Paint.Style.FILL);
                this.paint_n.setStyle(Paint.Style.STROKE);
                if (this.DISTANCE_INTERVAL != 0.0d) {
                    RectF rectF5 = new RectF();
                    rectF5.set((float) (d2 - d9), (float) (d7 - d), (float) (d2 + d9), (float) (d7 + d));
                    RectF rectF6 = rectF5;
                    this.canvas.drawArc(rectF6, 180.0f, 180.0f, true, this.paint_n);
                    this.paint_n.setColor(Color.argb(200, 0, 255, 0));
                    this.canvas.drawArc(rectF6, 180.0f, -180.0f, true, this.paint_n);
                    this.paint_n.setColor(Color.argb(150, 255, 0, 255));
                    float f17 = this.divi;
                    double d29 = this.posicionFY;
                    this.paint_n.setStrokeWidth((float) (Math.min(this.cuadro.getWidth(), this.cuadro.getHeight()) / 250));
                    double d30 = -5.0d;
                    boolean z2 = true;
                    float f18 = 0.0f;
                    float f19 = 0.0f;
                    while (d30 <= 5.0d) {
                        double d31 = d30 * d;
                        float f20 = (float) (((d31 * d9) / d) + d2);
                        float f21 = (float) (((((d31 * d31) / 4.0d) / d) + d7) - d);
                        if (z2) {
                            z2 = false;
                        } else {
                            this.canvas.drawLine(f20, f21, f18, f19, this.paint_n);
                        }
                        d30 += 0.1d;
                        f18 = f20;
                        f19 = f21;
                    }
                    this.paint_n.setColor(-16776961);
                    this.paint_n.setStyle(Paint.Style.STROKE);
                    this.canvas.drawArc(rectF5, 180.0f, 360.0f, false, this.paint_n);
                } else {
                    Canvas canvas6 = this.canvas;
                    double d32 = (double) this.divi;
                    Double.isNaN(d32);
                    double width4 = (double) this.cuadro.getWidth();
                    double d33 = (double) this.divi;
                    Double.isNaN(d33);
                    Double.isNaN(width4);
                    canvas6.drawRect((float) (d32 * 50.0d), (float) (d7 - d), (float) (width4 - (d33 * 50.0d)), (float) d7, this.paint_n);
                }
                this.paint_n.setColor(Color.argb(200, 0, 255, 0));
                if (this.DISTANCE_INTERVAL == 0.0d) {
                    this.canvas.drawRect((float) (d2 - d9), (float) (d7 + d), (float) (d2 + d9), (float) d7, this.paint_n);
                }
            }
            this.paint_n.setColor((int) ViewCompat.MEASURED_STATE_MASK);
            this.paint_n.setStrokeWidth(0.2f);
            this.paint_n.setTextSize(10.0f);
            this.paint_n.setStyle(Paint.Style.FILL);
            Canvas canvas7 = this.canvas;
            canvas7.drawText("#" + this.nF00.format(this.regladim) + "m", (float) d2, ((float) this.cuadro.getHeight()) - (this.divi * 10.0f), this.paint_n);
            this.pizarra.setImageBitmap(this.cuadro);
        } else {
            this.max = 0.0d;
            this.min = 0.0d;
            for (int i = 0; i < (this.col - this.der) - this.iz; i++) {
                for (int i2 = 0; i2 < (this.SAMPLES - this.cerado) - this.fondo; i2++) {
                    this.num = this.ma3[i][i2];
                    this.ma2[i][i2] = this.num;
                    if (this.num > this.max) {
                        this.max = this.num;
                    }
                    if (this.num < this.min) {
                        this.min = this.num;
                    }
                }
            }
            this.previomax = this.max;
            this.previomin = this.min;
            llenaeltxt();
        }
        ((LinearLayout) findViewById(R.id.zoombados)).setVisibility(4);
    }

    public void salosea(View view) {
        if (this.chivozoom != 13) {
            dibuja();
        }
        ((LinearLayout) findViewById(R.id.zoombados)).setVisibility(4);
    }

    public void visible3() {
        ((LinearLayout) findViewById(R.id.zoombados)).setVisibility(0);
        ((Button) findViewById(R.id.buttonmen)).setVisibility(0);
        ((Button) findViewById(R.id.buttonmas)).setVisibility(0);
        ((Button) findViewById(R.id.buttonnor)).setVisibility(4);
        ((Button) findViewById(R.id.buttonfij)).setVisibility(4);
    }

    public void visible5() {
        ((LinearLayout) findViewById(R.id.zoombados)).setVisibility(0);
        ((Button) findViewById(R.id.buttonmen)).setVisibility(0);
        ((Button) findViewById(R.id.buttonmas)).setVisibility(0);
        ((Button) findViewById(R.id.buttonnor)).setVisibility(0);
        ((Button) findViewById(R.id.buttonfij)).setVisibility(0);
        ((TextView) findViewById(R.id.buttosalir)).setVisibility(0);
    }

    //设置控件是否可见
    public void ocultar() {
        ((Button) findViewById(R.id.imageButton)).setVisibility(4);
        ((Button) findViewById(R.id.imageButton2)).setVisibility(4);
        ((Button) findViewById(R.id.imageButton2a)).setVisibility(4);
        ((Button) findViewById(R.id.imageButton2aa)).setVisibility(4);
        ((Button) findViewById(R.id.imageButton3)).setVisibility(4);
        ((Button) findViewById(R.id.imageButton4)).setVisibility(4);
        ((Button) findViewById(R.id.imageButton4a)).setVisibility(4);
        ((Button) findViewById(R.id.imageButton5)).setVisibility(4);
        ((Button) findViewById(R.id.imageButton10)).setVisibility(4);
        ((Button) findViewById(R.id.imageButton11)).setVisibility(4);
        ((Button) findViewById(R.id.imageButton12)).setVisibility(4);
        ((Button) findViewById(R.id.imageButton13)).setVisibility(4);
        ((Button) findViewById(R.id.imageButton13b)).setVisibility(0);
        ((LinearLayout) findViewById(R.id.zoombados)).setVisibility(4);
        ((ImageView) findViewById(R.id.imageView4)).setVisibility(4);
        ((ImageView) findViewById(R.id.imageView4b)).setVisibility(4);
        ((TextView) findViewById(R.id.textView)).setVisibility(4);
    }

    //设置控件是否可见
    public void mostrar() {
        ((Button) findViewById(R.id.imageButton)).setVisibility(0);
        ((Button) findViewById(R.id.imageButton2)).setVisibility(0);
        ((Button) findViewById(R.id.imageButton2a)).setVisibility(0);
        ((Button) findViewById(R.id.imageButton2aa)).setVisibility(0);
        ((Button) findViewById(R.id.imageButton3)).setVisibility(0);
        ((Button) findViewById(R.id.imageButton4)).setVisibility(0);
        ((Button) findViewById(R.id.imageButton4a)).setVisibility(0);
        ((Button) findViewById(R.id.imageButton5)).setVisibility(0);
        ((Button) findViewById(R.id.imageButton10)).setVisibility(0);
        ((Button) findViewById(R.id.imageButton11)).setVisibility(0);
        ((Button) findViewById(R.id.imageButton12)).setVisibility(0);
        ((Button) findViewById(R.id.imageButton13)).setVisibility(0);
        ((Button) findViewById(R.id.imageButton13b)).setVisibility(4);
        ((ImageView) findViewById(R.id.imageView4)).setVisibility(0);
        ((ImageView) findViewById(R.id.imageView4b)).setVisibility(0);
        ((RelativeLayout) findViewById(R.id.idlectura)).setVisibility(4);
        ((LinearLayout) findViewById(R.id.zoombados)).setVisibility(4);
        ((TextView) findViewById(R.id.textView)).setVisibility(0);
    }

    /**
     * 初始化色域
     */
    //色域   colores[2000]
    public void coloracion() {
        int i = 0;
        for (int i2 = 255; i2 >= 0; i2--) {
            this.colores[i] = Color.rgb(255, 0, i2);
            i++;
        }
        for (int i3 = 0; i3 <= 255; i3++) {
            this.colores[i] = Color.rgb(255, i3, 0);
            i++;
        }
        for (int i4 = 255; i4 >= 0; i4--) {
            this.colores[i] = Color.rgb(i4, 255, 0);
            i++;
        }
        for (int i5 = 0; i5 <= 255; i5++) {
            this.colores[i] = Color.rgb(0, 255, i5);
            i++;
        }
        for (int i6 = 255; i6 >= 0; i6--) {
            this.colores[i] = Color.rgb(0, i6, 255);
            i++;
        }
        for (int i7 = 0; i7 <= 255; i7++) {
            this.colores[i] = Color.rgb(i7, 0, 255);
            i++;
        }
        coloracion2();
    }


    /**
     * 初始化色域
     */
    public void coloracion2() {
        for (double d = 0.0d; d < 1000.0d; d += 1.0d) {
            double pow = Math.pow(Math.sin(0.0015707963267949d * d), this.chivocolor);

            int i = (int) (128.0d * pow);

            int i2 = (int) d;
            int i3 = i2 + 1000;
            int i4 = i + 128;
            this.colorines[0][i3] = Color.rgb(i4, i4, i4);
            int i5 = 999 - i2;
            int i6 = 128 - i;
            this.colorines[0][i5] = Color.rgb(i6, i6, i6);
            int i7 = (int) (256.0d * pow);
            this.colorines[6][i3] = Color.rgb(i7, i7, i7);
            this.colorines[6][i5] = Color.rgb(i7, i7, i7);
            int i8 = (int) (512.0d * pow);
            int i9 = i8 + 768;
            this.colorines[1][i3] = this.colores[i9];
            int i10 = 768 - i8;
            this.colorines[1][i5] = this.colores[i10];
            this.colorines[2][i3] = this.colores[(i9 + 256) % 1536];
            this.colorines[2][i5] = this.colores[(i10 + 256) % 1536];
            this.colorines[3][i3] = this.colores[(i9 + 512) % 1536];
            this.colorines[3][i5] = this.colores[(i10 + 512) % 1536];
            this.colorines[4][i3] = this.colores[(i9 + 768) % 1536];
            this.colorines[4][i5] = this.colores[(i10 + 768) % 1536];
            this.colorines[5][i3] = this.colores[(i9 + 1024) % 1536];
            this.colorines[5][i5] = this.colores[(i10 + 1024) % 1536];
            int i11 = ((int) (pow * 1279.0d)) + 256;
            if (i11 >= 1536) {
                i11 -= 1536;
            }
            this.colorines[7][i3] = this.colores[i11];
            this.colorines[7][i5] = this.colores[i11];
            int i12 = i11 + 256;
            if (i12 >= 1536) {
                i12 -= 1536;
            }
            this.colorines[8][i3] = this.colores[i12];
            this.colorines[8][i5] = this.colores[i12];
            int i13 = i12 + 256;
            if (i13 >= 1536) {
                i13 -= 1536;
            }
            this.colorines[9][i3] = this.colores[i13];
            this.colorines[9][i5] = this.colores[i13];
            int i14 = i13 + 256;
            if (i14 >= 1536) {
                i14 -= 1536;
            }
            this.colorines[10][i3] = this.colores[i14];
            this.colorines[10][i5] = this.colores[i14];
            int i15 = i14 + 256;
            if (i15 >= 1536) {
                i15 -= 1536;
            }
            this.colorines[11][i3] = this.colores[i15];
            this.colorines[11][i5] = this.colores[i15];
        }
    }

    public ArrayList<File> getfile(File file) {
        this.fileList.clear();
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isDirectory()) {
                    this.fileList.add(listFiles[i]);
                }
            }
        }
        return this.fileList;
    }

    public ArrayList<File> getfile2(File file) {
        File[] listFiles = file.listFiles();
        this.fileList2.clear();
        if (listFiles != null && listFiles.length > 0) {
            for (int i = 0; i < listFiles.length; i++) {
                if (!listFiles[i].isDirectory() && listFiles[i].getName().endsWith(".rd3")) {
                    String replace = listFiles[i].getName().replace(".rd3", ".rad");
                    int i2 = 0;
                    while (true) {
                        if (i2 >= listFiles.length) {
                            break;
                        } else if (listFiles[i2].getName().equals(replace)) {
                            this.fileList2.add(listFiles[i]);
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        return this.fileList2;
    }

    public void addListenerOnSpinnerItemSelection() {
        this.spin.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    public void addListenerOnSpinnerItemSelection2() {
        this.spin2.setOnItemSelectedListener(new CustomOnItemSelectedListener2());
    }

    public class CustomOnItemSelectedListener implements AdapterView.OnItemSelectedListener {
        public void onNothingSelected(AdapterView<?> adapterView) {
        }

        public CustomOnItemSelectedListener() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            Georradar.this.directorioelegido = Georradar.this.spin.getSelectedItem().toString();
            final WebView webView = (WebView) Georradar.this.findViewById(R.id.editText);
            if (i == 0) {
                File unused = Georradar.this.raat = new File(Georradar.this.directorioelegido);
                Georradar.this.getfile2(Georradar.this.raat);
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < Georradar.this.fileList2.size(); i2++) {
                    arrayList.add(((File) Georradar.this.fileList2.get(i2)).getName());
                }
                if (Georradar.this.fileList2.size() == 0) {
                    arrayList.add(Georradar.this.lidioma[Georradar.this.nidioma][30]);
                    Georradar georradar = Georradar.this;
                    georradar.htmlint = "<!DOCTYPE html><html>\n<head><meta http-equiv=\"Content-type\" content=\"text/html;charset=UTF-8\"><style>body{ text-align: left;padding-right: 10px;padding-left: 10px;font-family: monospace;font-size: 20px;}h1{font-size:30px;}</style></head>" + "<body bgcolor=\"#ffdfb7\"><h1>...</h1></body></html>";
                    ((TextView) Georradar.this.findViewById(R.id.textView6)).setText("");
                    webView.loadData(Georradar.this.htmlint, "text/html; charset=UTF-8", null);
                    webView.reload();
                    webView.getSettings().setLoadWithOverviewMode(true);
                    webView.getSettings().setUseWideViewPort(true);
                    new Handler().postDelayed(new Runnable() {
                        /* class com.nieto.luis.gpr.Georradar.CustomOnItemSelectedListener.AnonymousClass1 */

                        public void run() {
                            webView.loadDataWithBaseURL("", Georradar.this.htmlint, "text/html", "UTF-8", null);
                        }
                    }, 10);
                }
                Collections.sort(arrayList);
                Georradar.this.spin2.setAdapter((SpinnerAdapter) new ArrayAdapter(Georradar.this.pin, 17367048, arrayList));
                Georradar.this.addListenerOnSpinnerItemSelection2();
                return;
            }
            Georradar georradar2 = Georradar.this;
            File unused2 = georradar2.root = new File(Georradar.this.directorioelegido + "/");
            Georradar.this.getfile(Georradar.this.root);
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < Georradar.this.fileList.size(); i3++) {
                if (!((File) Georradar.this.fileList.get(i3)).getAbsolutePath().toString().contains("/.")) {
                    arrayList2.add(((File) Georradar.this.fileList.get(i3)).getAbsolutePath());
                }
            }
            Collections.sort(arrayList2);
            arrayList2.add(0, Georradar.this.root.getParentFile().toString());
            arrayList2.add(0, Georradar.this.root.toString());
            Georradar.this.spin.setAdapter((SpinnerAdapter) new ArrayAdapter(Georradar.this.pin, 17367048, arrayList2));
        }
    }

    public class CustomOnItemSelectedListener2 implements AdapterView.OnItemSelectedListener {
        public void onNothingSelected(AdapterView<?> adapterView) {
        }

        public CustomOnItemSelectedListener2() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            Georradar.this.archivoelegido = Georradar.this.spin2.getSelectedItem().toString();
            String str = "";
            final WebView webView = (WebView) Georradar.this.findViewById(R.id.editText);
            Georradar.this.htmlint = "<!DOCTYPE html><html>\n<head><meta http-equiv=\"Content-type\" content=\"text/html;charset=UTF-8\"><style>body{ text-align: left;padding-right: 10px;padding-left: 10px;font-family: monospace;font-size: 20px;}h1{font-size:30px;}</style></head>" + "<body bgcolor=\"#ffdfb7\"><h1>" + Georradar.this.lidioma[Georradar.this.nidioma][3] + "</h1>";
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(Georradar.this.directorioelegido + "/" + Georradar.this.archivoelegido.replace(".rd3", ".rad")));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        str = str + readLine + "\n";
                    } else {
                        webView.setVisibility(0);
                        webView.getSettings().setCacheMode(-1);
                        Georradar.this.htmlint = Georradar.this.htmlint + str.replace("\n", "<br>") + "</body></html>";
                        Georradar.this.htmlint = Georradar.this.htmlint.replace("SAMPLES:", "<FONT COLOR=\"BLUE\">SAMPLES:</FONT>").replace("DISTANCE INTERVAL:", "<FONT COLOR=\"BLUE\">DISTANCE INTERVAL:</FONT>").replace("TIMEWINDOW:", "<FONT COLOR=\"BLUE\">TIMEWINDOW:</FONT>").replace("LAST TRACE:", "<FONT COLOR=\"BLUE\">LAST TRACE:</FONT>");
                        webView.reload();
                        webView.getSettings().setLoadWithOverviewMode(true);
                        webView.getSettings().setUseWideViewPort(true);
                        new Handler().postDelayed(new Runnable() {
                            /* class com.nieto.luis.gpr.Georradar.CustomOnItemSelectedListener2.AnonymousClass1 */

                            public void run() {
                                webView.loadDataWithBaseURL("", Georradar.this.htmlint, "text/html", "UTF-8", null);
                            }
                        }, 10);
                        int indexOf = str.indexOf("SAMPLES");
                        Georradar.this.SAMPLES = (int) Georradar.this.cuantoes(str.substring(indexOf + 8, str.indexOf("\n", indexOf)));
                        File file = new File(Georradar.this.directorioelegido + "/" + Georradar.this.archivoelegido);
                        TextView textView = (TextView) Georradar.this.findViewById(R.id.textView6);
                        StringBuilder sb = new StringBuilder();
                        sb.append(Georradar.this.lidioma[Georradar.this.nidioma][1]);
                        NumberFormat numberFormat = Georradar.this.nF0;
                        double length = (double) (file.length() / 50000);
                        Double.isNaN(length);
                        sb.append(numberFormat.format(length + 2.0d));
                        sb.append(Georradar.this.lidioma[Georradar.this.nidioma][2]);
                        textView.setText(sb.toString());
                        return;
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    public void guardas(View view) {

        ((Button) findViewById(R.id.button16)).getText().toString();
        mostrar();
        this.archivoelegido2 = this.archivoelegido;
        this.timer = new Timer();
        this.cuadro = null;
        this.pizarra.setImageBitmap(this.cuadro);
        this.myTimerTask = new MyTimerTask();
        this.timer.schedule(this.myTimerTask, 500);
        ((ImageView) findViewById(R.id.imageView2)).setVisibility(0);
    }

    public void salir(View view) {
        if (this.ma0 == null) {
            Toast.makeText(getApplicationContext(), this.lidioma[this.nidioma][31], 0).show();
        } else {
            mostrar();
        }
    }

    public void abrerad() {
        String str = "";
        ((TextView) findViewById(R.id.textView9)).setText(this.lidioma[this.nidioma][32] + this.archivoelegido);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.directorioelegido + "/" + this.archivoelegido.replace(".rd3", ".rad")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                str = str + "\n" + readLine;
            }
            int indexOf = str.indexOf("SAMPLES");
            this.SAMPLES = (int) cuantoes(str.substring(indexOf + 8, str.indexOf("\n", indexOf)));
            int indexOf2 = str.indexOf("LAST TRACE");
            this.LAST_TRACE = (int) cuantoes(str.substring(indexOf2 + 11, str.indexOf("\n", indexOf2)));
            this.col = this.LAST_TRACE;
            if (((double) this.col) > this.limitedivi) {
                double d = this.limitedivi;
                double d2 = (double) this.col;
                Double.isNaN(d2);
                this.divi = (float) (d / d2);
            } else {
                this.divi = 1.0f;
            }
            this.col2 = (int) (((float) this.col) * this.divi);
            this.SAMPLES2 = (int) (((float) this.SAMPLES) * this.divi);
            int indexOf3 = str.indexOf("TIMEWINDOW");
            this.TIMEWINDOW = cuantoes(str.substring(indexOf3 + 11, str.indexOf("\n", indexOf3)));
            int indexOf4 = str.indexOf("DISTANCE INTERVAL");
            this.DISTANCE_INTERVAL = cuantoes(str.substring(indexOf4 + 18, str.indexOf("\n", indexOf4)));
            abrerd3();
        } catch (IOException unused) {
        }
    }

    public void dibuja2() {
        float f = this.divi * 50.0f;
        this.paint_n.setColor(-16776961);
        double d = (this.max - this.min) / 256.0d;
        for (int i = 0; i < (this.col - this.der) - this.iz; i++) {
            int i2 = 0;
            while (i2 < (this.SAMPLES - this.fondo) - this.cerado) {
                this.num = (this.ma2[i][i2] - this.min) / d;
                if (this.num > 255.0d) {
                    this.num = 254.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 1.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                i2++;
                this.canvas.drawRect((this.divi * ((float) i)) + f, (this.divi * ((float) i2)) + f, (this.divi * ((float) (i + 1))) + f, (this.divi * ((float) i2)) + f, this.paint_n);
            }
        }
        coletilla();
    }

    public void dibuja() {
        rotulos();
        float f = this.divi * 50.0f;
        this.paint_n.setColor(-16776961);
        double d = (this.max - this.min) / 256.0d;
        for (int i = 0; i < (this.col - this.der) - this.iz; i++) {
            int i2 = 0;
            while (i2 < (this.SAMPLES - this.fondo) - this.cerado) {
                this.ma3[i][i2] = this.ma2[i][i2];
                this.num = (this.ma2[i][i2] - this.min) / d;
                if (this.num > 255.0d) {
                    this.num = 254.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 1.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                i2++;
                this.canvas.drawRect((this.divi * ((float) i)) + f, (this.divi * ((float) i2)) + f, (this.divi * ((float) (i + 1))) + f, (this.divi * ((float) i2)) + f, this.paint_n);
            }
        }
        this.previomax = this.max;
        this.previomin = this.min;
        this.pizarra.setImageBitmap(this.cuadro);
        perfil(this.numerodelperfil);
    }

    public void coletilla() {
        double height = (double) this.pizarra.getHeight();
        Double.isNaN(height);
        this.ancho = ((((float) (height + 1.0E-5d)) * ((float) (this.col2 - 1))) / (((float) this.SAMPLES2) + (this.divi * 70.0f))) / 2.0f;
        double scrollX = (double) (((float) this.pizarra.getScrollX()) / this.ancho);
        Double.isNaN(scrollX);
        perfil((scrollX * 0.5d) + 0.5d);
        double d = (double) this.divi;
        Double.isNaN(d);
        double d2 = (double) this.col2;
        Double.isNaN(d2);
        double d3 = (d * 100.0d) + d2;
        double d4 = (double) this.divi;
        Double.isNaN(d4);
        double d5 = (double) this.SAMPLES2;
        Double.isNaN(d5);
        double d6 = d3 / ((d4 * 70.0d) + d5);
        double width = (double) this.pizarra.getWidth();
        Double.isNaN(width);
        double height2 = (double) this.pizarra.getHeight();
        Double.isNaN(height2);
        if (d6 > (width + 1.0E-5d) / (height2 + 1.0E-5d)) {
            double d7 = (double) this.col2;
            Double.isNaN(d7);
            double d8 = (double) this.col2;
            Double.isNaN(d8);
            double width2 = (double) (this.pizarrab.getWidth() / 2);
            Double.isNaN(width2);
            this.ancho = (float) (((d7 + 1.0E-4d) / ((d8 * 1.0d) + 100.0d)) * width2);
        }
        this.getescalex = this.pizarra.getScaleX();
        this.getescaley = this.pizarra.getScaleY();
    }

    public void rotulas() {
        float f;
        this.cuadro = null;
        this.canvas = null;
        this.pizarra.setImageBitmap(this.cuadro);
        double d = this.TIMEWINDOW;
        double d2 = (double) this.SAMPLES;
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) ((this.SAMPLES - this.cerado) - this.fondo);
        Double.isNaN(d4);
        this.TIMEWINDOW2 = d3 * d4;
        if (((double) ((this.col - this.der) - this.iz)) > this.limitedivi) {
            double d5 = this.limitedivi;
            double d6 = (double) ((this.col - this.der) - this.iz);
            Double.isNaN(d6);
            f = (float) (d5 / d6);
        } else {
            f = 1.0f;
        }
        this.divi = f;
        this.col2 = (this.col - this.der) - this.iz;
        this.SAMPLES2 = (int) (((float) ((this.SAMPLES - this.cerado) - this.fondo)) * this.divi);
        this.paint_nb.setStyle(Paint.Style.STROKE);
        int i = this.SAMPLES2;
        float f2 = this.divi;
        this.pizarrab.getWidth();
        this.pizarrab.getHeight();
        float f3 = this.divi;
        int i2 = this.SAMPLES2;
        this.pizarrab.getWidth();
        this.pizarrab.getHeight();
        float f4 = (this.divi * 100.0f) + ((float) this.col2);
        this.cuadrob = null;
        ((TextView) findViewById(R.id.textView9)).setText("_" + ((int) f4) + "-" + ((int) (((float) this.SAMPLES2) + (this.divi * 70.0f))));
    }

    public void rotulos() {
        float f;
        float f2;
        this.cuadro = null;
        this.canvas = null;
        this.pizarra.setImageBitmap(this.cuadro);
        double d = this.TIMEWINDOW;
        double d2 = (double) this.SAMPLES;
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) ((this.SAMPLES - this.cerado) - this.fondo);
        Double.isNaN(d4);
        this.TIMEWINDOW2 = d3 * d4;
        if (((double) ((this.col - this.der) - this.iz)) > this.limitedivi) {
            double d5 = this.limitedivi;
            double d6 = (double) ((this.col - this.der) - this.iz);
            Double.isNaN(d6);
            this.divi = (float) (d5 / d6);
        } else {
            this.divi = 1.0f;
        }
        this.col2 = (this.col - this.der) - this.iz;
        this.SAMPLES2 = (int) (((float) ((this.SAMPLES - this.cerado) - this.fondo)) * this.divi);
        this.paint_nb.setStyle(Paint.Style.STROKE);
        int i = this.SAMPLES2;
        float f3 = this.divi;
        this.pizarrab.getWidth();
        this.pizarrab.getHeight();
        float f4 = this.divi;
        int i2 = this.SAMPLES2;
        this.pizarrab.getWidth();
        this.pizarrab.getHeight();
        float f5 = (this.divi * 100.0f) + ((float) this.col2);
        this.cuadrob = Bitmap.createBitmap((int) f5, (int) (((float) this.SAMPLES2) + (this.divi * 70.0f)), Bitmap.Config.ARGB_8888);
        this.paint_nb.setColor(Color.argb(90, 0, 0, 255));
        this.canvasb = new Canvas(this.cuadrob);
        this.paint_nb.setStrokeWidth(0.01f * f5);
        float f6 = f5 * 0.5f;
        this.canvasb.drawLine(f6, 1.0f, f6, ((float) this.SAMPLES2) + (this.divi * 69.0f), this.paint_nb);
        this.pizarrab.setImageBitmap(this.cuadrob);
        this.paint_n.setStyle(Paint.Style.FILL);
        "a" + this.pizarra.getWidth() + "\n";
        float f7 = 50.0f;
        float f8 = this.divi * 50.0f;
        this.cuadro = Bitmap.createBitmap((int) (((float) this.col2) + (this.divi * 100.0f)), (int) (((float) this.SAMPLES2) + (this.divi * 70.0f)), Bitmap.Config.ARGB_8888);
        this.canvas = new Canvas(this.cuadro);
        this.paint_n.setStyle(Paint.Style.FILL);
        this.paint_n.setColor(Color.rgb(240, 240, 160));
        this.canvas.drawRect(0.0f, 0.0f, 100.0f, 100.0f, this.paint_n);
        this.canvas.drawRect(0.0f, 0.0f, (float) this.cuadro.getWidth(), (float) this.cuadro.getHeight(), this.paint_n);
        this.paint_n.setColor((int) ViewCompat.MEASURED_STATE_MASK);
        if (this.divi * 15.0f > 10.0f) {
            this.paint_n.setTextSize(this.divi * 15.0f);
        } else {
            this.paint_n.setTextSize(10.0f);
        }
        this.paint_n.setTypeface(Typeface.create("Arial", 1));
        float f9 = f8 / 2.0f;
        this.canvas.drawLine(f8, f9, ((float) this.col2) + f8, f9, this.paint_n);
        double d7 = this.DISTANCE_INTERVAL;
        double d8 = (double) this.col2;
        Double.isNaN(d8);
        double d9 = d7 * d8;
        float f10 = this.DISTANCE_INTERVAL > 0.02d ? 5.0f : 0.5f;
        while (true) {
            double d10 = (double) f10;
            Double.isNaN(d10);
            double width = (double) this.cuadro.getWidth();
            Double.isNaN(width);
            if (d10 * d9 >= (width * 1.0d) / 20.0d) {
                break;
            }
            f10 *= 2.0f;
        }
        double d11 = 0.0d;
        if (this.voy != -1.0d) {
            d11 = this.voy * this.DISTANCE_INTERVAL;
        }
        if (this.DISTANCE_INTERVAL > 0.0d) {
            float f11 = 0.0f;
            float f12 = 0.0f;
            while (((double) f11) < d9) {
                double d12 = (double) f8;
                double d13 = (double) f12;
                Canvas canvas2 = this.canvas;
                double d14 = this.DISTANCE_INTERVAL;
                Double.isNaN(d13);
                Double.isNaN(d12);
                float f13 = (float) ((d13 / d14) + d12);
                double d15 = this.DISTANCE_INTERVAL;
                Double.isNaN(d13);
                Double.isNaN(d12);
                canvas2.drawLine(f13, (f8 * 25.0f) / 50.0f, (float) (d12 + (d13 / d15)), (22.0f * f8) / 50.0f, this.paint_n);
                f12 += 1.0f;
                f11 += 1.0f;
                d11 = d11;
            }
            double d16 = d11;
            float f14 = 0.0f;
            float f15 = 0.0f;
            while (true) {
                double d17 = (double) f14;
                if (d17 >= d9) {
                    break;
                }
                Canvas canvas3 = this.canvas;
                double d18 = (double) f8;
                double d19 = (double) f15;
                float f16 = f14;
                double d20 = this.DISTANCE_INTERVAL;
                Double.isNaN(d19);
                Double.isNaN(d18);
                float f17 = (f8 * 25.0f) / f7;
                float f18 = f15;
                double d21 = this.DISTANCE_INTERVAL;
                Double.isNaN(d19);
                Double.isNaN(d18);
                canvas3.drawLine((float) ((d19 / d20) + d18), f17, (float) ((d19 / d21) + d18), (f8 * 19.0f) / 50.0f, this.paint_n);
                Double.isNaN(d18);
                if (d17 < d9 - ((0.3d * d18) / 50.0d)) {
                    double d22 = (double) (f10 / 2.0f);
                    Double.isNaN(d22);
                    if (d17 < d9 - d22) {
                        Canvas canvas4 = this.canvas;
                        NumberFormat numberFormat = this.nF0;
                        double d23 = (double) (f18 / this.divi);
                        Double.isNaN(d23);
                        String format = numberFormat.format(d23 + d16);
                        double d24 = this.DISTANCE_INTERVAL;
                        Double.isNaN(d19);
                        Double.isNaN(d18);
                        canvas4.drawText(format, ((float) (d18 + (d19 / d24))) - ((f8 * 5.0f) / 50.0f), (f8 * 15.0f) / 50.0f, this.paint_n);
                    }
                }
                f15 = f18 + f10;
                f14 = f16 + f10;
                f7 = 50.0f;
            }
            this.canvas.drawLine(f8 + ((float) this.col2), (f8 * 25.0f) / 50.0f, f8 + ((float) this.col2), (f8 * 19.0f) / 50.0f, this.paint_n);
            Canvas canvas5 = this.canvas;
            StringBuilder sb = new StringBuilder();
            NumberFormat numberFormat2 = this.nF00;
            double d25 = (double) ((this.col - this.der) - this.iz);
            double d26 = this.DISTANCE_INTERVAL;
            Double.isNaN(d25);
            sb.append(numberFormat2.format((d25 * d26) + d16));
            sb.append("m.");
            canvas5.drawText(sb.toString(), (((float) this.col2) + f8) - ((f8 * 5.0f) / 50.0f), (15.0f * f8) / 50.0f, this.paint_n);
        }
        float f19 = 0.0f;
        while (f19 < ((float) this.col2)) {
            float f20 = f8 + f19;
            this.canvas.drawLine(f20, (f8 * 25.0f) / 50.0f, f20, (31.0f * f8) / 50.0f, this.paint_n);
            if (f19 < ((float) this.col2) - ((30.0f * f8) / 50.0f)) {
                f2 = 50.0f;
                this.canvas.drawText(Integer.toString((int) ((f19 / this.divi) * ((float) this.multiplus))), f20 - ((f8 * 5.0f) / 50.0f), (45.0f * f8) / 50.0f, this.paint_n);
            } else {
                f2 = 50.0f;
            }
            f19 += f2;
        }
        this.canvas.drawLine(f8 + ((float) this.col2), (f8 * 25.0f) / 50.0f, f8 + ((float) this.col2), (31.0f * f8) / 50.0f, this.paint_n);
        Canvas canvas6 = this.canvas;
        StringBuilder sb2 = new StringBuilder();
        double d27 = (double) this.col;
        Double.isNaN(d27);
        double d28 = (double) this.der;
        Double.isNaN(d28);
        double d29 = (d27 + 1.0E-5d) - d28;
        double d30 = (double) this.iz;
        Double.isNaN(d30);
        double d31 = (double) this.multiplus;
        Double.isNaN(d31);
        sb2.append(Integer.toString((int) ((d29 - d30) * d31 * 1.0d)));
        sb2.append(" tr.");
        float f21 = (f8 * 5.0f) / 50.0f;
        canvas6.drawText(sb2.toString(), (((float) this.col2) + f8) - f21, (45.0f * f8) / 50.0f, this.paint_n);
        float f22 = (40.0f * f8) / 50.0f;
        this.canvas.drawLine(f22, f8, f22, ((float) this.SAMPLES2) + f8, this.paint_n);
        float f23 = 0.0f;
        while (true) {
            double d32 = (double) f23;
            if (d32 >= this.TIMEWINDOW2) {
                break;
            }
            double d33 = (double) f8;
            double d34 = this.TIMEWINDOW2;
            Double.isNaN(d32);
            double d35 = d32 / d34;
            double d36 = (double) this.SAMPLES2;
            Double.isNaN(d36);
            Double.isNaN(d33);
            float f24 = (float) (d33 + (d35 * d36));
            this.canvas.drawLine(f22, f24, (35.0f * f8) / 50.0f, f24, this.paint_n);
            this.canvas.drawText(Integer.toString((int) f23), (9.0f * f8) / 50.0f, f24 + ((3.0f * f8) / 50.0f), this.paint_n);
            f23 += 10.0f;
        }
        this.canvas.drawLine(f22, ((float) this.SAMPLES2) + f8, (35.0f * f8) / 50.0f, ((float) this.SAMPLES2) + f8, this.paint_n);
        float f25 = 1.3f * f8;
        this.canvas.drawText(this.nF00.format(this.TIMEWINDOW2) + "ns.", (9.0f * f8) / 50.0f, ((float) this.SAMPLES2) + f25, this.paint_n);
        float f26 = (f8 * 10.0f) / 50.0f;
        this.canvas.drawLine(((float) this.col2) + f8 + f26, f8, ((float) this.col2) + f8 + f26, ((float) this.SAMPLES2) + f8, this.paint_n);
        double sqrt = (2.99792458E8d / Math.sqrt(this.refraccion)) / 2.0E9d;
        if (this.TIMEWINDOW2 < 20.0d) {
            f = 0.2f;
        } else {
            f = this.TIMEWINDOW2 < 100.0d ? 0.5f : 1.0f;
        }
        float f27 = 0.0f;
        while (true) {
            double d37 = (double) f27;
            if (d37 < this.TIMEWINDOW2 * sqrt) {
                double d38 = (double) f8;
                double d39 = this.TIMEWINDOW2;
                Double.isNaN(d37);
                float f28 = f25;
                double d40 = (double) this.SAMPLES2;
                Double.isNaN(d40);
                Double.isNaN(d38);
                float f29 = (float) (d38 + (((d37 / d39) * d40) / sqrt));
                this.canvas.drawLine(((float) this.col2) + f8 + f26, f29, ((float) this.col2) + f8 + ((17.0f * f8) / 50.0f), f29, this.paint_n);
                if (this.TIMEWINDOW2 < 100.0d) {
                    this.canvas.drawText(this.nF0.format(d37), ((float) this.col2) + f8 + ((f8 * 19.0f) / 50.0f), f29 + ((f8 * 3.0f) / 50.0f), this.paint_n);
                } else {
                    this.canvas.drawText(Integer.toString((int) f27), ((float) this.col2) + f8 + ((f8 * 19.0f) / 50.0f), f29 + ((f8 * 3.0f) / 50.0f), this.paint_n);
                }
                f27 += f;
                f25 = f28;
            } else {
                this.canvas.drawLine(((float) this.col2) + f8 + f26, ((float) this.SAMPLES2) + f8, ((float) this.col2) + f8 + ((17.0f * f8) / 50.0f), ((float) this.SAMPLES2) + f8, this.paint_n);
                this.canvas.drawText(this.nF00.format(this.TIMEWINDOW2 * sqrt) + "m.", (((float) this.col2) + f8) - f21, ((float) this.SAMPLES2) + f25, this.paint_n);
                this.pizarra.setImageBitmap(this.cuadro);
                return;
            }
        }
    }

    public void dibujacentrado() {
        rotulos();
        int i = (this.col - this.der) - this.iz;
        int i2 = (this.SAMPLES - this.cerado) - this.fondo;
        float f = this.divi * 50.0f;
        this.paint_n.setColor(-16776961);
        double d = ((this.max - this.min) / 256.0d) / this.trunca;
        double d2 = this.max / this.trunca;
        double d3 = this.min / this.trunca;
        double d4 = 0.9d;
        if (this.trunca == 0.9d) {
            this.previomax = Math.max(d2, -d2) / 2.0d;
            this.previomin = -this.previomax;
        }
        if (d2 > Math.abs(d3)) {
            d3 = -d2;
        } else {
            d2 = -d3;
        }
        int i3 = 0;
        while (i3 < i) {
            int i4 = 0;
            while (i4 < i2) {
                if (this.trunca == d4) {
                    this.ma3[i3][i4] = Math.abs(this.ma2[i3][i4]) + d3;
                } else {
                    this.ma3[i3][i4] = this.ma2[i3][i4];
                }
                this.num = (this.ma2[i3][i4] - (this.min / this.trunca)) / d;
                if (this.num > 255.0d) {
                    this.num = 255.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 0.0d;
                }
                if (this.ma3[i3][i4] > d2) {
                    this.ma3[i3][i4] = d2;
                }
                if (this.ma3[i3][i4] < d3) {
                    this.ma3[i3][i4] = d3;
                }
                this.paint_n.setColor(coloj(this.num));
                i4++;
                this.canvas.drawRect((this.divi * ((float) i3)) + f, (this.divi * ((float) i4)) + f, (this.divi * ((float) (i3 + 1))) + f, (this.divi * ((float) i4)) + f, this.paint_n);
                d4 = 0.9d;
            }
            i3++;
            d4 = 0.9d;
        }
        this.pizarra.setImageBitmap(this.cuadro);
        this.pizarra.setScaleX(this.getescalex);
        this.pizarra.setScaleY(this.getescaley);
        this.previomax = d2;
        this.previomin = d3;
        if (this.trunca == 0.9d) {
            this.previomax = Math.max(d2, -d2);
            this.previomin = 0.0d;
        }
        this.pizarra.setScaleX(this.getescalex);
        this.pizarra.setScaleY(this.getescaley);
        perfil(this.numerodelperfil);
    }

    public void dibujaganado() {
        rotulos();
        int i = (this.col - this.der) - this.iz;
        int i2 = (this.SAMPLES - this.cerado) - this.fondo;
        float f = this.divi * 50.0f;
        this.paint_n.setColor(-16776961);
        double d = -Math.pow(Math.abs(this.min), this.contraste);
        double pow = Math.pow(Math.abs(this.max), this.contraste);
        double d2 = (pow - d) / 256.0d;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (i4 < i2) {
                int i5 = i;
                int i6 = i2;
                double d3 = pow;
                this.ma3[i3][i4] = Math.signum(this.ma2[i3][i4]) * Math.pow(Math.abs(this.ma2[i3][i4]), this.contraste);
                this.num = (this.ma3[i3][i4] - d) / d2;
                if (this.num > 255.0d) {
                    this.num = 255.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 0.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                i4++;
                this.canvas.drawRect((this.divi * ((float) i3)) + f, (this.divi * ((float) i4)) + f, (this.divi * ((float) (i3 + 1))) + f, (this.divi * ((float) i4)) + f, this.paint_n);
                i = i5;
                i2 = i6;
                pow = d3;
            }
        }
        this.previomax = pow;
        this.previomin = d;
        perfil(this.numerodelperfil);
    }

    public void dibujaganado2() {
        rotulos();
        int i = (this.col - this.der) - this.iz;
        int i2 = (this.SAMPLES - this.cerado) - this.fondo;
        float f = this.divi * 50.0f;
        this.paint_n.setColor(-16776961);
        double d = 0.0d;
        int i3 = 0;
        while (i3 < i) {
            double d2 = d;
            for (int i4 = 0; i4 < i2; i4++) {
                this.ma3[i3][i4] = Math.atan(this.ma2[i3][i4] * 0.001d * this.contraste2);
                if (this.ma3[i3][i4] > d2) {
                    d2 = this.ma3[i3][i4];
                }
                if (this.ma3[i3][i4] < (-d2)) {
                    d2 = -this.ma3[i3][i4];
                }
            }
            i3++;
            d = d2;
        }
        double d3 = -d;
        double d4 = (d - d3) / 256.0d;
        for (int i5 = 0; i5 < this.col; i5++) {
            int max2 = Math.max(this.cerado, 1);
            while (max2 < this.SAMPLES) {
                this.num = (this.ma3[i5][max2] - d3) / d4;
                if (this.num > 255.0d) {
                    this.num = 255.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 0.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                max2++;
                this.canvas.drawRect((this.divi * ((float) i5)) + f, (this.divi * ((float) (max2 - this.cerado))) + f, (this.divi * ((float) (i5 + 1))) + f, (this.divi * ((float) (max2 - this.cerado))) + f, this.paint_n);
            }
        }
        this.previomax = d;
        this.previomin = d3;
        perfil(this.numerodelperfil);
    }

    public void dibujanorma() {
        rotulos();
        int i = (this.col - this.der) - this.iz;
        int i2 = (this.SAMPLES - this.cerado) - this.fondo;
        float f = this.divi * 50.0f;
        this.paint_n.setColor(-16776961);
        double d = this.min;
        double d2 = this.max;
        double d3 = -d2;
        int i3 = (d2 > (-d3) ? 1 : (d2 == (-d3) ? 0 : -1));
        double d4 = -d3;
        if (d2 < d4) {
            d2 = d4;
        }
        double d5 = (d2 - d3) / 256.0d;
        double exp = Math.exp((this.exponente * this.xmax) / 1000.0d);
        double[] dArr = new double[i2];
        int i4 = 0;
        while (i4 < i2) {
            double d6 = d2;
            double d7 = (double) i4;
            Double.isNaN(d7);
            dArr[i4] = Math.exp(((-this.exponente) * d7) / 1000.0d) * exp;
            i4++;
            d4 = d4;
            d2 = d6;
        }
        double d8 = d2;
        double d9 = d4;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = 0;
            while (i6 < i2) {
                this.ma3[i5][i6] = this.ma2[i5][i6] / dArr[i6];
                if (this.ma3[i5][i6] > this.max * dArr[i6]) {
                    this.ma3[i5][i6] = this.max * dArr[i6];
                }
                if (this.ma3[i5][i6] < (-this.max) * dArr[i6]) {
                    this.ma3[i5][i6] = (-this.max) * dArr[i6];
                }
                this.num = (this.ma3[i5][i6] - d3) / d5;
                if (this.num > 255.0d) {
                    this.num = 255.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 0.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                i6++;
                this.canvas.drawRect((this.divi * ((float) i5)) + f, (this.divi * ((float) i6)) + f, (this.divi * ((float) (i5 + 1))) + f, (this.divi * ((float) i6)) + f, this.paint_n);
            }
        }
        double d10 = d8;
        this.previomax = d10;
        this.previomin = d3;
        perfil(this.numerodelperfil);
        double width = (double) this.pizarrac.getWidth();
        double d11 = this.max;
        double d12 = this.min;
        double height = (double) this.pizarrac.getHeight();
        double d13 = (double) i2;
        Double.isNaN(height);
        Double.isNaN(d13);
        double d14 = height / d13;
        this.paint_nc.setColor((int) SupportMenu.CATEGORY_MASK);
        this.paint_nc.setStrokeWidth(1.0f);
        if (d10 > d9) {
            d3 = -d10;
        }
        double d15 = -d3;
        if (d10 < d15) {
            d10 = d15;
        }
        Double.isNaN(width);
        double d16 = width / (d10 - d3);
        int i7 = 1;
        while (i7 < i2) {
            Canvas canvas2 = this.canvasc;
            int i8 = i7 - 1;
            double d17 = (double) i8;
            Double.isNaN(d17);
            double d18 = (double) i7;
            Double.isNaN(d18);
            canvas2.drawLine((float) (((this.max * dArr[i8]) - d3) * d16), (float) (d17 * d14), (float) (((this.max * dArr[i7]) - d3) * d16), (float) (d18 * d14), this.paint_nc);
            i7++;
            i2 = i2;
        }
        for (int i9 = 1; i9 < i2; i9++) {
            Canvas canvas3 = this.canvasc;
            int i10 = i9 - 1;
            double d19 = (double) i10;
            Double.isNaN(d19);
            float f2 = (float) ((((-this.max) * dArr[i9]) - d3) * d16);
            double d20 = (double) i9;
            Double.isNaN(d20);
            canvas3.drawLine((float) ((((-this.max) * dArr[i10]) - d3) * d16), (float) (d19 * d14), f2, (float) (d20 * d14), this.paint_nc);
        }
        this.pizarrac.setImageBitmap(this.cuadroc);
        perfil(this.numerodelperfil);
    }

    public void dibujaderideri() {
        rotulos();
        int i = (this.col - this.der) - this.iz;
        int i2 = (this.SAMPLES - this.cerado) - this.fondo;
        float f = this.divi * 50.0f;
        this.paint_n.setColor(-16776961);
        double d = 0.0d;
        double d2 = 0.0d;
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 1; i4 < i2; i4++) {
                if (this.chivoderi == 0) {
                    this.ma3[i3][i4] = this.ma2[i3][i4];
                } else {
                    this.ma3[i3][i4] = this.ma2[i3][i4] - this.ma2[i3][i4 - 1];
                }
                double[] dArr = this.ma3[i3];
                double d3 = this.ma3[i3][i4] / this.max;
                double d4 = (double) this.chivoderi;
                Double.isNaN(d4);
                dArr[i4] = Math.atan(d3 * d4);
                if (this.ma3[i3][i4] > d) {
                    d = this.ma3[i3][i4];
                }
                if (this.ma3[i3][i4] < d2) {
                    d2 = this.ma3[i3][i4];
                }
            }
            this.ma3[i3][0] = 0.0d;
        }
        double d5 = (d - d2) / 256.0d;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = 0;
            while (i6 < i2) {
                this.num = (this.ma3[i5][i6] - d2) / d5;
                int i7 = i;
                int i8 = i2;
                if (this.num > 255.0d) {
                    this.num = 255.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 0.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                i6++;
                this.canvas.drawRect((this.divi * ((float) i5)) + f, (this.divi * ((float) i6)) + f, (this.divi * ((float) (i5 + 1))) + f, (this.divi * ((float) i6)) + f, this.paint_n);
                i = i7;
                i2 = i8;
            }
        }
        coletilla();
        this.previomax = d;
        this.previomin = d2;
        perfil(this.numerodelperfil);
    }

    public void dibujaderiderj() {
        rotulos();
        int i = (this.col - this.der) - this.iz;
        int i2 = (this.SAMPLES - this.cerado) - this.fondo;
        float f = this.divi * 50.0f;
        this.paint_n.setColor(-16776961);
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = 1;
            while (i4 < i) {
                if (this.chivoderj == d) {
                    this.ma3[i4][i3] = this.ma2[i4][i3];
                } else {
                    this.ma3[i4][i3] = this.ma2[i4][i3] - this.ma2[i4 - 1][i3];
                }
                this.ma3[i4][i3] = Math.atan((this.ma3[i4][i3] * this.chivoderj) / this.max);
                if (this.ma3[i4][i3] > d2) {
                    d2 = this.ma3[i4][i3];
                }
                if (this.ma3[i4][i3] < d3) {
                    d3 = this.ma3[i4][i3];
                }
                i4++;
                d = 0.0d;
            }
            this.ma3[0][i3] = 0.0d;
            i3++;
            d = 0.0d;
        }
        double d4 = (d2 - d3) / 256.0d;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = 0;
            while (i6 < i2) {
                this.num = (this.ma3[i5][i6] - d3) / d4;
                double d5 = d4;
                if (this.num > 255.0d) {
                    this.num = 255.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 0.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                i6++;
                this.canvas.drawRect((this.divi * ((float) i5)) + f, (this.divi * ((float) i6)) + f, (this.divi * ((float) (i5 + 1))) + f, (this.divi * ((float) i6)) + f, this.paint_n);
                d4 = d5;
            }
        }
        coletilla();
        this.previomax = d2;
        this.previomin = d3;
        perfil(this.numerodelperfil);
    }

    public void dibujaderiderj2() {
        int i;
        int i2;
        rotulos();
        int i3 = (this.col - this.der) - this.iz;
        int i4 = (this.SAMPLES - this.cerado) - this.fondo;
        float f = this.divi * 50.0f;
        this.paint_n.setColor(-16776961);
        int i5 = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        while (true) {
            i = i3 - 1;
            if (i5 >= i) {
                break;
            }
            double d3 = d2;
            double d4 = d;
            int i6 = 0;
            while (true) {
                i2 = i4 - 1;
                if (i6 >= i2) {
                    break;
                }
                int i7 = i5 + 1;
                int i8 = i6 + 1;
                this.num = Math.min(this.ma2[i7][i6] - this.ma2[i5][i6], this.ma2[i7][i6] - this.ma2[i5][i8]);
                this.num = Math.atan((this.num / this.max) * this.chivoderj);
                this.ma3[i5][i6] = this.num;
                if (this.num > d4) {
                    d4 = this.num;
                }
                if (this.num < d3) {
                    d3 = this.num;
                }
                i6 = i8;
            }
            this.ma3[i5][i2] = this.ma3[i5][i4 - 2];
            i5++;
            d = d4;
            d2 = d3;
        }
        for (int i9 = 0; i9 < i4; i9++) {
            this.ma3[i][i9] = this.ma3[i3 - 2][i9];
        }
        double d5 = (d - d2) / 256.0d;
        int i10 = 0;
        while (i10 < i3) {
            int i11 = 0;
            while (i11 < i4) {
                this.num = (this.ma3[i10][i11] - d2) / d5;
                int i12 = i10;
                if (this.num > 255.0d) {
                    this.num = 255.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 0.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                i10 = i12;
                i11++;
                this.canvas.drawRect((this.divi * ((float) i10)) + f, (this.divi * ((float) i11)) + f, (this.divi * ((float) (i10 + 1))) + f, (this.divi * ((float) i11)) + f, this.paint_n);
                i3 = i3;
            }
            i10++;
        }
        coletilla();
        this.previomax = d;
        this.previomin = d2;
        perfil(this.numerodelperfil);
    }

    public void dibujaprev() {
        float f = this.divi * 50.0f;
        this.paint_n.setColor(-16776961);
        double signum = Math.signum(this.min) * Math.pow(Math.abs(this.min), this.contraste);
        double signum2 = Math.signum(this.max) * Math.pow(Math.abs(this.max), this.contraste);
        if (!(this.chivoderi == 0 && this.chivoderj == 0.0d && this.chivozoom != 6)) {
            signum = -1.51529782154918d;
            signum2 = 1.51529782154918d;
        }
        double d = ((signum2 - signum) / 256.0d) / this.trunca;
        for (int i = 0; i < this.col; i++) {
            int i2 = this.cerado;
            while (i2 < this.SAMPLES) {
                this.num = ((Math.signum(valore(i, i2)) * Math.pow(Math.abs(valore(i, i2)), this.contraste)) - (signum / this.trunca)) / d;
                if (this.num > 255.0d) {
                    this.num = 255.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 0.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                i2++;
                this.canvas.drawRect(((float) i) + f, ((float) (i2 - this.cerado)) + f, ((float) (i + 1)) + f, ((float) (i2 - this.cerado)) + f, this.paint_n);
            }
        }
        coletilla();
    }

    public void dibufou() {
        RealDoubleFFT realDoubleFFT;
        int i;
        rotulos();
        int i2 = (int) this.fouri;
        int i3 = (this.col - this.der) - this.iz;
        int i4 = (this.SAMPLES - this.cerado) - this.fondo;
        int i5 = i4 - i2;
        RealDoubleFFT realDoubleFFT2 = new RealDoubleFFT(i2);
        double[] dArr = new double[i2];
        float f = this.divi * 50.0f;
        double[] dArr2 = new double[i4];
        double d = (double) i5;
        Double.isNaN(d);
        double d2 = (double) i4;
        Double.isNaN(d2);
        double d3 = (d * 1.0d) / d2;
        int i6 = 0;
        double d4 = 0.001d;
        while (i6 < i3) {
            double d5 = d4;
            int i7 = 0;
            while (i7 < i5) {
                for (int i8 = 0; i8 < i2; i8++) {
                    dArr[i8] = this.ma2[i6][i7 + i8];
                }
                realDoubleFFT2.ft(dArr);
                int i9 = 1;
                double d6 = 0.0d;
                double d7 = 0.0d;
                while (i9 < i2) {
                    if (Math.abs(dArr[i9]) > d6) {
                        d6 = dArr[i9];
                        i = i5;
                        realDoubleFFT = realDoubleFFT2;
                        d7 = Math.log((double) i9);
                    } else {
                        i = i5;
                        realDoubleFFT = realDoubleFFT2;
                    }
                    i9++;
                    i5 = i;
                    realDoubleFFT2 = realDoubleFFT;
                }
                int i10 = i5;
                RealDoubleFFT realDoubleFFT3 = realDoubleFFT2;
                dArr2[i7] = d7;
                if (d5 < d7) {
                    d5 = d7;
                }
                i7++;
                i5 = i10;
                realDoubleFFT2 = realDoubleFFT3;
            }
            int i11 = i5;
            RealDoubleFFT realDoubleFFT4 = realDoubleFFT2;
            for (int i12 = 0; i12 < i4; i12++) {
                double[] dArr3 = this.ma3[i6];
                double d8 = (double) i12;
                Double.isNaN(d8);
                dArr3[i12] = dArr2[(int) (d8 * d3)];
            }
            i6++;
            d4 = d5;
            i5 = i11;
            realDoubleFFT2 = realDoubleFFT4;
        }
        double d9 = 0.001d;
        if (d4 >= 0.001d) {
            d9 = d4;
        }
        double d10 = (d9 - -0.001d) / 256.0d;
        for (int i13 = 0; i13 < i3; i13++) {
            int i14 = 0;
            while (i14 < i4) {
                this.num = (this.ma3[i13][i14] - -0.001d) / d10;
                if (this.num > 255.0d) {
                    this.num = 255.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 0.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                i14++;
                this.canvas.drawRect((this.divi * ((float) i13)) + f, (this.divi * ((float) i14)) + f, (this.divi * ((float) (i13 + 1))) + f, (this.divi * ((float) i14)) + f, this.paint_n);
            }
        }
        this.previomax = d9;
        this.previomin = -0.001d;
        coletilla();
        perfil(this.numerodelperfil);
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0218 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0216  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dibufrec() {
        /*
            r33 = this;
            r0 = r33
            r33.rotulos()
            int r1 = r0.col
            int r2 = r0.der
            int r1 = r1 - r2
            int r2 = r0.iz
            int r1 = r1 - r2
            int r2 = r0.SAMPLES
            int r3 = r0.cerado
            int r2 = r2 - r3
            int r3 = r0.fondo
            int r2 = r2 - r3
            float r3 = r0.divi
            r4 = 1112014848(0x42480000, float:50.0)
            float r3 = r3 * r4
            android.graphics.Paint r4 = r0.paint_n
            r5 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r4.setColor(r5)
            boolean r4 = r0.boleofrec
            r7 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            r11 = 0
            if (r4 == 0) goto L_0x0151
            double r13 = r0.kfrec
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x0036
            r0.kfrec = r7
        L_0x0036:
            double r7 = r0.fecumaximis
            double r13 = r0.kfrec
            double r7 = r7 / r13
            r13 = r11
            r4 = 0
        L_0x003d:
            if (r4 >= r1) goto L_0x014d
            r17 = r11
            r20 = r17
            r15 = 1
            r16 = 0
            r19 = 1
        L_0x0048:
            int r9 = r2 + -1
            if (r15 >= r9) goto L_0x00d3
            double[][] r9 = r0.ma2
            r9 = r9[r4]
            r22 = r9[r15]
            double r22 = java.lang.Math.signum(r22)
            double[][] r9 = r0.ma2
            r9 = r9[r4]
            int r24 = r15 + 1
            r25 = r9[r24]
            double r25 = java.lang.Math.abs(r25)
            int r9 = (r22 > r25 ? 1 : (r22 == r25 ? 0 : -1))
            if (r9 == 0) goto L_0x00c7
            double[][] r9 = r0.ma2
            r9 = r9[r4]
            r22 = r9[r15]
            double[][] r9 = r0.ma2
            r9 = r9[r4]
            r25 = r9[r24]
            double r22 = r22 - r25
            double r22 = java.lang.Math.abs(r22)
            int r9 = (r22 > r7 ? 1 : (r22 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c7
            int r9 = r15 - r16
            double r5 = (double) r9
            int r9 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x00bb
            java.lang.Double.isNaN(r5)
            r22 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r25 = r22 / r5
            double r25 = r25 - r17
            java.lang.Double.isNaN(r5)
            double r22 = r25 / r5
            if (r19 == 0) goto L_0x0099
            r17 = r11
            r22 = r17
            r19 = 0
        L_0x0099:
            r9 = 0
        L_0x009a:
            double r10 = (double) r9
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 >= 0) goto L_0x00b1
            double[][] r12 = r0.ma3
            r12 = r12[r4]
            int r25 = r16 + r9
            java.lang.Double.isNaN(r10)
            double r10 = r10 * r22
            double r10 = r17 + r10
            r12[r25] = r10
            int r9 = r9 + 1
            goto L_0x009a
        L_0x00b1:
            java.lang.Double.isNaN(r5)
            double r22 = r22 * r5
            double r17 = r17 + r22
            r16 = r15
            goto L_0x00c7
        L_0x00bb:
            double[][] r5 = r0.ma3
            r5 = r5[r4]
            r9 = 0
            r5[r16] = r9
            r16 = r15
            r17 = 0
        L_0x00c7:
            int r5 = (r17 > r20 ? 1 : (r17 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x00cd
            r20 = r17
        L_0x00cd:
            r15 = r24
            r11 = 0
            goto L_0x0048
        L_0x00d3:
            int r5 = r9 - r16
            double r5 = (double) r5
            r10 = 0
            int r12 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x00ed
            r10 = 0
        L_0x00dd:
            double r11 = (double) r10
            int r15 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r15 >= 0) goto L_0x00ed
            double[][] r11 = r0.ma3
            r11 = r11[r4]
            int r12 = r16 + r10
            r11[r12] = r17
            int r10 = r10 + 1
            goto L_0x00dd
        L_0x00ed:
            double[][] r5 = r0.ma3
            r5 = r5[r4]
            double[][] r6 = r0.ma3
            r6 = r6[r4]
            r10 = 1
            r11 = r6[r10]
            r6 = 0
            r5[r6] = r11
            double[][] r5 = r0.ma3
            r5 = r5[r4]
            double[][] r6 = r0.ma3
            r6 = r6[r4]
            int r10 = r2 + -2
            r10 = r6[r10]
            r5[r9] = r10
            r5 = 0
            r9 = 1
        L_0x010b:
            if (r5 >= r2) goto L_0x0147
            double[][] r6 = r0.ma3
            r6 = r6[r4]
            r10 = r6[r5]
            r15 = 0
            int r6 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r6 == 0) goto L_0x0134
            if (r9 == 0) goto L_0x0134
            int r6 = r5 + -1
            r9 = 0
            int r6 = java.lang.Math.max(r6, r9)
        L_0x0122:
            if (r6 <= 0) goto L_0x0133
            double[][] r9 = r0.ma3
            r9 = r9[r4]
            double[][] r10 = r0.ma3
            r10 = r10[r4]
            r11 = r10[r5]
            r9[r6] = r11
            int r6 = r6 + -1
            goto L_0x0122
        L_0x0133:
            r9 = 0
        L_0x0134:
            double[][] r6 = r0.ma3
            r6 = r6[r4]
            r10 = r6[r5]
            int r6 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r6 <= 0) goto L_0x0144
            double[][] r6 = r0.ma3
            r6 = r6[r4]
            r13 = r6[r5]
        L_0x0144:
            int r5 = r5 + 1
            goto L_0x010b
        L_0x0147:
            int r4 = r4 + 1
            r11 = 0
            goto L_0x003d
        L_0x014d:
            r29 = r3
            goto L_0x0283
        L_0x0151:
            double r4 = r0.kfrec
            r9 = 0
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 > 0) goto L_0x015b
            r0.kfrec = r7
        L_0x015b:
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r6 = r0.kfrec
            double r4 = r4 / r6
            r6 = 0
            r7 = 0
            r13 = 0
        L_0x0165:
            if (r6 >= r1) goto L_0x027f
            r9 = r7
            r7 = 1
            r8 = 0
            r11 = 0
            r15 = 1
            r16 = 0
        L_0x016f:
            r27 = r13
            int r13 = r2 + -1
            if (r7 >= r13) goto L_0x0222
            double[][] r13 = r0.ma2
            r13 = r13[r6]
            r18 = r13[r7]
            double r13 = java.lang.Math.abs(r18)
            r29 = r3
            double[][] r3 = r0.ma2
            r3 = r3[r6]
            int r18 = r7 + 1
            r19 = r3[r18]
            double r19 = java.lang.Math.abs(r19)
            int r3 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x020e
            double[][] r3 = r0.ma2
            r3 = r3[r6]
            r13 = r3[r7]
            double r13 = java.lang.Math.abs(r13)
            double[][] r3 = r0.ma2
            r3 = r3[r6]
            int r19 = r7 + -1
            r19 = r3[r19]
            double r19 = java.lang.Math.abs(r19)
            int r3 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x020e
            int r3 = r7 - r8
            double r13 = (double) r3
            int r3 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x020e
            java.lang.Double.isNaN(r13)
            double r9 = r13 * r4
            r19 = 0
            int r3 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x01fb
            java.lang.Double.isNaN(r13)
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r22 = r19 / r13
            double r22 = r22 - r11
            java.lang.Double.isNaN(r13)
            double r22 = r22 / r13
            if (r15 == 0) goto L_0x01d2
            r11 = 0
            r15 = 0
            r22 = 0
        L_0x01d2:
            r30 = r4
            r3 = 0
        L_0x01d5:
            double r4 = (double) r3
            int r21 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r21 >= 0) goto L_0x01ef
            r32 = r7
            double[][] r7 = r0.ma3
            r7 = r7[r6]
            int r21 = r8 + r3
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r22
            double r4 = r4 + r11
            r7[r21] = r4
            int r3 = r3 + 1
            r7 = r32
            goto L_0x01d5
        L_0x01ef:
            r32 = r7
            java.lang.Double.isNaN(r13)
            double r22 = r22 * r13
            double r11 = r11 + r22
            r8 = r32
            goto L_0x0212
        L_0x01fb:
            r30 = r4
            r32 = r7
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double[][] r3 = r0.ma3
            r3 = r3[r6]
            r4 = 0
            r3[r8] = r4
            r8 = r32
            r11 = 0
            goto L_0x0212
        L_0x020e:
            r30 = r4
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0212:
            int r3 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x0218
            r16 = r11
        L_0x0218:
            r7 = r18
            r13 = r27
            r3 = r29
            r4 = r30
            goto L_0x016f
        L_0x0222:
            r29 = r3
            r30 = r4
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = r13 - r8
            double r3 = (double) r3
            r14 = 0
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x0242
            r5 = 0
        L_0x0232:
            double r14 = (double) r5
            int r7 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0242
            double[][] r7 = r0.ma3
            r7 = r7[r6]
            int r14 = r8 + r5
            r7[r14] = r11
            int r5 = r5 + 1
            goto L_0x0232
        L_0x0242:
            double[][] r3 = r0.ma3
            r3 = r3[r6]
            double[][] r4 = r0.ma3
            r4 = r4[r6]
            r5 = 1
            r7 = r4[r5]
            r4 = 0
            r3[r4] = r7
            double[][] r3 = r0.ma3
            r3 = r3[r6]
            double[][] r7 = r0.ma3
            r7 = r7[r6]
            int r8 = r2 + -2
            r11 = r7[r8]
            r3[r13] = r11
            r13 = r27
            r3 = 0
        L_0x0261:
            if (r3 >= r2) goto L_0x0276
            double[][] r7 = r0.ma3
            r7 = r7[r6]
            r11 = r7[r3]
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 <= 0) goto L_0x0273
            double[][] r7 = r0.ma3
            r7 = r7[r6]
            r13 = r7[r3]
        L_0x0273:
            int r3 = r3 + 1
            goto L_0x0261
        L_0x0276:
            int r6 = r6 + 1
            r7 = r9
            r3 = r29
            r4 = r30
            goto L_0x0165
        L_0x027f:
            r29 = r3
            r27 = r13
        L_0x0283:
            r4 = 0
            r3 = 0
            r5 = 0
            double r7 = r13 - r5
            r9 = 4643211215818981376(0x4070000000000000, double:256.0)
            double r7 = r7 / r9
            r3 = 0
        L_0x028d:
            if (r3 >= r1) goto L_0x02f1
            r9 = 0
        L_0x0290:
            if (r9 >= r2) goto L_0x02eb
            double[][] r10 = r0.ma3
            r10 = r10[r3]
            r11 = r10[r9]
            double r11 = r11 - r5
            double r11 = r11 / r7
            r0.num = r11
            double r10 = r0.num
            r4 = 4643176031446892544(0x406fe00000000000, double:255.0)
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x02a9
            r0.num = r4
        L_0x02a9:
            double r4 = r0.num
            r10 = 0
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x02b3
            r0.num = r10
        L_0x02b3:
            android.graphics.Paint r4 = r0.paint_n
            double r5 = r0.num
            int r5 = r0.coloj(r5)
            r4.setColor(r5)
            android.graphics.Canvas r15 = r0.canvas
            float r4 = r0.divi
            float r5 = (float) r3
            float r4 = r4 * r5
            float r16 = r4 + r29
            float r4 = r0.divi
            float r5 = (float) r9
            float r4 = r4 * r5
            float r17 = r4 + r29
            float r4 = r0.divi
            int r5 = r3 + 1
            float r5 = (float) r5
            float r4 = r4 * r5
            float r18 = r4 + r29
            float r4 = r0.divi
            int r9 = r9 + 1
            float r5 = (float) r9
            float r4 = r4 * r5
            float r19 = r4 + r29
            android.graphics.Paint r4 = r0.paint_n
            r20 = r4
            r15.drawRect(r16, r17, r18, r19, r20)
            r4 = 0
            r5 = 0
            goto L_0x0290
        L_0x02eb:
            int r3 = r3 + 1
            r4 = 0
            r5 = 0
            goto L_0x028d
        L_0x02f1:
            r33.coletilla()
            r0.previomax = r13
            r1 = 0
            r0.previomin = r1
            double r1 = r0.numerodelperfil
            r0.perfil(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nieto.luis.gpr.Georradar.dibufrec():void");
    }

    public void frecuencio(View view) {
        TextView textView = (TextView) findViewById(R.id.textView10);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.addRule(5, R.id.imageButton11);
        textView.setLayoutParams(layoutParams);
        this.kfrec = 1.0d;
        visible3();
        ((Button) findViewById(R.id.buttonnor)).setVisibility(0);
        ((Button) findViewById(R.id.buttonfij)).setVisibility(0);
        ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.kfrec));
        Toast.makeText(getApplicationContext(), this.lidioma[this.nidioma][33], 0).show();
        this.chivozoom = 14;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(this.lidioma[this.nidioma][34]);
        TextView textView2 = new TextView(this);
        builder.setView(textView2);
        textView2.setText(this.lidioma[this.nidioma][35]);
        builder.setPositiveButton(this.lidioma[this.nidioma][36], new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass9 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Georradar.this.boleofrec = false;
                Georradar.this.dibufrec();
            }
        });
        builder.setNegativeButton(this.lidioma[this.nidioma][37], new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass10 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Georradar.this.chivozoom = 20;
                ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.fouri));
                Toast.makeText(Georradar.this.getApplicationContext(), Georradar.this.lidioma[Georradar.this.nidioma][38], 0).show();
                new Timer().schedule(new TimerTask() {
                    /* class com.nieto.luis.gpr.Georradar.AnonymousClass10.AnonymousClass1 */

                    public void run() {
                        Georradar.this.runOnUiThread(new Runnable() {
                            /* class com.nieto.luis.gpr.Georradar.AnonymousClass10.AnonymousClass1.AnonymousClass1 */

                            public void run() {
                                Georradar.this.dibufou();
                            }
                        });
                    }
                }, 500);
            }
        });
        builder.show();
    }

    public void dibupatron2() {
        rotulos();
        int i = (this.col - this.der) - this.iz;
        int i2 = (this.SAMPLES - this.cerado) - this.fondo;
        float f = this.divi * 50.0f;
        double[] dArr = new double[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            dArr[i3] = this.ma2[0][i3];
            for (int i4 = 1; i4 < i; i4++) {
                dArr[i3] = dArr[i3] + this.ma2[i4][i3];
            }
        }
        for (int i5 = 0; i5 < i2; i5++) {
            double d = dArr[i5];
            double d2 = (double) i;
            Double.isNaN(d2);
            dArr[i5] = d / d2;
        }
        double d3 = 0.001d;
        double d4 = -0.001d;
        int i6 = 0;
        while (i6 < i) {
            int i7 = 0;
            while (i7 < i2) {
                int i8 = i6;
                this.ma3[i6][i7] = this.ma2[i6][i7] - (dArr[i7] * this.patron);
                if (this.ma3[i8][i7] > d3) {
                    d3 = this.ma3[i8][i7];
                }
                if (this.ma3[i8][i7] < d4) {
                    d4 = this.ma3[i8][i7];
                }
                i7++;
                i6 = i8;
            }
            i6++;
        }
        double d5 = -d4;
        if (d3 >= d5) {
            d5 = d3;
        }
        double d6 = (d5 - d4) / 256.0d;
        for (int i9 = 0; i9 < i; i9++) {
            int i10 = 0;
            while (i10 < i2) {
                this.num = (this.ma3[i9][i10] - d4) / d6;
                if (this.num > 255.0d) {
                    this.num = 255.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 0.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                i10++;
                this.canvas.drawRect((this.divi * ((float) i9)) + f, (this.divi * ((float) i10)) + f, (this.divi * ((float) (i9 + 1))) + f, (this.divi * ((float) i10)) + f, this.paint_n);
            }
        }
        this.previomax = d5;
        this.previomin = d4;
        coletilla();
        perfil(this.numerodelperfil);
    }

    public void dibupatron() {
        int i;
        rotulos();
        int i2 = (this.col - this.der) - this.iz;
        int i3 = (this.SAMPLES - this.cerado) - this.fondo;
        float f = this.divi * 50.0f;
        double[] dArr = new double[i2];
        double[] dArr2 = new double[i2];
        double d = 0.001d;
        double d2 = -0.001d;
        int i4 = 0;
        while (i4 < i3) {
            for (int i5 = 0; i5 < i2; i5++) {
                dArr[i5] = this.ma2[i5][i4];
            }
            int i6 = 0;
            while (true) {
                i = i4;
                if (((double) i6) >= this.patron) {
                    break;
                }
                dArr2[0] = dArr[0];
                int i7 = i2 - 1;
                dArr2[i7] = dArr[i7];
                int i8 = 1;
                while (i8 < i7) {
                    int i9 = i8 + 1;
                    dArr2[i8] = ((dArr[i9] + dArr[i8 - 1]) + (dArr[i8] * 2.0d)) / 4.0d;
                    i8 = i9;
                }
                for (int i10 = 0; i10 < i2; i10++) {
                    dArr[i10] = dArr2[i10];
                }
                i6++;
                i4 = i;
            }
            for (int i11 = 0; i11 < i2; i11++) {
                this.ma3[i11][i] = this.ma2[i11][i] - dArr[i11];
                if (this.ma3[i11][i] > d) {
                    d = this.ma3[i11][i];
                }
                if (this.ma3[i11][i] < d2) {
                    d2 = this.ma3[i11][i];
                }
            }
            i4 = i + 1;
        }
        double d3 = -d2;
        if (d >= d3) {
            d3 = d;
        }
        double d4 = (d3 - d2) / 256.0d;
        for (int i12 = 0; i12 < i2; i12++) {
            int i13 = 0;
            while (i13 < i3) {
                this.num = (this.ma3[i12][i13] - d2) / d4;
                double d5 = d4;
                if (this.num > 255.0d) {
                    this.num = 255.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 0.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                i13++;
                this.canvas.drawRect((this.divi * ((float) i12)) + f, (this.divi * ((float) i13)) + f, (this.divi * ((float) (i12 + 1))) + f, (this.divi * ((float) i13)) + f, this.paint_n);
                d4 = d5;
            }
        }
        this.previomax = d3;
        this.previomin = d2;
        coletilla();
        perfil(this.numerodelperfil);
    }

    public void normaliza(View view) {
        TextView textView = (TextView) findViewById(R.id.textView10);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.addRule(5, R.id.imageButton4a);
        textView.setLayoutParams(layoutParams);
        double log = Math.log(1000.0d);
        double d = (double) this.SAMPLES2;
        double d2 = this.xmax;
        Double.isNaN(d);
        this.exponente = (log / (d - d2)) * 100.0d;
        visible3();
        ((Button) findViewById(R.id.buttonnor)).setVisibility(0);
        ((Button) findViewById(R.id.buttonfij)).setVisibility(0);
        ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.exponente));
        Toast.makeText(getApplicationContext(), this.lidioma[this.nidioma][39], 0).show();
        this.chivozoom = 12;
        dibujanorma();
    }

    public void ganancia(View view) {
        TextView textView = (TextView) findViewById(R.id.textView10);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.addRule(5, R.id.imageButton4);
        textView.setLayoutParams(layoutParams);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(this.lidioma[this.nidioma][40]);
        builder.setPositiveButton(this.lidioma[this.nidioma][41], new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass11 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Georradar.this.contraste = 1.0d;
                Georradar.this.visible3();
                ((Button) Georradar.this.findViewById(R.id.buttonnor)).setVisibility(0);
                ((Button) Georradar.this.findViewById(R.id.buttonfij)).setVisibility(0);
                ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.contraste));
                Toast.makeText(Georradar.this.getApplicationContext(), Georradar.this.lidioma[Georradar.this.nidioma][43], 0).show();
                Georradar.this.chivozoom = 1;
            }
        });
        builder.setNegativeButton(this.lidioma[this.nidioma][42], new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass12 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Georradar.this.visible5();
                ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.contraste));
                Toast.makeText(Georradar.this.getApplicationContext(), Georradar.this.lidioma[Georradar.this.nidioma][44], 0).show();
                Georradar.this.chivozoom = 6;
                Georradar.this.dibujaganado2();
            }
        });
        builder.show();
    }

    public void ganancia2(View view) {
        this.contraste2 = 1.0d;
        visible5();
        ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.contraste));
        Toast.makeText(getApplicationContext(), "Utiliza los mandos para modificar la ganancia arcotangencial", 0).show();
        this.chivozoom = 6;
        dibujaganado2();
    }

    public void filtro2(double d) {
        double d2 = d;
        this.cuadro = Bitmap.createBitmap(this.col, this.SAMPLES, Bitmap.Config.ARGB_8888);
        this.canvas = new Canvas(this.cuadro);
        this.paint_n.setStyle(Paint.Style.FILL);
        Math.pow(this.max - this.min, d2);
        double pow = Math.pow(this.max, d2) / 128.0d;
        for (int i = 0; i < this.col; i++) {
            this.xmin = 0.0d;
            this.xmax = 0.0d;
            int i2 = 0;
            while (i2 < this.SAMPLES) {
                this.num = ((Math.signum(valore(i, i2)) * Math.pow(Math.abs(valore(i, i2)), d2)) / pow) + 127.0d;
                if (this.num > 255.0d) {
                    this.num = 255.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 0.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                i2++;
                this.canvas.drawRect((float) i, (float) i2, (float) this.col, (float) i2, this.paint_n);
            }
        }
        this.pizarra.setImageBitmap(this.cuadro);
    }

    public int coloj(double d) {
        return this.colorines[this.chivatocolor][(int) (d / 0.128d)];
    }

    public void guarda(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss");
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File(this.directorioelegido + "/" + (simpleDateFormat.format(new Date()) + "_Cambios.txt"))));
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (IOException unused) {
        }
    }

    public void guardadib(String str) {
        String replace = str.replace(".jpg", ".png");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss");
        String str2 = simpleDateFormat.format(new Date()) + "_" + replace;
        File file = new File(this.directorioelegido + "/" + str2);
        Bitmap bitmap = this.cuadro;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            Toast.makeText(getApplicationContext(), this.lidioma[this.nidioma][45] + "\n" + this.directorioelegido + "/" + str2, 0).show();
        } catch (IOException unused) {
        }
    }

    public void guardadib2(String str) {
        String replace = str.replace(".jpg", ".png");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss");
        File file = new File(this.directorioelegido + "/" + (simpleDateFormat.format(new Date()) + "_" + replace));
        Bitmap bitmap = this.cuadroc;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public void informe(View view) {
        if (this.cuadro == null) {
            Toast.makeText(getApplicationContext(), this.lidioma[this.nidioma][80], 0).show();
            return;
        }
        guarda(this.textoaux);
        guardadib(this.archivoelegido.replace(".rd3", "_geograma.jpg"));
        guardadib2(this.archivoelegido.replace(".rd3", "_perfil.jpg"));
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x00fc */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01aa A[Catch:{ IOException -> 0x01d4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void endisco(android.view.View r18) {
        /*
            r17 = this;
            r0 = r17
            android.graphics.Bitmap r1 = r0.cuadro
            r2 = 0
            if (r1 != 0) goto L_0x001d
            android.content.Context r1 = r17.getApplicationContext()
            java.lang.String[][] r3 = r0.lidioma
            int r4 = r0.nidioma
            r3 = r3[r4]
            r4 = 80
            r3 = r3[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r3, r2)
            r1.show()
            return
        L_0x001d:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyMMddHHmmss"
            r1.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            java.lang.String r4 = r1.format(r4)
            r3.append(r4)
            java.lang.String r4 = "_"
            r3.append(r4)
            java.lang.String r4 = r0.archivoelegido
            java.lang.String r5 = ".rd3"
            java.lang.String r6 = ".rad"
            java.lang.String r4 = r4.replace(r5, r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = ""
            int r5 = r0.col
            int r6 = r0.der
            int r5 = r5 - r6
            int r6 = r0.iz
            int r5 = r5 - r6
            int r6 = r0.SAMPLES
            int r7 = r0.cerado
            int r6 = r6 - r7
            int r7 = r0.fondo
            int r6 = r6 - r7
            java.io.FileReader r7 = new java.io.FileReader     // Catch:{ IOException -> 0x00fc }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00fc }
            r8.<init>()     // Catch:{ IOException -> 0x00fc }
            java.lang.String r9 = r0.directorioelegido     // Catch:{ IOException -> 0x00fc }
            r8.append(r9)     // Catch:{ IOException -> 0x00fc }
            java.lang.String r9 = "/"
            r8.append(r9)     // Catch:{ IOException -> 0x00fc }
            java.lang.String r9 = r0.archivoelegido     // Catch:{ IOException -> 0x00fc }
            java.lang.String r10 = ".rd3"
            java.lang.String r11 = ".rad"
            java.lang.String r9 = r9.replace(r10, r11)     // Catch:{ IOException -> 0x00fc }
            r8.append(r9)     // Catch:{ IOException -> 0x00fc }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x00fc }
            r7.<init>(r8)     // Catch:{ IOException -> 0x00fc }
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00fc }
            r8.<init>(r7)     // Catch:{ IOException -> 0x00fc }
        L_0x0087:
            java.lang.String r7 = r8.readLine()     // Catch:{ IOException -> 0x00fc }
            if (r7 == 0) goto L_0x00fc
            java.lang.String r9 = "SAMPLES"
            boolean r9 = r7.contains(r9)     // Catch:{ IOException -> 0x00fc }
            if (r9 == 0) goto L_0x00aa
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00fc }
            r7.<init>()     // Catch:{ IOException -> 0x00fc }
            java.lang.String r9 = "SAMPLES:"
            r7.append(r9)     // Catch:{ IOException -> 0x00fc }
            java.lang.String r9 = java.lang.Integer.toString(r6)     // Catch:{ IOException -> 0x00fc }
            r7.append(r9)     // Catch:{ IOException -> 0x00fc }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00fc }
        L_0x00aa:
            java.lang.String r9 = "TIMEWINDOW"
            boolean r9 = r7.contains(r9)     // Catch:{ IOException -> 0x00fc }
            if (r9 == 0) goto L_0x00c9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00fc }
            r7.<init>()     // Catch:{ IOException -> 0x00fc }
            java.lang.String r9 = "TIMEWINDOW:"
            r7.append(r9)     // Catch:{ IOException -> 0x00fc }
            double r9 = r0.TIMEWINDOW2     // Catch:{ IOException -> 0x00fc }
            java.lang.String r9 = java.lang.Double.toString(r9)     // Catch:{ IOException -> 0x00fc }
            r7.append(r9)     // Catch:{ IOException -> 0x00fc }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00fc }
        L_0x00c9:
            java.lang.String r9 = "LAST TRACE"
            boolean r9 = r7.contains(r9)     // Catch:{ IOException -> 0x00fc }
            if (r9 == 0) goto L_0x00e6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00fc }
            r7.<init>()     // Catch:{ IOException -> 0x00fc }
            java.lang.String r9 = "LAST TRACE:"
            r7.append(r9)     // Catch:{ IOException -> 0x00fc }
            java.lang.String r9 = java.lang.Integer.toString(r5)     // Catch:{ IOException -> 0x00fc }
            r7.append(r9)     // Catch:{ IOException -> 0x00fc }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00fc }
        L_0x00e6:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00fc }
            r9.<init>()     // Catch:{ IOException -> 0x00fc }
            r9.append(r4)     // Catch:{ IOException -> 0x00fc }
            r9.append(r7)     // Catch:{ IOException -> 0x00fc }
            java.lang.String r7 = "\n"
            r9.append(r7)     // Catch:{ IOException -> 0x00fc }
            java.lang.String r7 = r9.toString()     // Catch:{ IOException -> 0x00fc }
            r4 = r7
            goto L_0x0087
        L_0x00fc:
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x0127 }
            r7.<init>(r3)     // Catch:{ Exception -> 0x0127 }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0127 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0127 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0127 }
            r9.<init>()     // Catch:{ Exception -> 0x0127 }
            java.lang.String r10 = r0.directorioelegido     // Catch:{ Exception -> 0x0127 }
            r9.append(r10)     // Catch:{ Exception -> 0x0127 }
            java.lang.String r10 = "/"
            r9.append(r10)     // Catch:{ Exception -> 0x0127 }
            r9.append(r7)     // Catch:{ Exception -> 0x0127 }
            java.lang.String r7 = r9.toString()     // Catch:{ Exception -> 0x0127 }
            r8.<init>(r7)     // Catch:{ Exception -> 0x0127 }
            r3.<init>(r8)     // Catch:{ Exception -> 0x0127 }
            r3.write(r4)     // Catch:{ Exception -> 0x0127 }
            r3.close()     // Catch:{ Exception -> 0x0127 }
        L_0x0127:
            r3 = 0
            r0.max = r3
            r0.min = r3
            r3 = 0
        L_0x012e:
            if (r3 >= r5) goto L_0x0159
            r4 = 0
        L_0x0131:
            if (r4 >= r6) goto L_0x0156
            double[][] r7 = r0.ma3
            r7 = r7[r3]
            r8 = r7[r4]
            r0.num = r8
            double r7 = r0.num
            double r9 = r0.max
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0147
            double r7 = r0.num
            r0.max = r7
        L_0x0147:
            double r7 = r0.num
            double r9 = r0.min
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0153
            double r7 = r0.num
            r0.min = r7
        L_0x0153:
            int r4 = r4 + 1
            goto L_0x0131
        L_0x0156:
            int r3 = r3 + 1
            goto L_0x012e
        L_0x0159:
            double r3 = r0.max
            double r7 = r0.min
            double r7 = -r7
            double r3 = java.lang.Math.max(r3, r7)
            r7 = 4674736138332667904(0x40dfffc000000000, double:32767.0)
            double r3 = r3 / r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.util.Date r8 = new java.util.Date
            r8.<init>()
            java.lang.String r1 = r1.format(r8)
            r7.append(r1)
            java.lang.String r1 = "_"
            r7.append(r1)
            java.lang.String r1 = r0.archivoelegido
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            java.io.DataOutputStream r7 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x01d4 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x01d4 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d4 }
            r9.<init>()     // Catch:{ IOException -> 0x01d4 }
            java.lang.String r10 = r0.directorioelegido     // Catch:{ IOException -> 0x01d4 }
            r9.append(r10)     // Catch:{ IOException -> 0x01d4 }
            java.lang.String r10 = "/"
            r9.append(r10)     // Catch:{ IOException -> 0x01d4 }
            r9.append(r1)     // Catch:{ IOException -> 0x01d4 }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x01d4 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x01d4 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x01d4 }
            r8 = 0
        L_0x01a8:
            if (r8 >= r5) goto L_0x01d4
            r9 = 0
        L_0x01ab:
            if (r9 >= r6) goto L_0x01cf
            double[][] r10 = r0.ma2     // Catch:{ IOException -> 0x01d4 }
            r10 = r10[r8]     // Catch:{ IOException -> 0x01d4 }
            r11 = r10[r9]     // Catch:{ IOException -> 0x01d4 }
            double r11 = r11 / r3
            r13 = 4643211215818981376(0x4070000000000000, double:256.0)
            double r11 = r11 / r13
            int r10 = (int) r11
            byte r10 = (byte) r10
            r15 = r3
            double r2 = (double) r10
            java.lang.Double.isNaN(r2)
            r4 = 0
            double r11 = r11 - r2
            double r11 = r11 * r13
            int r2 = (int) r11
            byte r2 = (byte) r2
            r7.writeByte(r2)     // Catch:{ IOException -> 0x01d4 }
            r7.writeByte(r10)     // Catch:{ IOException -> 0x01d4 }
            int r9 = r9 + 1
            r3 = r15
            r2 = 0
            goto L_0x01ab
        L_0x01cf:
            r15 = r3
            int r8 = r8 + 1
            r2 = 0
            goto L_0x01a8
        L_0x01d4:
            android.content.Context r2 = r17.getApplicationContext()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String[][] r4 = r0.lidioma
            int r5 = r0.nidioma
            r4 = r4[r5]
            r5 = 45
            r4 = r4[r5]
            r3.append(r4)
            java.lang.String r4 = "\n"
            r3.append(r4)
            java.lang.String r4 = r0.directorioelegido
            r3.append(r4)
            java.lang.String r4 = "/"
            r3.append(r4)
            java.lang.String r4 = ".rd3"
            java.lang.String r5 = ""
            java.lang.String r1 = r1.replace(r4, r5)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r3 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r2, r1, r3)
            r1.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nieto.luis.gpr.Georradar.endisco(android.view.View):void");
    }

    public void apertura(View view) {
        apertura2();
    }

    public void apertura2() {
        ((Button) findViewById(R.id.imageButton13b)).setVisibility(0);
        ((RelativeLayout) findViewById(R.id.idlectura)).setVisibility(0);
        this.raat = new File(this.directorioelegido);
        getfile2(this.raat);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.fileList2.size(); i++) {
            arrayList.add(this.fileList2.get(i).getName());
        }
        if (this.fileList2.size() == 0) {
            arrayList.add(this.lidioma[this.nidioma][46]);
        }
        Collections.sort(arrayList);
        this.spin2.setAdapter((SpinnerAdapter) new ArrayAdapter(this.pin, 17367048, arrayList));
        addListenerOnSpinnerItemSelection2();
    }

    public double cuantoes(String str) {
        try {
            double parseDouble = Double.parseDouble(str.replaceAll(",", "."));
            if (Double.isNaN(parseDouble)) {
                return 0.0d;
            }
            return parseDouble;
        } catch (NumberFormatException unused) {
            return 0.0d;
        }
    }

    /**
     * 合成雷达记录画线写字
     * @param d
     */
    public void perfil(double d) {
        double d2;

        this.paint_nc.setStyle(Paint.Style.STROKE);

        int i = (this.col - this.der) - this.iz;
        int i2 = (this.SAMPLES - this.cerado) - this.fondo;

        double width = (double) this.pizarrac.getWidth();
        double height = (double) this.pizarrac.getHeight();

        double d3 = (double) i2;

        double d4 = height / d3;

        double d5 = this.min;
        double d6 = this.max;

        int i3 = (int) width;
        int i4 = (int) height;

        this.cuadroc = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);

        //合成雷达记录
        this.canvasc = new Canvas(this.cuadroc);
        this.paint_nc.setColor(-1);
        this.paint_nc.setStyle(Paint.Style.FILL);
        this.canvasc.drawRect(0.0f, 0.0f, (float) i3, (float) i4, this.paint_nc);

        //画中间的粗线
        this.paint_nc.setColor((int) InputDeviceCompat.SOURCE_ANY);
        this.paint_nc.setStyle(Paint.Style.STROKE);
        this.paint_nc.setStrokeWidth(4.0f);
        float f = ((float) width) / 2.0f;
        this.canvasc.drawLine(f, 0.0f, f, (float) height, this.paint_nc);

        this.paint_nc.setColor(-16776961);
        this.paint_nc.setStrokeWidth(1.0f);
        double d7 = (double) i;
        Double.isNaN(d7);
        this.posicionFX = d7 * d;
        int i5 = (int) this.posicionFX;
        if (i5 < 0) {
            i5 = 0;
        }
        if (i5 >= this.col) {
            i5 = this.col - 1;
        }
        double d8 = this.previomax;
        double d9 = this.previomin;
        double d10 = d8;
        double abs = Math.abs(0.0d);
        double abs2 = Math.abs(0.0d);
        double abs3 = Math.abs(d10 - this.cero);
        double log = Math.log(abs3 / Math.abs(d9 - this.cero)) / (abs - abs2);
        double exp = abs3 / Math.exp(abs * log);
        if (d10 > (-d9)) {
            d2 = d10;
            d9 = -d2;
        } else {
            d2 = d10;
        }
        double d11 = log;
        double d12 = -d9;
        if (d2 < d12) {
            d2 = d12;
        }
        Double.isNaN(width);
        double d13 = width / (d2 - d9);
        int i6 = 1;
        while (i6 < i2) {
            Canvas canvas2 = this.canvasc;
            int i7 = i2;
            int i8 = i6 - 1;
            double d14 = (double) i8;
            Double.isNaN(d14);
            double d15 = d13;
            double d16 = (double) i6;
            Double.isNaN(d16);
            canvas2.drawLine((float) ((this.ma3[i5][i8] - d9) * d13), (float) (d14 * d4), (float) ((this.ma3[i5][i6] - d9) * d13), (float) (d16 * d4), this.paint_nc);
            i6++;
            i2 = i7;
            height = height;
            width = width;
            d13 = d15;
        }
        int i9 = i2;
        double d17 = width;
        double d18 = height;
        double d19 = d13;
        this.paint_nc.setStyle(Paint.Style.FILL);
        Paint paint = this.paint_nc;
        Double.isNaN(d17);
        paint.setStrokeWidth((float) ((int) (d17 / 4.0d)));
        this.paint_nc.setColor((int) ViewCompat.MEASURED_STATE_MASK);
        this.paint_nc.setTypeface(Typeface.create("Arial", 1));
        this.paint_nc.setTextSize(15.0f);
        if (this.DISTANCE_INTERVAL2 == 0.0d) {
            Canvas canvas3 = this.canvasc;
            StringBuilder sb = new StringBuilder();
            sb.append("Trace: ");
            double d20 = this.posicionFX;
            double d21 = (double) this.multiplus;
            Double.isNaN(d21);
            sb.append((int) (d20 * d21));
            String sb2 = sb.toString();
            Double.isNaN(d17);
            Double.isNaN(d18);
            Double.isNaN(d18);
            canvas3.drawText(sb2, (float) ((int) (d17 / 16.0d)), (float) ((int) (d18 - (d18 / 32.0d))), this.paint_nc);
        } else {
            Canvas canvas4 = this.canvasc;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Tr: ");
            double d22 = this.posicionFX;
            double d23 = (double) this.multiplus;
            Double.isNaN(d23);
            sb3.append((int) (d22 * d23));
            sb3.append("; D: ");
            sb3.append(this.nF00.format(this.DISTANCE_INTERVAL2 * this.posicionFX));
            sb3.append("m.");
            String sb4 = sb3.toString();
            Double.isNaN(d17);
            Double.isNaN(d18);
            Double.isNaN(d18);
            canvas4.drawText(sb4, (float) ((int) (d17 / 16.0d)), (float) ((int) (d18 - (d18 / 32.0d))), this.paint_nc);
        }
        if (this.sincentrar) {
            this.pizarrac.setImageBitmap(this.cuadroc);
            return;
        }
        this.paint_nc.setColor(-16711936);
        this.paint_nc.setStrokeWidth(3.0f);
        int i10 = (int) 0.0d;
        int i11 = i9;
        while (i10 < i11) {
            double d24 = (double) (i10 - 1);
            Double.isNaN(d24);
            double exp2 = exp * Math.exp(d11 * d24);
            double d25 = (double) i10;
            Double.isNaN(d25);
            double exp3 = Math.exp(d11 * d25) * exp;
            Canvas canvas5 = this.canvasc;
            int i12 = i11;
            Double.isNaN(d24);
            float f2 = (float) (d24 * d4);
            Double.isNaN(d25);
            float f3 = (float) (d25 * d4);
            canvas5.drawLine((float) (((this.cero + exp2) - d9) * d19), f2, (float) (((this.cero + exp3) - d9) * d19), f3, this.paint_nc);
            this.canvasc.drawLine((float) ((((-exp2) + this.cero) - d9) * d19), f2, (float) ((((-exp3) + this.cero) - d9) * d19), f3, this.paint_nc);
            i10++;
            i11 = i12;
        }
        this.pizarrac.setImageBitmap(this.cuadroc);
    }

    public void perfilmedio() {
        int i;
        this.paint_nc.setStyle(Paint.Style.STROKE);
        this.paint_nc.setStrokeWidth(1.0f);
        double width = (double) this.pizarrac.getWidth();
        double height = (double) this.pizarrac.getHeight();
        double d = (double) this.SAMPLES;
        Double.isNaN(height);
        Double.isNaN(d);
        double d2 = height / d;
        Double.isNaN(width);
        double d3 = width / (this.max - this.min);
        double width2 = (double) this.pizarra.getWidth();
        Double.isNaN(width2);
        double height2 = (double) this.pizarra.getHeight();
        Double.isNaN(height2);
        double d4 = (width2 * 1.0d) / height2;
        double d5 = (double) this.col;
        Double.isNaN(d5);
        double d6 = (double) this.SAMPLES;
        Double.isNaN(d6);
        if (d4 < (d5 * 1.0d) / d6) {
            double width3 = (double) this.pizarra.getWidth();
            Double.isNaN(width3);
            double d7 = (double) this.col;
            Double.isNaN(d7);
            d2 = (width3 * 1.0d) / d7;
        }
        this.cuadroc = Bitmap.createBitmap((int) width, (int) height, Bitmap.Config.ARGB_8888);
        this.canvasc = new Canvas(this.cuadroc);
        int i2 = 255;
        int i3 = 10;
        this.paint_nc.setColor(Color.argb(10, 0, 0, 255));
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= this.col) {
                break;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            if (i4 >= this.col) {
                i4 = this.col - 1;
            }
            double[] dArr = this.ma2[this.col];
            double d8 = this.ma2[i4][0];
            double d9 = (double) this.col;
            Double.isNaN(d9);
            dArr[0] = d8 / d9;
            this.paint_nc.setColor(Color.argb(i3, 0, 0, i2));
            while (i < this.SAMPLES) {
                double[] dArr2 = this.ma2[this.col];
                double d10 = dArr2[i];
                double d11 = this.ma2[i4][i];
                double d12 = (double) this.col;
                Double.isNaN(d12);
                dArr2[i] = d10 + (d11 / d12);
                Canvas canvas2 = this.canvasc;
                int i5 = i - 1;
                float valore = (float) ((valore(i4, i5) - this.min) * d3);
                double d13 = (double) i5;
                Double.isNaN(d13);
                double d14 = (double) i;
                Double.isNaN(d14);
                canvas2.drawLine(valore, (float) (d13 * d2), (float) ((valore(i4, i) - this.min) * d3), (float) (d14 * d2), this.paint_nc);
                i++;
            }
            i4++;
            i2 = 255;
            i3 = 10;
        }
        this.paint_nc.setColor((int) SupportMenu.CATEGORY_MASK);
        this.paint_nc.setStrokeWidth(5.0f);
        int i6 = this.col;
        if (i6 < 0) {
            i6 = 0;
        }
        if (i6 >= this.col) {
            i6 = this.col - 1;
        }
        double[] dArr3 = this.ma2[this.col];
        double d15 = this.ma2[i6][0];
        double d16 = (double) this.col;
        Double.isNaN(d16);
        dArr3[0] = d15 / d16;
        while (i < this.SAMPLES) {
            int i7 = i - 1;
            double d17 = (double) i7;
            Double.isNaN(d17);
            float f = (float) (d17 * d2);
            float valore2 = (float) ((valore(i6, i) - this.min) * d3);
            double d18 = (double) i;
            Double.isNaN(d18);
            this.canvasc.drawLine((float) ((valore(i6, i7) - this.min) * d3), f, valore2, (float) (d18 * d2), this.paint_nc);
            i++;
        }
        this.pizarrac.setImageBitmap(this.cuadroc);
    }

    public void medias(View view) {
        perfilmedio();
    }

    public void bnocolor(View view) {
        TextView textView = (TextView) findViewById(R.id.textView10);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.addRule(5, R.id.imageButton2aa);
        textView.setLayoutParams(layoutParams);
        visible3();
        ((ImageView) findViewById(R.id.imageView6)).setVisibility(0);
        ((Button) findViewById(R.id.buttonnor)).setVisibility(0);
        ((Button) findViewById(R.id.buttonfij)).setVisibility(0);
        ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.chivocolor));
        this.chivozoom = 13;
        perfil(this.numerodelperfil);
    }

    public void fondobn() {
        Bitmap createBitmap = Bitmap.createBitmap(256, 40, Bitmap.Config.ARGB_8888);
        ImageView imageView = (ImageView) findViewById(R.id.imageViewBN);
        imageView.setImageBitmap(createBitmap);
        Canvas canvas2 = new Canvas(createBitmap);
        Paint paint = new Paint();
        for (double d = 0.0d; d < 2000.0d; d += 1.0d) {
            paint.setColor(this.colorines[this.chivatocolor][(int) d]);
            double d2 = d * 0.128d;
            canvas2.drawRect((float) d2, 0.0f, (float) (d2 + 0.128d), 40.0f, paint);
        }
        imageView.setImageBitmap(createBitmap);
    }

    public void zoomba(View view) {
        visible3();
        Toast.makeText(getApplicationContext(), "Utiliza los mando del zoom para agrandar o disminuir el dibujo", 0).show();
        this.chivozoom = 0;
        dibuja();
    }

    public void centrado(View view) {
        this.trunca = 1.0d;
        this.cero = 0.0d;
        TextView textView = (TextView) findViewById(R.id.textView10);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.addRule(5, R.id.imageButton3);
        textView.setLayoutParams(layoutParams);
        this.max -= this.cero;
        this.min -= this.cero;
        this.sincentrar = false;
        if (this.max > (-this.min)) {
            this.min = -this.max;
        }
        if (this.max < (-this.min)) {
            this.max = -this.min;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.col; i2++) {
            double d = (double) this.SAMPLES;
            Double.isNaN(d);
            for (int i3 = (int) (d * 0.5d); i3 < this.SAMPLES; i3++) {
                this.cero += this.ma2[i2][i3];
                i++;
            }
        }
        double d2 = this.cero;
        double d3 = (double) i;
        Double.isNaN(d3);
        this.cero = d2 / d3;
        for (int i4 = 0; i4 < this.col; i4++) {
            for (int i5 = 0; i5 < this.SAMPLES; i5++) {
                this.ma2[i4][i5] = this.ma2[i4][i5] - this.cero;
                this.ma3[i4][i5] = this.ma2[i4][i5];
            }
        }
        this.cero = 0.0d;
        Toast.makeText(getApplicationContext(), this.lidioma[this.nidioma][47], 0).show();
        this.chivozoom = 2;
        dibujacentrado();
        visible5();
        ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.trunca));
    }

    public void reseto(View view) {
        TextView textView = (TextView) findViewById(R.id.textView10);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.addRule(5, R.id.imageButton);
        textView.setLayoutParams(layoutParams);
        ((TextView) findViewById(R.id.textView9)).setText(this.directorioelegido + "/" + this.archivoelegido);
        reseto2();
    }

    public void reseto2() {
        this.tarea2.cancel(true);
        this.numerodelperfil = 0.5d;
        ((TextView) findViewById(R.id.textView)).setText("");
        this.textoaux = "";
        valores0();
        this.max = 0.0d;
        this.min = 0.0d;
        fondobn();
        this.pizarra.setScaleX(1.0f);
        this.pizarra.setScaleY(1.0f);
        this.pizarra.setScrollX(0);
        this.pizarra.setScrollY(0);
        this.col = this.LAST_TRACE;
        if (((double) this.col) > this.limitedivi) {
            double d = this.limitedivi;
            double d2 = (double) this.col;
            Double.isNaN(d2);
            this.divi = (float) (d / d2);
        } else {
            this.divi = 1.0f;
        }
        this.col2 = (int) (((float) this.col) * this.divi);
        this.SAMPLES2 = (int) (((float) this.SAMPLES) * this.divi);
        this.TIMEWINDOW2 = this.TIMEWINDOW;
        this.DISTANCE_INTERVAL2 = this.DISTANCE_INTERVAL;
        this.col2 = this.col;
        ((LinearLayout) findViewById(R.id.zoombados)).setVisibility(4);
        for (int i = 0; i <= this.col; i++) {
            for (int i2 = 0; i2 < this.SAMPLES; i2++) {
                this.num = this.ma0[i][i2];
                this.ma2[i][i2] = this.num;
                this.ma3[i][i2] = this.num;
                if (this.num > this.max) {
                    this.max = this.num;
                    this.xmax = (double) i2;
                }
                if (this.num < this.min) {
                    this.min = this.num;
                    this.xmin = (double) i2;
                }
            }
        }
        this.previomax = this.max;
        this.previomin = this.min;
        dibuja();
        fondobn();
        coletilla();
    }

    public void reseto3() {
        this.tarea2.cancel(true);
        valores0();
        this.max = 0.0d;
        this.min = 0.0d;
        this.chivatocolor = 0;
        this.pizarra.setScaleX(1.0f);
        this.pizarra.setScaleY(1.0f);
        this.pizarra.setScrollX(0);
        this.pizarra.setScrollY(0);
        this.col = this.LAST_TRACE;
        this.cerado = 0;
        this.fondo = 0;
        this.der = 0;
        if (((double) this.col) > this.limitedivi) {
            double d = this.limitedivi;
            double d2 = (double) this.col;
            Double.isNaN(d2);
            this.divi = (float) (d / d2);
        } else {
            this.divi = 1.0f;
        }
        this.col2 = (int) (((float) this.col) * this.divi);
        this.SAMPLES2 = (int) (((float) this.SAMPLES) * this.divi);
        this.TIMEWINDOW2 = this.TIMEWINDOW;
        this.DISTANCE_INTERVAL2 = this.DISTANCE_INTERVAL;
        this.col2 = this.col;
        ((LinearLayout) findViewById(R.id.zoombados)).setVisibility(4);
        for (int i = 0; i <= this.col; i++) {
            for (int i2 = 0; i2 < this.SAMPLES; i2++) {
                this.num = this.ma0[i][i2];
                this.ma2[i][i2] = this.num;
                this.ma3[i][i2] = this.num;
                if (this.num > this.max) {
                    this.max = this.num;
                    this.xmax = (double) i2;
                }
                if (this.num < this.min) {
                    this.min = this.num;
                    this.xmin = (double) i2;
                }
            }
        }
        this.previomax = this.max;
        this.previomin = this.min;
        dibuja2();
        fondobn();
    }

    public void ponceros(View view) {
        TextView textView = (TextView) findViewById(R.id.textView10);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.addRule(5, R.id.imageButton2a);
        textView.setLayoutParams(layoutParams);
        double[] dArr = new double[this.SAMPLES];
        int i = 1;
        while (true) {
            if (i >= this.SAMPLES) {
                i = 0;
                break;
            } else if (this.ma0[this.col][i] < this.ma0[this.col][i - 1] - 400.0d) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        while (true) {
            if (i2 >= this.SAMPLES) {
                break;
            } else if (this.ma0[this.col][i2] > this.ma0[this.col][i2 - 1]) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        if (i > 2) {
            i -= 2;
        }
        this.cerado = i;
        double d = this.TIMEWINDOW;
        double d2 = (double) this.SAMPLES;
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) ((this.SAMPLES - this.cerado) - this.fondo);
        Double.isNaN(d4);
        this.TIMEWINDOW2 = d3 * d4;
        ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format((long) this.cerado));
        this.chivozoom = 3;
        dibujacerado();
        visible5();
        ((TextView) findViewById(R.id.buttosalir)).setVisibility(4);
        Toast.makeText(getApplicationContext(), this.lidioma[this.nidioma][48], 0).show();
    }

    public void dibujacerado() {
        rotulos();
        float f = this.divi * 50.0f;
        this.paint_n.setColor(-16776961);
        double d = (this.max - this.min) / 256.0d;
        for (int i = 0; i < (this.col - this.der) - this.iz; i++) {
            int i2 = 0;
            while (i2 < (this.SAMPLES - this.fondo) - this.cerado) {
                this.ma3[i][i2] = this.ma2[i][this.cerado + i2];
                this.num = (this.ma3[i][i2] - this.min) / d;
                if (this.num > 255.0d) {
                    this.num = 255.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 0.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                i2++;
                this.canvas.drawRect((this.divi * ((float) i)) + f, (this.divi * ((float) i2)) + f, (this.divi * ((float) (i + 1))) + f, (this.divi * ((float) i2)) + f, this.paint_n);
            }
        }
        this.pizarra.setImageBitmap(this.cuadro);
        this.pizarra.setScaleX(this.getescalex);
        this.pizarra.setScaleY(this.getescaley);
        this.previomax = this.max;
        this.previomin = this.min;
        perfil(this.numerodelperfil);
    }

    public void dibujafondo() {
        rotulos();
        float f = this.divi * 50.0f;
        this.paint_n.setColor(-16776961);
        double d = (this.max - this.min) / 256.0d;
        for (int i = 0; i < (this.col - this.der) - this.iz; i++) {
            int i2 = 0;
            while (i2 < (this.SAMPLES - this.fondo) - this.cerado) {
                this.ma3[i][i2] = this.ma2[i][i2];
                this.num = (this.ma3[i][i2] - this.min) / d;
                if (this.num > 255.0d) {
                    this.num = 255.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 0.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                i2++;
                this.canvas.drawRect((this.divi * ((float) i)) + f, (this.divi * ((float) i2)) + f, (this.divi * ((float) (i + 1))) + f, (this.divi * ((float) i2)) + f, this.paint_n);
            }
        }
        this.pizarra.setImageBitmap(this.cuadro);
        this.pizarra.setScaleX(this.getescalex);
        this.pizarra.setScaleY(this.getescaley);
        this.previomax = this.max;
        this.previomin = this.min;
        perfil(this.numerodelperfil);
    }

    public void dibujaiz() {
        rotulos();
        float f = this.divi * 50.0f;
        this.paint_n.setColor(-16776961);
        double d = (this.max - this.min) / 256.0d;
        for (int i = 0; i < (this.col - this.der) - this.iz; i++) {
            int i2 = 0;
            while (i2 < (this.SAMPLES - this.fondo) - this.cerado) {
                this.ma3[i][i2] = this.ma2[this.iz + i][i2];
                this.num = (this.ma3[i][i2] - this.min) / d;
                if (this.num > 255.0d) {
                    this.num = 255.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 0.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                i2++;
                this.canvas.drawRect((this.divi * ((float) i)) + f, (this.divi * ((float) i2)) + f, (this.divi * ((float) (i + 1))) + f, (this.divi * ((float) i2)) + f, this.paint_n);
            }
        }
        this.pizarra.setImageBitmap(this.cuadro);
        this.pizarra.setScaleX(this.getescalex);
        this.pizarra.setScaleY(this.getescaley);
        this.previomax = this.max;
        this.previomin = this.min;
        perfil(this.numerodelperfil);
    }

    public void llenaeltxt() {
        String charSequence = ((TextView) findViewById(R.id.textView)).getText().toString();
        if (this.chivozoom == 1) {
            charSequence = charSequence + "\nGan: " + this.nF00.format(this.contraste);
        }
        if (this.chivozoom == 2) {
            charSequence = charSequence + "\nTrn: " + this.nF00.format(this.trunca);
        }
        if (this.chivozoom == 3) {
            charSequence = charSequence + "\nZro: " + this.cerado;
        }
        if (this.chivozoom == 4) {
            charSequence = charSequence + "\nDdv: " + this.chivoderi;
        }
        if (this.chivozoom == 5) {
            charSequence = charSequence + "\nDdh: " + this.chivoderi;
        }
        if (this.chivozoom == 6) {
            charSequence = charSequence + "\nAtn: " + this.nF00.format(this.contraste2);
        }
        if (this.chivozoom == 7) {
            charSequence = charSequence + "\nInf: " + this.fondo;
        }
        if (this.chivozoom == 8) {
            charSequence = charSequence + "\nDer: " + this.der;
        }
        if (this.chivozoom == 9) {
            charSequence = charSequence + "\nIzq: " + this.iz;
        }
        if (this.chivozoom == 10) {
            charSequence = charSequence + "\nSua: " + this.nF00.format(this.suavito);
        }
        if (this.chivozoom == 18) {
            charSequence = charSequence + "\nSuh: " + this.nF00.format(this.suavitoh);
        }
        if (this.chivozoom == 11) {
            charSequence = charSequence + "\nMed: " + this.nF00.format(this.regladim);
        }
        if (this.chivozoom == 12) {
            charSequence = charSequence + "\nNor: " + this.nF00.format(this.exponente);
        }
        if (this.chivozoom == 13) {
            charSequence = charSequence + "\nCol: " + this.nF00.format(this.chivocolor);
        }
        if (this.chivozoom == 14) {
            charSequence = charSequence + "\nFre: " + this.nF00.format(this.kfrec);
        }
        if (this.chivozoom == 15) {
            charSequence = charSequence + "\nMCu: " + this.nF00.format(this.regladim);
        }
        if (this.chivozoom == 16) {
            charSequence = charSequence + "\nMHy: " + this.nF00.format(this.regladim);
        }
        if (this.chivozoom == 17) {
            charSequence = charSequence + "\nMPb: " + this.nF00.format(this.regladim);
        }
        if (this.chivozoom == 19) {
            charSequence = charSequence + "\nPtn: " + this.nF00.format(this.patron);
        }
        if (this.chivozoom == 20) {
            charSequence = charSequence + "\nF2a: " + this.nF00.format(this.fouri);
        }
        this.textoaux = charSequence;
        ((TextView) findViewById(R.id.textView)).setText(charSequence);
        this.chivozoom = 0;
    }

    public void exotexto(View view) {
        Context baseContext = getBaseContext();
        Toast.makeText(baseContext, this.lidioma[this.nidioma][49] + this.textoaux, 1).show();
    }

    public void derideri(View view) {
        TextView textView = (TextView) findViewById(R.id.textView10);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.addRule(5, R.id.imageButton5);
        textView.setLayoutParams(layoutParams);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(this.lidioma[this.nidioma][50]);
        builder.setPositiveButton(this.lidioma[this.nidioma][51], new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass13 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Georradar.this.chivoderi = 1;
                Georradar.this.dibujaderideri();
                Georradar.this.chivozoom = 4;
                Georradar.this.visible5();
                ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format((long) Georradar.this.chivoderi));
            }
        });
        builder.setNegativeButton(this.lidioma[this.nidioma][52], new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass14 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Georradar.this.chivoderj = 1.0d;
                Georradar.this.dibujaderiderj();
                Georradar.this.chivozoom = 5;
                Georradar.this.visible5();
                ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.chivoderj));
            }
        });
        builder.setNeutralButton(this.lidioma[this.nidioma][53], new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass15 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Georradar.this.chivozoom = 19;
                Georradar.this.dibupatron();
                Georradar.this.visible5();
                ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.patron));
            }
        });
        builder.show();
    }

    public void deriderj(View view) {
        this.chivoderj = 1.0d;
        dibujaderiderj();
        this.chivozoom = 5;
        visible5();
        ((Button) findViewById(R.id.buttonnor)).setText(this.nF00.format(this.chivoderj));
        this.tecontrol.setText("Variabilidad horizontal");
    }

    public void homogenio(View view) {
        double d = 1.0d;
        this.previomax = 1.0d;
        this.previomin = -1.0d;
        this.chivozoom = 6;
        rotulos();
        int i = (this.col - this.der) - this.iz;
        int i2 = (this.SAMPLES - this.cerado) - this.fondo;
        float f = this.divi * 50.0f;
        int i3 = 0;
        while (i3 < i) {
            double d2 = 0.001d;
            double d3 = -0.001d;
            for (int i4 = 0; i4 < i2 / 5; i4++) {
                if (this.ma3[i3][i4] > d2) {
                    d2 = this.ma2[i3][i4];
                }
                if (this.ma3[i3][i4] < d3) {
                    d3 = this.ma2[i3][i4];
                }
            }
            double d4 = -d3;
            if (d2 >= d4) {
                d4 = d2;
            }
            int i5 = 0;
            while (i5 < i2) {
                this.ma3[i3][i5] = this.ma2[i3][i5] / d4;
                if (this.ma3[i3][i5] > d) {
                    this.ma3[i3][i5] = d;
                }
                if (this.ma3[i3][i5] < -1.0d) {
                    this.ma3[i3][i5] = -1.0d;
                }
                this.num = (this.ma3[i3][i5] * 128.0d) + 128.0d;
                if (this.num > 255.0d) {
                    this.num = 255.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 0.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                i5++;
                this.canvas.drawRect((this.divi * ((float) i3)) + f, (this.divi * ((float) i5)) + f, (this.divi * ((float) (i3 + 1))) + f, (this.divi * ((float) i5)) + f, this.paint_n);
                d = 1.0d;
            }
            i3++;
            d = 1.0d;
        }
        coletilla();
        ((LinearLayout) findViewById(R.id.zoombados)).setVisibility(0);
        ((Button) findViewById(R.id.buttonfij)).setVisibility(0);
        ((Button) findViewById(R.id.buttonnor)).setVisibility(4);
        ((Button) findViewById(R.id.buttonmen)).setVisibility(4);
        ((Button) findViewById(R.id.buttonmas)).setVisibility(4);
        this.tecontrol.setText("Fijar homogeinización");
    }

    public void difuso(View view) {
        float f;
        rotulos();
        int i = (this.col - this.der) - this.iz;
        int i2 = (this.SAMPLES - this.cerado) - this.fondo;
        float f2 = this.divi * 50.0f;
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                this.ma3[i3][i4] = 0.0d;
            }
        }
        double d = 0.001d;
        double d2 = -0.001d;
        int i5 = 0;
        double d3 = 0.001d;
        while (i5 <= i) {
            double d4 = 0.5235987755983d;
            double d5 = d3;
            int i6 = 0;
            while (i6 < i2) {
                int i7 = i6 + 1;
                double max2 = Math.max(Math.atan((double) (1 / i7)), d);
                double d6 = -0.5235987755983d;
                while (d6 < d4) {
                    double sin = Math.sin(d6);
                    double d7 = (double) i6;
                    Double.isNaN(d7);
                    double d8 = (double) i5;
                    Double.isNaN(d8);
                    double d9 = (sin * d7) + d8;
                    double cos = Math.cos(d6);
                    Double.isNaN(d7);
                    Double.isNaN(d7);
                    double d10 = (cos * d7) + d7;
                    if (d9 <= 0.0d || d10 <= 0.0d) {
                        f = f2;
                    } else {
                        f = f2;
                        if (d9 < ((double) i) && d10 < ((double) i2)) {
                            this.num = Math.abs(Math.cos(3.0d * d6)) * this.ma2[i5][i6];
                            double[] dArr = this.ma3[(int) d9];
                            int i8 = (int) d10;
                            dArr[i8] = dArr[i8] + this.num;
                            if (this.num > d5) {
                                d5 = this.num;
                            }
                            if (this.num < d2) {
                                d2 = this.num;
                            }
                        }
                    }
                    d6 += max2;
                    f2 = f;
                    d = 0.001d;
                    d4 = 0.5235987755983d;
                }
                i6 = i7;
            }
            i5++;
            d3 = d5;
            d = 0.001d;
        }
        float f3 = f2;
        double d11 = -d2;
        if (d3 >= d11) {
            d11 = d3;
        }
        double d12 = (d11 - d2) / 256.0d;
        for (int i9 = 0; i9 < i; i9++) {
            int i10 = 0;
            while (i10 < i2) {
                this.num = (this.ma3[i9][i10] - d2) / d12;
                if (this.num > 255.0d) {
                    this.num = 255.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 0.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                int i11 = i10 + 1;
                this.canvas.drawRect((this.divi * ((float) i9)) + f3, (this.divi * ((float) i10)) + f3, (this.divi * ((float) (i9 + 1))) + f3, (this.divi * ((float) i11)) + f3, this.paint_n);
                this.ma2[i9][i10] = this.ma3[i9][i10];
                i10 = i11;
            }
        }
        this.previomax = d11;
        this.previomin = d2;
        coletilla();
    }

    public void dibujaregla() {
        double d;
        double d2;
        Paint paint;
        int argb;
        float width = (float) this.cuadrob.getWidth();
        this.cuadrob = Bitmap.createBitmap((int) width, (int) (((float) this.SAMPLES2) + (this.divi * 70.0f)), Bitmap.Config.ARGB_8888);
        this.paint_nb.setColor(-16776961);
        this.paint_nb.setStrokeWidth(width / 500.0f);
        this.canvasb = new Canvas(this.cuadrob);
        double d3 = (double) this.divi;
        Double.isNaN(d3);
        double d4 = (double) this.col2;
        Double.isNaN(d4);
        double d5 = (d3 * 100.0d) + d4;
        double d6 = (double) this.divi;
        Double.isNaN(d6);
        double d7 = (double) this.SAMPLES2;
        Double.isNaN(d7);
        double d8 = d5 / ((d6 * 70.0d) + d7);
        double width2 = (double) this.pizarra.getWidth();
        Double.isNaN(width2);
        double height = (double) this.pizarra.getHeight();
        Double.isNaN(height);
        if (d8 > (width2 + 1.0E-5d) / (height + 1.0E-5d)) {
            double d9 = (double) (((float) this.col2) + (this.divi * 99.0f));
            double d10 = (double) this.SAMPLES2;
            double d11 = (double) this.divi;
            Double.isNaN(d11);
            Double.isNaN(d10);
            Double.isNaN(d9);
            double d12 = d9 / (d10 + (d11 * 70.0d));
            double width3 = (double) this.pizarra.getWidth();
            Double.isNaN(width3);
            double d13 = d12 / width3;
            double height2 = (double) this.pizarra.getHeight();
            Double.isNaN(height2);
            d = d13 * height2;
        } else {
            d = 1.0d;
        }
        double sqrt = (2.99792458E8d / Math.sqrt(this.refraccion)) / 2.0E9d;
        double d14 = this.regladim;
        double d15 = (double) this.SAMPLES2;
        Double.isNaN(d15);
        double scaleY = (double) this.pizarra.getScaleY();
        Double.isNaN(scaleY);
        double d16 = ((((d14 * d15) / this.TIMEWINDOW2) / sqrt) * scaleY) / d;
        double height3 = (double) (this.canvasb.getHeight() / 2);
        if (this.DISTANCE_INTERVAL > 0.0d) {
            double d17 = this.regladim / this.DISTANCE_INTERVAL;
            double d18 = (double) this.divi;
            Double.isNaN(d18);
            double d19 = d17 * d18;
            double scaleX = (double) this.pizarra.getScaleX();
            Double.isNaN(scaleX);
            double d20 = (d19 * scaleX) / d;
            if (Math.abs((d20 / d16) - 1.0d) > 0.1d) {
                paint = this.paint_nb;
                d2 = sqrt;
                argb = Color.argb(100, 0, 255, 0);
            } else {
                d2 = sqrt;
                paint = this.paint_nb;
                argb = Color.argb(100, 0, 255, 255);
            }
            paint.setColor(argb);
            this.paint_nb.setStyle(Paint.Style.FILL);
            Canvas canvas2 = this.canvasb;
            double d21 = (double) (width / 2.0f);
            double d22 = d20 / 2.0d;
            Double.isNaN(d21);
            double d23 = d;
            float f = (float) (d21 - d22);
            float f2 = (float) height3;
            Double.isNaN(d21);
            double d24 = d20;
            float f3 = (float) (d21 + d22);
            double d25 = d16 / 2.0d;
            Double.isNaN(height3);
            double d26 = height3 + d25;
            float f4 = width;
            float f5 = (float) d26;
            canvas2.drawRect(f, f2, f3, f5, this.paint_nb);
            this.paint_nb.setColor(Color.argb(100, 255, 127, 0));
            this.paint_nb.setStyle(Paint.Style.FILL);
            RectF rectF = new RectF();
            Double.isNaN(height3);
            double d27 = height3 - d25;
            rectF.set(f, (float) d27, f3, f5);
            RectF rectF2 = rectF;
            this.canvasb.drawArc(rectF2, 180.0f, 180.0f, true, this.paint_nb);
            this.paint_nb.setColor(-16776961);
            this.paint_nb.setStyle(Paint.Style.STROKE);
            this.canvasb.drawArc(rectF2, 180.0f, 180.0f, false, this.paint_nb);
            Canvas canvas3 = this.canvasb;
            Double.isNaN(d21);
            Double.isNaN(d21);
            canvas3.drawLine((float) (d21 - d24), f5, (float) (d21 + d24), f5, this.paint_nb);
            float f6 = (float) (d26 + d22);
            float f7 = f2;
            this.canvasb.drawLine(f, f6, f, f7, this.paint_nb);
            this.canvasb.drawLine(f3, f6, f3, f7, this.paint_nb);
            double d28 = this.regladim / 2.0d;
            this.paint_nb.setColor(Color.argb(100, 255, 0, 255));
            boolean z = true;
            float f8 = f4 / 100.0f;
            this.paint_nb.setStrokeWidth(f8);
            double d29 = -2.82842712474619d;
            float f9 = 0.0f;
            float f10 = 0.0f;
            while (d29 <= 2.82842712474619d) {
                double d30 = d29 * d28;
                double d31 = ((d30 * d30) / 4.0d) / d28;
                double d32 = d28;
                double d33 = d30 / this.DISTANCE_INTERVAL;
                double d34 = (double) this.divi;
                Double.isNaN(d34);
                double d35 = d33 * d34;
                double scaleX2 = (double) this.pizarra.getScaleX();
                Double.isNaN(scaleX2);
                Double.isNaN(d21);
                float f11 = (float) (((d35 * scaleX2) / d23) + d21);
                double d36 = (double) this.SAMPLES2;
                Double.isNaN(d36);
                double scaleY2 = (double) this.pizarra.getScaleY();
                Double.isNaN(scaleY2);
                float f12 = (float) (d27 + (((((d31 * d36) / this.TIMEWINDOW2) / d2) * scaleY2) / d23));
                if (z) {
                    z = false;
                } else {
                    this.canvasb.drawLine(f11, f12, f9, f10, this.paint_nb);
                }
                d29 += 0.1d;
                f9 = f11;
                f10 = f12;
                d28 = d32;
            }
            double d37 = d28;
            double scrollY = (double) this.pizarra.getScrollY();
            Double.isNaN(scrollY);
            double height4 = (double) this.pizarra.getHeight();
            Double.isNaN(height4);
            double d38 = (scrollY * d23) + (height4 / 2.0d);
            double height5 = (double) this.pizarra.getHeight();
            Double.isNaN(height5);
            double d39 = d38 / height5;
            double d40 = (double) this.SAMPLES2;
            double d41 = (double) this.divi;
            Double.isNaN(d41);
            Double.isNaN(d40);
            double d42 = (double) this.divi;
            Double.isNaN(d42);
            double d43 = (double) this.SAMPLES2;
            Double.isNaN(d43);
            double d44 = (((((d39 * (d40 + (d41 * 70.0d))) - (d42 * 50.0d)) * 1.0d) * this.TIMEWINDOW2) * d2) / d43;
            double d45 = d44 - (this.regladim / 2.0d);
            double d46 = (d44 * d44) - (d45 * d45);
            double d47 = (double) this.SAMPLES2;
            Double.isNaN(d47);
            double scaleY3 = (double) this.pizarra.getScaleY();
            Double.isNaN(scaleY3);
            Double.isNaN(height3);
            float f13 = (float) (height3 - (((((d44 * d47) / this.TIMEWINDOW2) / d2) * scaleY3) / d23));
            this.canvasb.drawLine(0.0f, f13, 1000.0f, f13, this.paint_nb);
            this.paint_nb.setColor(Color.argb(100, 255, 255, 0));
            this.paint_nb.setStrokeWidth(f8);
            double d48 = -2.82842712474619d;
            boolean z2 = true;
            while (d48 <= 2.82842712474619d) {
                double d49 = d48 * d37;
                double sqrt2 = (Math.sqrt(Math.abs(((d49 * d49) / d46) + 1.0d)) * d45) - d45;
                double d50 = d45;
                double d51 = d49 / this.DISTANCE_INTERVAL;
                double d52 = (double) this.divi;
                Double.isNaN(d52);
                double d53 = d51 * d52;
                double scaleX3 = (double) this.pizarra.getScaleX();
                Double.isNaN(scaleX3);
                Double.isNaN(d21);
                float f14 = (float) (((d53 * scaleX3) / d23) + d21);
                double d54 = (double) this.SAMPLES2;
                Double.isNaN(d54);
                double scaleY4 = (double) this.pizarra.getScaleY();
                Double.isNaN(scaleY4);
                float f15 = (float) (d27 + (((((sqrt2 * d54) / this.TIMEWINDOW2) / d2) * scaleY4) / d23));
                if (z2) {
                    z2 = false;
                } else {
                    this.canvasb.drawLine(f14, f15, f9, f10, this.paint_nb);
                }
                d48 += 0.1d;
                f9 = f14;
                f10 = f15;
                d45 = d50;
            }
            this.paint_nb.setStrokeWidth(f4 / 50.0f);
        } else {
            d2 = sqrt;
            this.paint_nb.setColor(Color.argb(100, 0, 255, 0));
            this.paint_nb.setStyle(Paint.Style.FILL);
            Canvas canvas4 = this.canvasb;
            float f16 = (float) height3;
            float f17 = (float) (this.col2 + 100);
            double d55 = d16 / 2.0d;
            Double.isNaN(height3);
            float f18 = (float) (height3 + d55);
            canvas4.drawRect(0.0f, f16, f17, f18, this.paint_nb);
            this.paint_nb.setColor(Color.argb(100, 255, 127, 0));
            Canvas canvas5 = this.canvasb;
            Double.isNaN(height3);
            float f19 = (float) (height3 - d55);
            canvas5.drawRect(0.0f, f19, (float) (this.col2 + 100), f16, this.paint_nb);
            this.paint_nb.setColor(-16776961);
            this.paint_nb.setStyle(Paint.Style.STROKE);
            this.canvasb.drawLine(0.0f, f19, (float) (this.col2 + 100), f19, this.paint_nb);
            this.canvasb.drawLine(0.0f, f18, (float) (this.col2 + 100), f18, this.paint_nb);
        }
        this.pizarrab.setImageBitmap(this.cuadrob);
        this.paint_n.setColor(Color.rgb(240, 240, 160));
        this.paint_n.setStyle(Paint.Style.FILL);
        this.canvas.drawRect((float) (this.col2 + 50), 50.0f, (float) (this.col2 + 100), (float) (this.SAMPLES2 + 55), this.paint_n);
        this.paint_n.setColor((int) ViewCompat.MEASURED_STATE_MASK);
        float f20 = this.divi * 50.0f;
        double d56 = this.DISTANCE_INTERVAL;
        int i = this.col2;
        this.canvas.drawLine(40.0f, f20, 40.0f, ((float) this.SAMPLES2) + f20, this.paint_n);
        float f21 = 0.0f;
        while (true) {
            double d57 = (double) f21;
            if (d57 >= this.TIMEWINDOW2) {
                break;
            }
            double d58 = (double) f20;
            double d59 = this.TIMEWINDOW2;
            Double.isNaN(d57);
            double d60 = d57 / d59;
            double d61 = (double) this.SAMPLES2;
            Double.isNaN(d61);
            Double.isNaN(d58);
            float f22 = (float) (d58 + (d60 * d61));
            this.canvas.drawLine(40.0f, f22, 35.0f, f22, this.paint_n);
            this.canvas.drawText(Float.toString(f21), 9.0f, f22 + 3.0f, this.paint_n);
            f21 += 5.0f;
        }
        this.canvas.drawLine(40.0f, ((float) this.SAMPLES2) + f20, 35.0f, ((float) this.SAMPLES2) + f20, this.paint_n);
        this.canvas.drawText(this.nF00.format(this.TIMEWINDOW2) + "ns.", 2.0f, ((float) this.SAMPLES2) + f20, this.paint_n);
        this.canvas.drawLine(((float) this.col2) + f20 + 10.0f, f20, ((float) this.col2) + f20 + 10.0f, ((float) this.SAMPLES2) + f20, this.paint_n);
        float f23 = this.TIMEWINDOW2 < 25.0d ? 0.1f : 0.5f;
        float f24 = 0.0f;
        while (true) {
            double d62 = (double) f24;
            if (d62 < this.TIMEWINDOW2 * d2) {
                double d63 = (double) f20;
                double d64 = this.TIMEWINDOW2;
                Double.isNaN(d62);
                double d65 = (double) this.SAMPLES2;
                Double.isNaN(d65);
                Double.isNaN(d63);
                float f25 = (float) (d63 + (((d62 / d64) * d65) / d2));
                this.canvas.drawLine(((float) this.col2) + f20 + 10.0f, f25, ((float) this.col2) + f20 + 17.0f, f25, this.paint_n);
                this.canvas.drawText(this.nF0.format(d62), ((float) this.col2) + f20 + 19.0f, f25 + 3.0f, this.paint_n);
                f24 += f23;
            } else {
                this.canvas.drawLine(((float) this.col2) + f20 + 10.0f, ((float) this.SAMPLES2) + f20, ((float) this.col2) + f20 + 17.0f, ((float) this.SAMPLES2) + f20, this.paint_n);
                this.canvas.drawText(this.nF00.format(this.TIMEWINDOW2 * d2) + "m.", ((float) this.col2) + f20 + 17.0f, ((float) this.SAMPLES2) + f20, this.paint_n);
                this.pizarra.setImageBitmap(this.cuadro);
                diburegla2(this.pizarra.getScrollY());
                return;
            }
        }
    }

    public void diburegla2(int i) {
        double d;
        double d2 = (double) this.divi;
        Double.isNaN(d2);
        double d3 = (double) this.col2;
        Double.isNaN(d3);
        double d4 = (d2 * 100.0d) + d3;
        double d5 = (double) this.divi;
        Double.isNaN(d5);
        double d6 = (double) this.SAMPLES2;
        Double.isNaN(d6);
        double d7 = d4 / ((d5 * 70.0d) + d6);
        double width = (double) this.pizarra.getWidth();
        Double.isNaN(width);
        double height = (double) this.pizarra.getHeight();
        Double.isNaN(height);
        if (d7 > (width + 1.0E-5d) / (height + 1.0E-5d)) {
            double d8 = (double) this.col2;
            double d9 = (double) this.divi;
            Double.isNaN(d9);
            Double.isNaN(d8);
            double d10 = d8 + (d9 * 100.0d);
            double d11 = (double) this.SAMPLES2;
            double d12 = (double) this.divi;
            Double.isNaN(d12);
            Double.isNaN(d11);
            double d13 = d10 / (d11 + (d12 * 70.0d));
            double width2 = (double) this.pizarra.getWidth();
            Double.isNaN(width2);
            double d14 = d13 / width2;
            double height2 = (double) this.pizarra.getHeight();
            Double.isNaN(height2);
            d = d14 * height2;
        } else {
            d = 1.0d;
        }
        int i2 = this.col;
        int i3 = this.der;
        int i4 = this.iz;
        int i5 = this.SAMPLES;
        int i6 = this.cerado;
        int i7 = this.fondo;
        this.pizarrac.getWidth();
        double height3 = (double) this.pizarrac.getHeight();
        double d15 = this.regladim;
        Double.isNaN(height3);
        double sqrt = (((d15 / ((2.99792458E8d / Math.sqrt(this.refraccion)) / 2.0E9d)) * height3) / this.TIMEWINDOW2) / 2.0d;
        double d16 = (double) i;
        Double.isNaN(d16);
        double height4 = (double) this.pizarra.getHeight();
        Double.isNaN(height4);
        double height5 = (double) this.pizarra.getHeight();
        Double.isNaN(height5);
        double d17 = (((d16 * 1.0d) * d) + (height4 * 0.5d)) / height5;
        double d18 = (double) this.SAMPLES2;
        double d19 = (double) this.divi;
        Double.isNaN(d19);
        Double.isNaN(d18);
        double d20 = (double) this.divi;
        Double.isNaN(d20);
        double d21 = ((d17 * (d18 + (d19 * 70.0d))) - (d20 * 50.0d)) * 1.0d;
        this.posicionFY = d21;
        double d22 = (double) this.SAMPLES2;
        Double.isNaN(d22);
        Double.isNaN(height3);
        int i8 = (int) ((d21 / (d22 * 1.0d)) * height3);
        this.paint_nc.setColor(Color.argb(100, 0, 255, 0));
        this.paint_nc.setStyle(Paint.Style.FILL);
        double d23 = (double) i8;
        Double.isNaN(d23);
        double d24 = d23 + sqrt;
        if (d24 > ((double) this.pizarrac.getHeight())) {
            this.canvasc.drawRect(0.0f, (float) this.pizarrac.getHeight(), (float) this.pizarrac.getWidth(), (float) i8, this.paint_nc);
        } else {
            this.canvasc.drawRect(0.0f, (float) d24, (float) this.pizarrac.getWidth(), (float) i8, this.paint_nc);
        }
        if (i8 < 0) {
            this.canvasc.drawRect(0.0f, (float) d24, (float) this.pizarrac.getWidth(), 0.0f, this.paint_nc);
        } else {
            this.canvasc.drawRect(0.0f, (float) d24, (float) this.pizarrac.getWidth(), (float) i8, this.paint_nc);
        }
        this.paint_nc.setColor(Color.argb(100, 255, 127, 0));
        Double.isNaN(d23);
        double d25 = d23 - sqrt;
        if (d25 < 0.0d) {
            this.canvasc.drawRect(0.0f, (float) i8, (float) this.pizarrac.getWidth(), 0.0f, this.paint_nc);
        } else {
            this.canvasc.drawRect(0.0f, (float) i8, (float) this.pizarrac.getWidth(), (float) d25, this.paint_nc);
        }
        if (i8 > this.pizarrac.getHeight()) {
            this.canvasc.drawRect(0.0f, (float) this.pizarrac.getHeight(), (float) this.pizarrac.getWidth(), (float) d25, this.paint_nc);
        } else {
            this.canvasc.drawRect(0.0f, (float) i8, (float) this.pizarrac.getWidth(), (float) d25, this.paint_nc);
        }
        this.pizarrac.setImageBitmap(this.cuadroc);
    }

    public void regla(View view) {
        TextView textView = (TextView) findViewById(R.id.textView10);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.addRule(5, R.id.imageButton12);
        textView.setLayoutParams(layoutParams);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(this.lidioma[this.nidioma][54]);
        final EditText editText = new EditText(this);
        builder.setView(editText);
        editText.setText(this.nF00.format(this.refraccion).replace(",", "."));
        editText.setInputType(8194);
        builder.setPositiveButton(this.lidioma[this.nidioma][55], new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass16 */

            public void onClick(DialogInterface dialogInterface, int i) {
                double cuantoes = Georradar.this.cuantoes(editText.getText().toString());
                if (cuantoes >= 0.0d) {
                    Georradar.this.refraccion = cuantoes;
                    ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.refraccion));
                    Georradar.this.chivozoom = 11;
                    Georradar.this.visible5();
                    ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.regladim));
                    Georradar.this.lanzaregla();
                    return;
                }
                Toast.makeText(Georradar.this.getBaseContext(), Georradar.this.lidioma[Georradar.this.nidioma][27], 1).show();
            }
        });
        builder.setNegativeButton(this.lidioma[this.nidioma][56], new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass17 */

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.show();
    }

    public void lanzaregla() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(this.lidioma[this.nidioma][57]);
        TextView textView = new TextView(this);
        builder.setView(textView);
        if (this.DISTANCE_INTERVAL > 0.0d) {
            textView.setText(this.lidioma[this.nidioma][58]);
        } else {
            builder.setCancelable(false);
            textView.setText(this.lidioma[this.nidioma][59]);
        }
        if (this.DISTANCE_INTERVAL > 0.0d) {
            builder.setPositiveButton(this.lidioma[this.nidioma][60], new DialogInterface.OnClickListener() {
                /* class com.nieto.luis.gpr.Georradar.AnonymousClass18 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    Georradar.this.chivozoom = 15;
                    Georradar.this.dibujareglacua();
                }
            });
        } else {
            builder.setPositiveButton(this.lidioma[this.nidioma][61], new DialogInterface.OnClickListener() {
                /* class com.nieto.luis.gpr.Georradar.AnonymousClass19 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    Georradar.this.chivozoom = 15;
                    Georradar.this.dibujareglacua();
                }
            });
        }
        if (this.DISTANCE_INTERVAL > 0.0d) {
            builder.setNegativeButton(this.lidioma[this.nidioma][62], new DialogInterface.OnClickListener() {
                /* class com.nieto.luis.gpr.Georradar.AnonymousClass20 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    Georradar.this.chivozoom = 16;
                    Georradar.this.dibujareglahip();
                }
            });
        } else {
            builder.setNegativeButton(this.lidioma[this.nidioma][56], new DialogInterface.OnClickListener() {
                /* class com.nieto.luis.gpr.Georradar.AnonymousClass21 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    ((LinearLayout) Georradar.this.findViewById(R.id.zoombados)).setVisibility(4);
                }
            });
        }
        builder.show();
    }

    public void dibujareglacua() {
        double d;
        Paint paint;
        int argb;
        float width = (float) this.cuadrob.getWidth();
        this.cuadrob = Bitmap.createBitmap((int) width, (int) (((float) this.SAMPLES2) + (this.divi * 70.0f)), Bitmap.Config.ARGB_8888);
        this.paint_nb.setColor(-16776961);
        this.paint_nb.setStrokeWidth(width / 500.0f);
        this.canvasb = new Canvas(this.cuadrob);
        double d2 = (double) this.divi;
        Double.isNaN(d2);
        double d3 = (double) this.col2;
        Double.isNaN(d3);
        double d4 = (d2 * 100.0d) + d3;
        double d5 = (double) this.divi;
        Double.isNaN(d5);
        double d6 = (double) this.SAMPLES2;
        Double.isNaN(d6);
        double d7 = d4 / ((d5 * 70.0d) + d6);
        double width2 = (double) this.pizarra.getWidth();
        Double.isNaN(width2);
        double height = (double) this.pizarra.getHeight();
        Double.isNaN(height);
        if (d7 > (width2 + 1.0E-5d) / (height + 1.0E-5d)) {
            int i = this.col2;
            float f = this.divi;
            int i2 = this.SAMPLES2;
            float f2 = this.divi;
            this.pizarra.getWidth();
            this.pizarra.getHeight();
        }
        double sqrt = (2.99792458E8d / Math.sqrt(this.refraccion)) / 2.0E9d;
        double d8 = this.regladim;
        double d9 = (double) this.SAMPLES2;
        Double.isNaN(d9);
        double scaleY = (double) this.pizarra.getScaleY();
        Double.isNaN(scaleY);
        double d10 = ((((d8 * d9) / this.TIMEWINDOW2) / sqrt) * scaleY) / 1.0d;
        double height2 = (double) (this.canvasb.getHeight() / 2);
        if (this.DISTANCE_INTERVAL > 0.0d) {
            double d11 = this.regladim / this.DISTANCE_INTERVAL;
            double d12 = (double) this.divi;
            Double.isNaN(d12);
            double d13 = d11 * d12;
            double scaleX = (double) this.pizarra.getScaleX();
            Double.isNaN(scaleX);
            double d14 = (d13 * scaleX) / 1.0d;
            if (Math.abs((d14 / d10) - 1.0d) > 0.1d) {
                paint = this.paint_nb;
                argb = Color.argb(100, 0, 255, 0);
            } else {
                paint = this.paint_nb;
                argb = Color.argb(100, 0, 255, 255);
            }
            paint.setColor(argb);
            this.paint_nb.setStyle(Paint.Style.FILL);
            Canvas canvas2 = this.canvasb;
            double d15 = (double) (width / 2.0f);
            double d16 = d14 / 2.0d;
            Double.isNaN(d15);
            float f3 = (float) (d15 - d16);
            float f4 = (float) height2;
            Double.isNaN(d15);
            d = sqrt;
            float f5 = (float) (d15 + d16);
            double d17 = d10 / 2.0d;
            Double.isNaN(height2);
            double d18 = d14;
            double d19 = height2 + d17;
            float f6 = (float) d19;
            float f7 = f3;
            float f8 = f5;
            canvas2.drawRect(f7, f4, f8, f6, this.paint_nb);
            float f9 = width;
            this.paint_nb.setColor(Color.argb(100, 255, 127, 0));
            this.paint_nb.setStyle(Paint.Style.FILL);
            Canvas canvas3 = this.canvasb;
            Double.isNaN(height2);
            double d20 = height2 - d17;
            float f10 = (float) d20;
            canvas3.drawRect(f7, f10, f8, f4, this.paint_nb);
            this.paint_nb.setColor(-16776961);
            this.paint_nb.setStyle(Paint.Style.STROKE);
            Canvas canvas4 = this.canvasb;
            Double.isNaN(d15);
            float f11 = (float) (d15 - d18);
            Double.isNaN(d15);
            float f12 = (float) (d15 + d18);
            canvas4.drawLine(f11, f10, f12, f10, this.paint_nb);
            this.canvasb.drawLine(f11, f6, f12, f6, this.paint_nb);
            float f13 = (float) (d19 + d16);
            float f14 = (float) (d20 - d16);
            this.canvasb.drawLine(f3, f13, f3, f14, this.paint_nb);
            this.canvasb.drawLine(f5, f13, f5, f14, this.paint_nb);
            float f15 = f4;
            this.canvasb.drawLine(f3, f13, f3, f15, this.paint_nb);
            this.canvasb.drawLine(f5, f13, f5, f15, this.paint_nb);
            this.paint_nb.setStrokeWidth(f9 / 50.0f);
        } else {
            d = sqrt;
            this.paint_nb.setColor(Color.argb(100, 0, 255, 0));
            this.paint_nb.setStyle(Paint.Style.FILL);
            Canvas canvas5 = this.canvasb;
            float f16 = (float) height2;
            float f17 = (float) (this.col2 + 100);
            double d21 = d10 / 2.0d;
            Double.isNaN(height2);
            float f18 = (float) (height2 + d21);
            canvas5.drawRect(0.0f, f16, f17, f18, this.paint_nb);
            this.paint_nb.setColor(Color.argb(100, 255, 127, 0));
            Canvas canvas6 = this.canvasb;
            Double.isNaN(height2);
            float f19 = (float) (height2 - d21);
            canvas6.drawRect(0.0f, f19, (float) (this.col2 + 100), f16, this.paint_nb);
            this.paint_nb.setColor(-16776961);
            this.paint_nb.setStyle(Paint.Style.STROKE);
            this.canvasb.drawLine(0.0f, f19, (float) (this.col2 + 100), f19, this.paint_nb);
            this.canvasb.drawLine(0.0f, f18, (float) (this.col2 + 100), f18, this.paint_nb);
        }
        this.pizarrab.setImageBitmap(this.cuadrob);
        this.paint_n.setColor(Color.rgb(240, 240, 160));
        this.paint_n.setStyle(Paint.Style.FILL);
        this.canvas.drawRect((float) (this.col2 + 50), 50.0f, (float) (this.col2 + 100), (float) (this.SAMPLES2 + 55), this.paint_n);
        this.paint_n.setColor((int) ViewCompat.MEASURED_STATE_MASK);
        float f20 = this.divi * 50.0f;
        double d22 = this.DISTANCE_INTERVAL;
        int i3 = this.col2;
        this.canvas.drawLine(40.0f, f20, 40.0f, ((float) this.SAMPLES2) + f20, this.paint_n);
        float f21 = 0.0f;
        float f22 = 0.0f;
        while (true) {
            double d23 = (double) f22;
            if (d23 >= this.TIMEWINDOW2) {
                break;
            }
            double d24 = (double) f20;
            double d25 = this.TIMEWINDOW2;
            Double.isNaN(d23);
            double d26 = d23 / d25;
            double d27 = (double) this.SAMPLES2;
            Double.isNaN(d27);
            Double.isNaN(d24);
            float f23 = (float) (d24 + (d26 * d27));
            this.canvas.drawLine(40.0f, f23, 35.0f, f23, this.paint_n);
            this.canvas.drawText(Float.toString(f22), 9.0f, f23 + 3.0f, this.paint_n);
            f22 += 5.0f;
        }
        this.canvas.drawLine(40.0f, ((float) this.SAMPLES2) + f20, 35.0f, ((float) this.SAMPLES2) + f20, this.paint_n);
        Canvas canvas7 = this.canvas;
        canvas7.drawText(this.nF00.format(this.TIMEWINDOW2) + "ns.", 2.0f, ((float) this.SAMPLES2) + f20, this.paint_n);
        this.canvas.drawLine(((float) this.col2) + f20 + 10.0f, f20, ((float) this.col2) + f20 + 10.0f, ((float) this.SAMPLES2) + f20, this.paint_n);
        float f24 = this.TIMEWINDOW2 < 25.0d ? 0.1f : 0.5f;
        while (true) {
            double d28 = (double) f21;
            if (d28 < this.TIMEWINDOW2 * d) {
                double d29 = (double) f20;
                double d30 = this.TIMEWINDOW2;
                Double.isNaN(d28);
                double d31 = (double) this.SAMPLES2;
                Double.isNaN(d31);
                Double.isNaN(d29);
                float f25 = (float) (d29 + (((d28 / d30) * d31) / d));
                this.canvas.drawLine(((float) this.col2) + f20 + 10.0f, f25, ((float) this.col2) + f20 + 17.0f, f25, this.paint_n);
                this.canvas.drawText(this.nF0.format(d28), ((float) this.col2) + f20 + 19.0f, f25 + 3.0f, this.paint_n);
                f21 += f24;
            } else {
                this.canvas.drawLine(((float) this.col2) + f20 + 10.0f, ((float) this.SAMPLES2) + f20, ((float) this.col2) + f20 + 17.0f, ((float) this.SAMPLES2) + f20, this.paint_n);
                Canvas canvas8 = this.canvas;
                canvas8.drawText(this.nF00.format(this.TIMEWINDOW2 * d) + "m.", ((float) this.col2) + f20 + 17.0f, ((float) this.SAMPLES2) + f20, this.paint_n);
                this.pizarra.setImageBitmap(this.cuadro);
                diburegla2(this.pizarra.getScrollY());
                return;
            }
        }
    }

    public void dibujareglahip() {
        double d;
        Paint paint;
        int argb;
        float width = (float) this.cuadrob.getWidth();
        this.cuadrob = Bitmap.createBitmap((int) width, (int) (((float) this.SAMPLES2) + (this.divi * 70.0f)), Bitmap.Config.ARGB_8888);
        this.paint_nb.setColor(-16776961);
        this.paint_nb.setStrokeWidth(width / 500.0f);
        this.canvasb = new Canvas(this.cuadrob);
        double d2 = (double) this.divi;
        Double.isNaN(d2);
        double d3 = (double) this.col2;
        Double.isNaN(d3);
        double d4 = (d2 * 100.0d) + d3;
        double d5 = (double) this.divi;
        Double.isNaN(d5);
        double d6 = (double) this.SAMPLES2;
        Double.isNaN(d6);
        double d7 = d4 / ((d5 * 70.0d) + d6);
        double width2 = (double) this.pizarra.getWidth();
        Double.isNaN(width2);
        double height = (double) this.pizarra.getHeight();
        Double.isNaN(height);
        if (d7 > (width2 + 1.0E-5d) / (height + 1.0E-5d)) {
            int i = this.col2;
            float f = this.divi;
            int i2 = this.SAMPLES2;
            float f2 = this.divi;
            this.pizarra.getWidth();
            this.pizarra.getHeight();
        }
        double sqrt = (2.99792458E8d / Math.sqrt(this.refraccion)) / 2.0E9d;
        double d8 = this.regladim;
        double d9 = (double) this.SAMPLES2;
        Double.isNaN(d9);
        double scaleY = (double) this.pizarra.getScaleY();
        Double.isNaN(scaleY);
        double d10 = ((((d8 * d9) / this.TIMEWINDOW2) / sqrt) * scaleY) / 1.0d;
        double height2 = (double) (this.canvasb.getHeight() / 2);
        if (this.DISTANCE_INTERVAL > 0.0d) {
            double d11 = this.regladim / this.DISTANCE_INTERVAL;
            double d12 = (double) this.divi;
            Double.isNaN(d12);
            double d13 = d11 * d12;
            double scaleX = (double) this.pizarra.getScaleX();
            Double.isNaN(scaleX);
            double d14 = (d13 * scaleX) / 1.0d;
            this.paint_nb.setStyle(Paint.Style.FILL);
            this.paint_nb.setColor(Color.argb(100, 255, 127, 0));
            this.paint_nb.setStyle(Paint.Style.FILL);
            RectF rectF = new RectF();
            float f3 = width / 2.0f;
            double d15 = (double) f3;
            double d16 = d14 / 2.0d;
            Double.isNaN(d15);
            d = sqrt;
            double d17 = d10 / 2.0d;
            Double.isNaN(height2);
            float f4 = f3;
            double d18 = height2 - d17;
            float f5 = width;
            Double.isNaN(d15);
            double d19 = d18;
            Double.isNaN(height2);
            rectF.set((float) (d15 - d16), (float) d18, (float) (d15 + d16), (float) (d17 + height2));
            this.canvasb.drawArc(rectF, 180.0f, 180.0f, true, this.paint_nb);
            if (Math.abs((d14 / d10) - 1.0d) > 0.1d) {
                paint = this.paint_nb;
                argb = Color.argb(100, 0, 255, 0);
            } else {
                paint = this.paint_nb;
                argb = Color.argb(100, 0, 255, 255);
            }
            paint.setColor(argb);
            RectF rectF2 = rectF;
            this.canvasb.drawArc(rectF2, 180.0f, -180.0f, true, this.paint_nb);
            this.paint_nb.setColor(-16776961);
            this.paint_nb.setStyle(Paint.Style.STROKE);
            this.canvasb.drawArc(rectF2, 180.0f, 360.0f, false, this.paint_nb);
            double d20 = this.regladim / 2.0d;
            this.paint_nb.setColor(Color.argb(100, 255, 0, 255));
            float f6 = f5 / 100.0f;
            this.paint_nb.setStrokeWidth(f6);
            double scrollY = (double) this.pizarra.getScrollY();
            Double.isNaN(scrollY);
            double height3 = (double) this.pizarra.getHeight();
            Double.isNaN(height3);
            double d21 = (scrollY * 1.0d) + (height3 / 2.0d);
            double height4 = (double) this.pizarra.getHeight();
            Double.isNaN(height4);
            double d22 = d21 / height4;
            double d23 = (double) this.SAMPLES2;
            double d24 = (double) this.divi;
            Double.isNaN(d24);
            Double.isNaN(d23);
            double d25 = d22 * (d23 + (d24 * 70.0d));
            double d26 = (double) this.divi;
            Double.isNaN(d26);
            double d27 = (double) this.SAMPLES2;
            Double.isNaN(d27);
            double d28 = (((((d25 - (d26 * 50.0d)) * 1.0d) - this.alturamodif) * this.TIMEWINDOW2) * d) / d27;
            double d29 = d28 - (this.regladim / 2.0d);
            double d30 = (d28 * d28) - (d29 * d29);
            double d31 = d15;
            double d32 = (double) this.SAMPLES2;
            Double.isNaN(d32);
            double scaleY2 = (double) this.pizarra.getScaleY();
            Double.isNaN(scaleY2);
            Double.isNaN(height2);
            double d33 = height2 - (((((d28 * d32) / this.TIMEWINDOW2) / d) * scaleY2) / 1.0d);
            this.paint_nb.setColor(Color.argb(150, 0, 255, 255));
            this.paint_nb.setStrokeWidth(f6);
            double d34 = -12.0d;
            boolean z = true;
            float f7 = 0.0f;
            float f8 = 0.0f;
            while (d34 <= 12.0d) {
                double d35 = d34 * d20;
                double d36 = d33;
                double d37 = d35 / this.DISTANCE_INTERVAL;
                double d38 = (double) this.divi;
                Double.isNaN(d38);
                double d39 = d37 * d38;
                double scaleX2 = (double) this.pizarra.getScaleX();
                Double.isNaN(scaleX2);
                Double.isNaN(d31);
                float f9 = (float) (d31 + ((d39 * scaleX2) / 1.0d));
                double d40 = (double) this.SAMPLES2;
                Double.isNaN(d40);
                double scaleY3 = (double) this.pizarra.getScaleY();
                Double.isNaN(scaleY3);
                float sqrt2 = (float) (d19 + (((((((Math.sqrt(Math.abs(((d35 * d35) / d30) + 1.0d)) * d29) - d29) * d40) / this.TIMEWINDOW2) / d) * scaleY3) / 1.0d));
                if (z) {
                    z = false;
                } else {
                    this.canvasb.drawLine(f9, sqrt2, f7, f8, this.paint_nb);
                }
                d34 += 0.1d;
                f7 = f9;
                f8 = sqrt2;
                d33 = d36;
            }
            this.paint_nb.setStrokeWidth(f5 / 200.0f);
            double d41 = -10.0d * d20;
            double d42 = d41 / this.DISTANCE_INTERVAL;
            double d43 = (double) this.divi;
            Double.isNaN(d43);
            double d44 = d42 * d43;
            double scaleX3 = (double) this.pizarra.getScaleX();
            Double.isNaN(scaleX3);
            Double.isNaN(d31);
            double d45 = (double) this.SAMPLES2;
            Double.isNaN(d45);
            double scaleY4 = (double) this.pizarra.getScaleY();
            Double.isNaN(scaleY4);
            float f10 = f4;
            float f11 = (float) d33;
            this.canvasb.drawLine(f10, f11, (float) (d31 + ((d44 * scaleX3) / 1.0d)), (float) (d19 + (((((((Math.sqrt(Math.abs(((d41 * d41) / d30) + 1.0d)) * d29) - d29) * d45) / this.TIMEWINDOW2) / d) * scaleY4) / 1.0d)), this.paint_nb);
            double d46 = d20 * 10.0d;
            double sqrt3 = (Math.sqrt(Math.abs(((d46 * d46) / d30) + 1.0d)) * d29) - d29;
            double d47 = d46 / this.DISTANCE_INTERVAL;
            double d48 = (double) this.divi;
            Double.isNaN(d48);
            double d49 = d47 * d48;
            double scaleX4 = (double) this.pizarra.getScaleX();
            Double.isNaN(scaleX4);
            Double.isNaN(d31);
            double d50 = (double) this.SAMPLES2;
            Double.isNaN(d50);
            double scaleY5 = (double) this.pizarra.getScaleY();
            Double.isNaN(scaleY5);
            this.canvasb.drawLine(f10, f11, (float) (d31 + ((d49 * scaleX4) / 1.0d)), (float) (d19 + (((((sqrt3 * d50) / this.TIMEWINDOW2) / d) * scaleY5) / 1.0d)), this.paint_nb);
            this.paint_nb.setStrokeWidth(f5 / 50.0f);
        } else {
            d = sqrt;
            this.paint_nb.setColor(Color.argb(100, 0, 255, 0));
            this.paint_nb.setStyle(Paint.Style.FILL);
            Canvas canvas2 = this.canvasb;
            float f12 = (float) height2;
            float f13 = (float) (this.col2 + 100);
            double d51 = d10 / 2.0d;
            Double.isNaN(height2);
            float f14 = (float) (height2 + d51);
            float f15 = f14;
            canvas2.drawRect(0.0f, f12, f13, f15, this.paint_nb);
            this.paint_nb.setColor(Color.argb(100, 255, 127, 0));
            Canvas canvas3 = this.canvasb;
            Double.isNaN(height2);
            float f16 = (float) (height2 - d51);
            canvas3.drawRect(0.0f, f16, (float) (this.col2 + 100), f12, this.paint_nb);
            this.paint_nb.setColor(-16776961);
            this.paint_nb.setStyle(Paint.Style.STROKE);
            this.canvasb.drawLine(0.0f, f16, (float) (this.col2 + 100), f16, this.paint_nb);
            this.canvasb.drawLine(0.0f, f15, (float) (this.col2 + 100), f14, this.paint_nb);
        }
        this.pizarrab.setImageBitmap(this.cuadrob);
        this.paint_n.setColor(Color.rgb(240, 240, 160));
        this.paint_n.setStyle(Paint.Style.FILL);
        this.canvas.drawRect((float) (this.col2 + 50), 50.0f, (float) (this.col2 + 100), (float) (this.SAMPLES2 + 55), this.paint_n);
        this.paint_n.setColor((int) ViewCompat.MEASURED_STATE_MASK);
        float f17 = 50.0f * this.divi;
        double d52 = this.DISTANCE_INTERVAL;
        int i3 = this.col2;
        this.canvas.drawLine(40.0f, f17, 40.0f, ((float) this.SAMPLES2) + f17, this.paint_n);
        float f18 = 0.0f;
        while (true) {
            double d53 = (double) f18;
            if (d53 >= this.TIMEWINDOW2) {
                break;
            }
            double d54 = (double) f17;
            double d55 = this.TIMEWINDOW2;
            Double.isNaN(d53);
            double d56 = d53 / d55;
            double d57 = (double) this.SAMPLES2;
            Double.isNaN(d57);
            Double.isNaN(d54);
            float f19 = (float) (d54 + (d56 * d57));
            this.canvas.drawLine(40.0f, f19, 35.0f, f19, this.paint_n);
            this.canvas.drawText(Float.toString(f18), 9.0f, f19 + 3.0f, this.paint_n);
            f18 += 5.0f;
        }
        this.canvas.drawLine(40.0f, ((float) this.SAMPLES2) + f17, 35.0f, ((float) this.SAMPLES2) + f17, this.paint_n);
        Canvas canvas4 = this.canvas;
        canvas4.drawText(this.nF00.format(this.TIMEWINDOW2) + "ns.", 2.0f, ((float) this.SAMPLES2) + f17, this.paint_n);
        this.canvas.drawLine(((float) this.col2) + f17 + 10.0f, f17, ((float) this.col2) + f17 + 10.0f, ((float) this.SAMPLES2) + f17, this.paint_n);
        float f20 = this.TIMEWINDOW2 < 25.0d ? 0.1f : 0.5f;
        float f21 = 0.0f;
        while (true) {
            double d58 = (double) f21;
            if (d58 < this.TIMEWINDOW2 * d) {
                double d59 = (double) f17;
                double d60 = this.TIMEWINDOW2;
                Double.isNaN(d58);
                double d61 = (double) this.SAMPLES2;
                Double.isNaN(d61);
                Double.isNaN(d59);
                float f22 = (float) (d59 + (((d58 / d60) * d61) / d));
                this.canvas.drawLine(((float) this.col2) + f17 + 10.0f, f22, ((float) this.col2) + f17 + 17.0f, f22, this.paint_n);
                this.canvas.drawText(this.nF0.format(d58), ((float) this.col2) + f17 + 19.0f, f22 + 3.0f, this.paint_n);
                f21 += f20;
            } else {
                this.canvas.drawLine(((float) this.col2) + f17 + 10.0f, ((float) this.SAMPLES2) + f17, ((float) this.col2) + f17 + 17.0f, ((float) this.SAMPLES2) + f17, this.paint_n);
                Canvas canvas5 = this.canvas;
                canvas5.drawText(this.nF00.format(this.TIMEWINDOW2 * d) + "m.", ((float) this.col2) + f17 + 17.0f, ((float) this.SAMPLES2) + f17, this.paint_n);
                this.pizarra.setImageBitmap(this.cuadro);
                diburegla2(this.pizarra.getScrollY());
                return;
            }
        }
    }

    public void dibujareglapar() {
        double d;
        double d2;
        Paint paint;
        int argb;
        float width = (float) this.cuadrob.getWidth();
        this.cuadrob = Bitmap.createBitmap((int) width, (int) (((float) this.SAMPLES2) + (this.divi * 70.0f)), Bitmap.Config.ARGB_8888);
        this.paint_nb.setColor(-16776961);
        this.paint_nb.setStrokeWidth(width / 500.0f);
        this.canvasb = new Canvas(this.cuadrob);
        double d3 = (double) this.divi;
        Double.isNaN(d3);
        double d4 = (double) this.col2;
        Double.isNaN(d4);
        double d5 = (d3 * 100.0d) + d4;
        double d6 = (double) this.divi;
        Double.isNaN(d6);
        double d7 = (double) this.SAMPLES2;
        Double.isNaN(d7);
        double d8 = d5 / ((d6 * 70.0d) + d7);
        double width2 = (double) this.pizarra.getWidth();
        Double.isNaN(width2);
        double height = (double) this.pizarra.getHeight();
        Double.isNaN(height);
        if (d8 > (width2 + 1.0E-5d) / (height + 1.0E-5d)) {
            double d9 = (double) (((float) this.col2) + (this.divi * 99.0f));
            double d10 = (double) this.SAMPLES2;
            double d11 = (double) this.divi;
            Double.isNaN(d11);
            Double.isNaN(d10);
            Double.isNaN(d9);
            double d12 = d9 / (d10 + (d11 * 70.0d));
            double width3 = (double) this.pizarra.getWidth();
            Double.isNaN(width3);
            double d13 = d12 / width3;
            double height2 = (double) this.pizarra.getHeight();
            Double.isNaN(height2);
            d = d13 * height2;
        } else {
            d = 1.0d;
        }
        double sqrt = (2.99792458E8d / Math.sqrt(this.refraccion)) / 2.0E9d;
        double d14 = this.regladim;
        double d15 = (double) this.SAMPLES2;
        Double.isNaN(d15);
        double scaleY = (double) this.pizarra.getScaleY();
        Double.isNaN(scaleY);
        double d16 = ((((d14 * d15) / this.TIMEWINDOW2) / sqrt) * scaleY) / d;
        double height3 = (double) (this.canvasb.getHeight() / 2);
        if (this.DISTANCE_INTERVAL > 0.0d) {
            double d17 = this.regladim / this.DISTANCE_INTERVAL;
            double d18 = (double) this.divi;
            Double.isNaN(d18);
            double d19 = d17 * d18;
            double scaleX = (double) this.pizarra.getScaleX();
            Double.isNaN(scaleX);
            double d20 = (d19 * scaleX) / d;
            this.paint_nb.setStyle(Paint.Style.FILL);
            d2 = sqrt;
            this.paint_nb.setColor(Color.argb(100, 255, 127, 0));
            this.paint_nb.setStyle(Paint.Style.FILL);
            RectF rectF = new RectF();
            double d21 = (double) (width / 2.0f);
            double d22 = d20 / 2.0d;
            Double.isNaN(d21);
            double d23 = d16 / 2.0d;
            Double.isNaN(height3);
            double d24 = d;
            double d25 = height3 - d23;
            float f = width;
            Double.isNaN(d21);
            double d26 = d25;
            Double.isNaN(height3);
            rectF.set((float) (d21 - d22), (float) d25, (float) (d21 + d22), (float) (height3 + d23));
            this.canvasb.drawArc(rectF, 180.0f, 180.0f, true, this.paint_nb);
            if (Math.abs((d20 / d16) - 1.0d) > 0.1d) {
                paint = this.paint_nb;
                argb = Color.argb(100, 0, 255, 0);
            } else {
                paint = this.paint_nb;
                argb = Color.argb(100, 0, 255, 255);
            }
            paint.setColor(argb);
            RectF rectF2 = rectF;
            this.canvasb.drawArc(rectF2, 180.0f, -180.0f, true, this.paint_nb);
            this.paint_nb.setColor(-16776961);
            this.paint_nb.setStyle(Paint.Style.STROKE);
            this.canvasb.drawArc(rectF2, 180.0f, 180.0f, false, this.paint_nb);
            double d27 = this.regladim / 2.0d;
            this.paint_nb.setColor(Color.argb(140, 255, 0, 255));
            this.paint_nb.setStrokeWidth(f / 100.0f);
            double d28 = -5.0d;
            boolean z = true;
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (d28 <= 5.0d) {
                double d29 = d28 * d27;
                double d30 = d29 / this.DISTANCE_INTERVAL;
                double d31 = (double) this.divi;
                Double.isNaN(d31);
                double d32 = d30 * d31;
                double scaleX2 = (double) this.pizarra.getScaleX();
                Double.isNaN(scaleX2);
                Double.isNaN(d21);
                float f4 = (float) (((d32 * scaleX2) / d24) + d21);
                double d33 = (double) this.SAMPLES2;
                Double.isNaN(d33);
                double scaleY2 = (double) this.pizarra.getScaleY();
                Double.isNaN(scaleY2);
                float f5 = (float) (d26 + ((((((((d29 * d29) / 4.0d) / d27) * d33) / this.TIMEWINDOW2) / d2) * scaleY2) / d24));
                if (z) {
                    z = false;
                } else {
                    this.canvasb.drawLine(f4, f5, f2, f3, this.paint_nb);
                }
                d28 += 0.1d;
                f2 = f4;
                f3 = f5;
            }
            this.paint_nb.setStrokeWidth(f / 50.0f);
        } else {
            d2 = sqrt;
            this.paint_nb.setColor(Color.argb(100, 0, 255, 0));
            this.paint_nb.setStyle(Paint.Style.FILL);
            Canvas canvas2 = this.canvasb;
            float f6 = (float) height3;
            float f7 = (float) (this.col2 + 100);
            double d34 = d16 / 2.0d;
            Double.isNaN(height3);
            float f8 = (float) (height3 + d34);
            canvas2.drawRect(0.0f, f6, f7, f8, this.paint_nb);
            this.paint_nb.setColor(Color.argb(100, 255, 127, 0));
            Canvas canvas3 = this.canvasb;
            Double.isNaN(height3);
            float f9 = (float) (height3 - d34);
            canvas3.drawRect(0.0f, f9, (float) (this.col2 + 100), f6, this.paint_nb);
            this.paint_nb.setColor(-16776961);
            this.paint_nb.setStyle(Paint.Style.STROKE);
            this.canvasb.drawLine(0.0f, f9, (float) (this.col2 + 100), f9, this.paint_nb);
            this.canvasb.drawLine(0.0f, f8, (float) (this.col2 + 100), f8, this.paint_nb);
        }
        this.pizarrab.setImageBitmap(this.cuadrob);
        this.paint_n.setColor(Color.rgb(240, 240, 160));
        this.paint_n.setStyle(Paint.Style.FILL);
        this.canvas.drawRect((float) (this.col2 + 50), 50.0f, (float) (this.col2 + 100), (float) (this.SAMPLES2 + 55), this.paint_n);
        this.paint_n.setColor((int) ViewCompat.MEASURED_STATE_MASK);
        float f10 = 50.0f * this.divi;
        double d35 = this.DISTANCE_INTERVAL;
        int i = this.col2;
        this.canvas.drawLine(40.0f, f10, 40.0f, ((float) this.SAMPLES2) + f10, this.paint_n);
        float f11 = 0.0f;
        while (true) {
            double d36 = (double) f11;
            if (d36 >= this.TIMEWINDOW2) {
                break;
            }
            double d37 = (double) f10;
            double d38 = this.TIMEWINDOW2;
            Double.isNaN(d36);
            double d39 = d36 / d38;
            double d40 = (double) this.SAMPLES2;
            Double.isNaN(d40);
            Double.isNaN(d37);
            float f12 = (float) (d37 + (d39 * d40));
            this.canvas.drawLine(40.0f, f12, 35.0f, f12, this.paint_n);
            this.canvas.drawText(Float.toString(f11), 9.0f, f12 + 3.0f, this.paint_n);
            f11 += 5.0f;
        }
        this.canvas.drawLine(40.0f, ((float) this.SAMPLES2) + f10, 35.0f, ((float) this.SAMPLES2) + f10, this.paint_n);
        Canvas canvas4 = this.canvas;
        canvas4.drawText(this.nF00.format(this.TIMEWINDOW2) + "ns.", 2.0f, ((float) this.SAMPLES2) + f10, this.paint_n);
        this.canvas.drawLine(((float) this.col2) + f10 + 10.0f, f10, ((float) this.col2) + f10 + 10.0f, ((float) this.SAMPLES2) + f10, this.paint_n);
        float f13 = this.TIMEWINDOW2 < 25.0d ? 0.1f : 0.5f;
        float f14 = 0.0f;
        while (true) {
            double d41 = (double) f14;
            if (d41 < this.TIMEWINDOW2 * d2) {
                double d42 = (double) f10;
                double d43 = this.TIMEWINDOW2;
                Double.isNaN(d41);
                double d44 = (double) this.SAMPLES2;
                Double.isNaN(d44);
                Double.isNaN(d42);
                float f15 = (float) (d42 + (((d41 / d43) * d44) / d2));
                this.canvas.drawLine(((float) this.col2) + f10 + 10.0f, f15, ((float) this.col2) + f10 + 17.0f, f15, this.paint_n);
                this.canvas.drawText(this.nF0.format(d41), ((float) this.col2) + f10 + 19.0f, f15 + 3.0f, this.paint_n);
                f14 += f13;
            } else {
                this.canvas.drawLine(((float) this.col2) + f10 + 10.0f, ((float) this.SAMPLES2) + f10, ((float) this.col2) + f10 + 17.0f, ((float) this.SAMPLES2) + f10, this.paint_n);
                Canvas canvas5 = this.canvas;
                canvas5.drawText(this.nF00.format(this.TIMEWINDOW2 * d2) + "m.", ((float) this.col2) + f10 + 17.0f, ((float) this.SAMPLES2) + f10, this.paint_n);
                this.pizarra.setImageBitmap(this.cuadro);
                diburegla2(this.pizarra.getScrollY());
                return;
            }
        }
    }

    public void dibujasuave() {
        int i;
        rotulos();
        int i2 = (this.col - this.der) - this.iz;
        int i3 = (this.SAMPLES - this.cerado) - this.fondo;
        float f = this.divi * 50.0f;
        double[] dArr = new double[i3];
        double[] dArr2 = new double[i3];
        double d = 0.001d;
        double d2 = -0.001d;
        int i4 = 0;
        while (i4 < i2) {
            for (int i5 = 0; i5 < i3; i5++) {
                dArr[i5] = this.ma2[i4][i5];
            }
            int i6 = 0;
            while (true) {
                i = i4;
                if (((double) i6) >= this.suavito) {
                    break;
                }
                dArr2[0] = dArr[0];
                int i7 = i3 - 1;
                dArr2[i7] = dArr[i7];
                int i8 = 1;
                while (i8 < i7) {
                    int i9 = i8 + 1;
                    dArr2[i8] = ((dArr[i9] + dArr[i8 - 1]) + (dArr[i8] * 2.0d)) / 4.0d;
                    i8 = i9;
                }
                for (int i10 = 0; i10 < i3; i10++) {
                    dArr[i10] = dArr2[i10];
                }
                i6++;
                i4 = i;
            }
            for (int i11 = 0; i11 < i3; i11++) {
                this.ma3[i][i11] = dArr[i11];
                if (this.ma3[i][i11] > d) {
                    d = this.ma3[i][i11];
                }
                if (this.ma3[i][i11] < d2) {
                    d2 = this.ma3[i][i11];
                }
            }
            i4 = i + 1;
        }
        double d3 = -d2;
        if (d >= d3) {
            d3 = d;
        }
        double d4 = (d3 - d2) / 256.0d;
        for (int i12 = 0; i12 < i2; i12++) {
            int i13 = 0;
            while (i13 < i3) {
                this.num = (this.ma3[i12][i13] - d2) / d4;
                double d5 = d4;
                if (this.num > 255.0d) {
                    this.num = 255.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 0.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                i13++;
                this.canvas.drawRect((this.divi * ((float) i12)) + f, (this.divi * ((float) i13)) + f, (this.divi * ((float) (i12 + 1))) + f, (this.divi * ((float) i13)) + f, this.paint_n);
                d4 = d5;
            }
        }
        this.previomax = d3;
        this.previomin = d2;
        coletilla();
        perfil(this.numerodelperfil);
    }

    public void dibujasuaveh() {
        int i;
        rotulos();
        int i2 = (this.col - this.der) - this.iz;
        int i3 = (this.SAMPLES - this.cerado) - this.fondo;
        float f = this.divi * 50.0f;
        double[] dArr = new double[i2];
        double[] dArr2 = new double[i2];
        double d = 0.001d;
        double d2 = -0.001d;
        int i4 = 0;
        while (i4 < i3) {
            for (int i5 = 0; i5 < i2; i5++) {
                dArr[i5] = this.ma2[i5][i4];
            }
            int i6 = 0;
            while (true) {
                i = i4;
                if (((double) i6) >= this.suavitoh) {
                    break;
                }
                dArr2[0] = dArr[0];
                int i7 = i2 - 1;
                dArr2[i7] = dArr[i7];
                int i8 = 1;
                while (i8 < i7) {
                    int i9 = i8 + 1;
                    dArr2[i8] = ((dArr[i9] + dArr[i8 - 1]) + (dArr[i8] * 2.0d)) / 4.0d;
                    i8 = i9;
                }
                for (int i10 = 0; i10 < i2; i10++) {
                    dArr[i10] = dArr2[i10];
                }
                i6++;
                i4 = i;
            }
            for (int i11 = 0; i11 < i2; i11++) {
                this.ma3[i11][i] = dArr[i11];
                if (this.ma3[i11][i] > d) {
                    d = this.ma3[i11][i];
                }
                if (this.ma3[i11][i] < d2) {
                    d2 = this.ma3[i11][i];
                }
            }
            i4 = i + 1;
        }
        double d3 = -d2;
        if (d >= d3) {
            d3 = d;
        }
        double d4 = (d3 - d2) / 256.0d;
        for (int i12 = 0; i12 < i2; i12++) {
            int i13 = 0;
            while (i13 < i3) {
                this.num = (this.ma3[i12][i13] - d2) / d4;
                double d5 = d4;
                if (this.num > 255.0d) {
                    this.num = 255.0d;
                }
                if (this.num < 0.0d) {
                    this.num = 0.0d;
                }
                this.paint_n.setColor(coloj(this.num));
                i13++;
                this.canvas.drawRect((this.divi * ((float) i12)) + f, (this.divi * ((float) i13)) + f, (this.divi * ((float) (i12 + 1))) + f, (this.divi * ((float) i13)) + f, this.paint_n);
                d4 = d5;
            }
        }
        this.previomax = d3;
        this.previomin = d2;
        coletilla();
        perfil(this.numerodelperfil);
    }

    public void suave(View view) {
        TextView textView = (TextView) findViewById(R.id.textView10);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.addRule(5, R.id.imageButton10);
        textView.setLayoutParams(layoutParams);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(this.lidioma[this.nidioma][63]);
        builder.setPositiveButton("Vertical\nSmooth", new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass22 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Georradar.this.chivozoom = 10;
                Georradar.this.visible5();
                Georradar.this.suavito = 1.0d;
                ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.suavito));
                Georradar.this.dibujasuave();
            }
        });
        builder.setNegativeButton("Horizontal\nBackground", new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass23 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Georradar.this.chivozoom = 18;
                Georradar.this.visible5();
                Georradar.this.suavitoh = 1.0d;
                ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format(Georradar.this.suavito));
                Georradar.this.dibujasuaveh();
            }
        });
        builder.show();
    }

    public void subcorte(View view) {
        TextView textView = (TextView) findViewById(R.id.textView10);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.addRule(5, R.id.imageButton2);
        textView.setLayoutParams(layoutParams);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(this.lidioma[this.nidioma][64]);
        builder.setPositiveButton(this.lidioma[this.nidioma][65], new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass24 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Georradar.this.chivozoom = 7;
                Georradar.this.visible5();
                ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format((long) Georradar.this.fondo));
                ((TextView) Georradar.this.findViewById(R.id.buttosalir)).setVisibility(4);
            }
        });
        builder.setNeutralButton(this.lidioma[this.nidioma][66], new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass25 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Georradar.this.chivozoom = 8;
                Georradar.this.visible5();
                ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format((long) Georradar.this.der));
                ((TextView) Georradar.this.findViewById(R.id.buttosalir)).setVisibility(4);
            }
        });
        builder.setNegativeButton(this.lidioma[this.nidioma][67], new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass26 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Georradar.this.chivozoom = 9;
                Georradar.this.visible5();
                ((Button) Georradar.this.findViewById(R.id.buttonnor)).setText(Georradar.this.nF00.format((long) Georradar.this.iz));
                ((TextView) Georradar.this.findViewById(R.id.buttosalir)).setVisibility(4);
            }
        });
        builder.show();
    }

    public double valore(int i, int i2) {
        double d = this.ma2[i][i2];
        if (this.chivoderi == 0 && this.chivoderj == 0.0d) {
            return d;
        }
        return deriva(i, i2, this.chivoderi, (int) this.chivoderj);
    }

    public double deriva(int i, int i2, int i3, int i4) {
        if (this.SAMPLES - i2 <= i3 || this.col - 3 < i || i < 3) {
            return 0.0d;
        }
        if (i4 == 0) {
            double d = (double) i3;
            Double.isNaN(d);
            return Math.atan(((this.ma2[i][i2 + 1] - this.ma2[i][i2]) / 4096.0d) * d);
        } else if (i3 == 0) {
            return (Math.atan(this.ma2[i + 1][i2]) / 2.0d) - (Math.atan(this.ma2[i][i2]) / 2.0d);
        } else {
            double d2 = (double) i3;
            Double.isNaN(d2);
            double d3 = (double) i4;
            Double.isNaN(d3);
            return Math.atan((((this.ma2[i][i2 + 1] - this.ma2[i][i2]) / 4096.0d) * d2) + (((this.ma2[i + 1][i2] - this.ma2[i][i2]) / 4096.0d) * d3));
        }
    }

    public void publicidad(View view) {
        String str = this.TextoPubli;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        startActivity(intent);
    }

    public void publicidad2(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("http://carreteras-laser-escaner.blogspot.com/2016/12/gpr-data-processing-on-android.html"));
        startActivity(intent);
    }

    public void publicidad3(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("mailto:lnieto@abakal.com?subject=Sugerencia para el programa de GPR"));
        startActivity(intent);
    }

    public void exterior(View view) {
        Intent intent = new Intent(this, Ejemplos.class);
        intent.putExtra("idioa", Integer.toString(this.nidioma));
        startActivity(intent);
    }

    /* access modifiers changed from: package-private */
    public void aleatun() {
        int random = (int) (Math.random() * 30.0d);
        this.TextoPubli = "http://www.abakal.com";
        ImageView imageView = (ImageView) findViewById(R.id.imageView5);
        switch (random) {
            case 1:
                imageView.setImageResource(R.drawable.i01);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 2:
                imageView.setImageResource(R.drawable.i02);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 3:
                imageView.setImageResource(R.drawable.i03);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 4:
                imageView.setImageResource(R.drawable.i04);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 5:
                imageView.setImageResource(R.drawable.i05);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 6:
                imageView.setImageResource(R.drawable.i06);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 7:
                imageView.setImageResource(R.drawable.i07);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 8:
                imageView.setImageResource(R.drawable.i08);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 9:
                imageView.setImageResource(R.drawable.i09);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 10:
                imageView.setImageResource(R.drawable.i10);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 11:
                imageView.setImageResource(R.drawable.i11);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 12:
                imageView.setImageResource(R.drawable.i12);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 13:
                imageView.setImageResource(R.drawable.i13);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 14:
                imageView.setImageResource(R.drawable.i14);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 15:
                imageView.setImageResource(R.drawable.i15);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 16:
                imageView.setImageResource(R.drawable.i16);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 17:
                imageView.setImageResource(R.drawable.i17);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 18:
                imageView.setImageResource(R.drawable.i18);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 19:
                imageView.setImageResource(R.drawable.i19);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 20:
                imageView.setImageResource(R.drawable.i20);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 21:
                imageView.setImageResource(R.drawable.i21);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 22:
                imageView.setImageResource(R.drawable.i22);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 23:
                imageView.setImageResource(R.drawable.i23);
                this.TextoPubli = "https://play.google.com/store/apps/developer?id=ABAKAL.C%C3%A1lculo.Estructura.Hidr%C3%A1ulica.Hormig%C3%B3n.";
                return;
            case 24:
                imageView.setImageResource(R.drawable.extraco);
                this.TextoPubli = "http://www.extraco.es/actividades/idi/";
                return;
            case 25:
                imageView.setImageResource(R.drawable.extraco);
                this.TextoPubli = "http://www.extraco.es";
                return;
            case 26:
                imageView.setImageResource(R.drawable.extraco);
                this.TextoPubli = "http://www.extraco.es/actividades/idi/";
                return;
            default:
                imageView.setImageResource(R.drawable.logo);
                return;
        }
    }

    class MyTimerTask extends TimerTask {
        MyTimerTask() {
        }

        public void run() {
            Georradar.this.runOnUiThread(new Runnable() {
                /* class com.nieto.luis.gpr.Georradar.MyTimerTask.AnonymousClass1 */

                public void run() {
                    Georradar.this.archivoelegido = Georradar.this.archivoelegido2;
                    if (!Georradar.this.archivoelegido.equals("")) {
                        Georradar.this.abrerad();
                    }
                    ((TextView) Georradar.this.findViewById(R.id.textView9)).setText(Georradar.this.directorioelegido + "/" + Georradar.this.archivoelegido);
                }
            });
        }
    }

    class MyTimerTask2 extends TimerTask {
        MyTimerTask2() {
        }

        public void run() {
            Georradar.this.runOnUiThread(new Runnable() {
                /* class com.nieto.luis.gpr.Georradar.MyTimerTask2.AnonymousClass1 */

                public void run() {
                    Georradar.this.aleatun();
                }
            });
        }
    }

    public void abrerd3() {
        if (this.LAST_TRACE <= 1000) {
            this.multiplus = 1;
            File file = new File(this.directorioelegido + "/" + this.archivoelegido);
            if (((int) ((file.length() / ((long) this.SAMPLES)) / 2)) < this.col) {
                this.col = (int) ((file.length() / ((long) this.SAMPLES)) / 2);
            }
            this.ma0 = (double[][]) Array.newInstance(double.class, this.col + 1, this.SAMPLES);
            this.ma2 = (double[][]) Array.newInstance(double.class, this.col + 1, this.SAMPLES);
            this.ma3 = (double[][]) Array.newInstance(double.class, this.col + 1, this.SAMPLES);
            this.num = 0.0d;
            this.min = 0.0d;
            this.max = 0.0d;
            for (int i = 0; i <= this.col; i++) {
                for (int i2 = 0; i2 < this.SAMPLES; i2++) {
                    this.ma0[i][i2] = 0.0d;
                }
            }
            this.max = 0.0d;
            this.min = 0.0d;
            this.chivozoom = 0;
            this.contraste = 1.0d;
            this.contraste2 = 1.0d;
            this.chivobn = 0;
            this.trunca = 1.0d;
            this.cerado = 0;
            this.sincentrar = true;
            this.chivoderi = 1;
            this.chivoderj = 1.0d;
            this.sincentrar = true;
            this.chivoderi = 0;
            this.chivatocolor = 0;
            this.pizarra.setScaleX(1.0f);
            this.pizarra.setScaleY(1.0f);
            this.pizarra.setScrollX(0);
            this.pizarra.setScrollY(0);
            this.col = this.LAST_TRACE;
            this.cerado = 0;
            this.fondo = 0;
            this.der = 0;
            if (((double) this.col) > this.limitedivi) {
                double d = this.limitedivi;
                double d2 = (double) this.col;
                Double.isNaN(d2);
                this.divi = (float) (d / d2);
            } else {
                this.divi = 1.0f;
            }
            this.col2 = (int) (((float) this.col) * this.divi);
            this.SAMPLES2 = (int) (((float) this.SAMPLES) * this.divi);
            this.TIMEWINDOW2 = this.TIMEWINDOW;
            this.DISTANCE_INTERVAL2 = this.DISTANCE_INTERVAL;
            this.col2 = this.col;
            rotulos();
            this.pDialog = new ProgressDialog(this);
            this.pDialog.setProgressStyle(1);
            ProgressDialog progressDialog = this.pDialog;
            progressDialog.setMessage(this.lidioma[this.nidioma][68] + this.archivoelegido + this.lidioma[this.nidioma][69]);
            this.pDialog.setCancelable(true);
            this.pDialog.setMax(100);
            this.voy = -1.0d;
            this.tarea2 = new MiTareaAsincronaDialog();
            MiTareaAsincronaDialog miTareaAsincronaDialog = this.tarea2;
            miTareaAsincronaDialog.execute(this.directorioelegido + "/" + this.archivoelegido);
            return;
        }
        double d3 = (double) this.LAST_TRACE;
        Double.isNaN(d3);
        final int ceil = (int) Math.ceil((d3 * 1.0d) / 500.0d);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(this.lidioma[this.nidioma][70] + this.LAST_TRACE + this.lidioma[this.nidioma][71] + ceil + ")");
        double d4 = (double) this.LAST_TRACE;
        Double.isNaN(d4);
        this.multiplus = (int) Math.ceil((d4 * 1.0d) / 1000.0d);
        final EditText editText = new EditText(this);
        builder.setView(editText);
        editText.setText("1");
        editText.setInputType(2);
        builder.setPositiveButton(this.lidioma[this.nidioma][72], new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass27 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Georradar georradar;
                double cuantoes = Georradar.this.cuantoes(editText.getText().toString());
                if (cuantoes < 1.0d) {
                    cuantoes = 1.0d;
                }
                Georradar.this.voy = (cuantoes - 1.0d) * 500.0d;
                Georradar.this.fin = Georradar.this.voy + 1000.0d;
                Georradar.this.multiplus = 1;
                if (cuantoes >= ((double) ceil)) {
                    int i2 = ceil;
                    Georradar.this.fin = (double) Georradar.this.LAST_TRACE;
                    Georradar.this.voy = Georradar.this.fin - 1000.0d;
                }
                Georradar.this.LAST_TRACE = 1000;
                Georradar.this.col = 1000;
                Georradar.this.ma0 = (double[][]) Array.newInstance(double.class, Georradar.this.col + 1, Georradar.this.SAMPLES);
                Georradar.this.ma2 = (double[][]) Array.newInstance(double.class, Georradar.this.col + 1, Georradar.this.SAMPLES);
                Georradar.this.ma3 = (double[][]) Array.newInstance(double.class, Georradar.this.col + 1, Georradar.this.SAMPLES);
                Georradar.this.num = 0.0d;
                Georradar.this.min = 0.0d;
                Georradar.this.max = 0.0d;
                for (int i3 = 0; i3 <= Georradar.this.col; i3++) {
                    for (int i4 = 0; i4 < Georradar.this.SAMPLES; i4++) {
                        Georradar.this.ma0[i3][i4] = 0.0d;
                    }
                }
                Georradar.this.max = 0.0d;
                Georradar.this.min = 0.0d;
                Georradar.this.chivozoom = 0;
                Georradar.this.contraste = 1.0d;
                Georradar.this.contraste2 = 1.0d;
                Georradar.this.chivobn = 0;
                Georradar.this.trunca = 1.0d;
                Georradar.this.cerado = 0;
                Georradar.this.sincentrar = true;
                Georradar.this.chivoderi = 1;
                Georradar.this.chivoderj = 1.0d;
                Georradar.this.sincentrar = true;
                Georradar.this.chivoderi = 0;
                Georradar.this.chivatocolor = 0;
                float f = 1.0f;
                Georradar.this.pizarra.setScaleX(1.0f);
                Georradar.this.pizarra.setScaleY(1.0f);
                Georradar.this.pizarra.setScrollX(0);
                Georradar.this.pizarra.setScrollY(0);
                Georradar.this.col = Georradar.this.LAST_TRACE;
                Georradar.this.cerado = 0;
                Georradar.this.fondo = 0;
                Georradar.this.der = 0;
                if (((double) Georradar.this.col) > Georradar.this.limitedivi) {
                    georradar = Georradar.this;
                    double d = Georradar.this.limitedivi;
                    double d2 = (double) Georradar.this.col;
                    Double.isNaN(d2);
                    f = (float) (d / d2);
                } else {
                    georradar = Georradar.this;
                }
                georradar.divi = f;
                Georradar.this.col2 = (int) (((float) Georradar.this.col) * Georradar.this.divi);
                Georradar.this.SAMPLES2 = (int) (((float) Georradar.this.SAMPLES) * Georradar.this.divi);
                Georradar.this.TIMEWINDOW2 = Georradar.this.TIMEWINDOW;
                Georradar.this.DISTANCE_INTERVAL2 = Georradar.this.DISTANCE_INTERVAL;
                Georradar.this.col2 = Georradar.this.col;
                Georradar.this.rotulos();
                ProgressDialog unused = Georradar.this.pDialog = new ProgressDialog(Georradar.this);
                Georradar.this.pDialog.setProgressStyle(1);
                Georradar.this.pDialog.setMessage(Georradar.this.lidioma[Georradar.this.nidioma][68] + Georradar.this.archivoelegido + Georradar.this.lidioma[Georradar.this.nidioma][69]);
                Georradar.this.pDialog.setCancelable(true);
                Georradar.this.pDialog.setMax(100);
                Georradar.this.tarea2 = new MiTareaAsincronaDialog();
                Georradar.this.tarea2.execute(Georradar.this.directorioelegido + "/" + Georradar.this.archivoelegido);
            }
        });
        builder.setNegativeButton(this.lidioma[this.nidioma][73], new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass28 */

            public void onClick(DialogInterface dialogInterface, int i) {
                File file = new File(Georradar.this.directorioelegido + "/" + Georradar.this.archivoelegido);
                Georradar.this.LAST_TRACE = Georradar.this.LAST_TRACE / Georradar.this.multiplus;
                Georradar.this.col = Georradar.this.LAST_TRACE;
                if (((int) ((file.length() / ((long) Georradar.this.SAMPLES)) / 2)) < Georradar.this.col * Georradar.this.multiplus) {
                    Georradar.this.col = (int) (((file.length() / ((long) Georradar.this.SAMPLES)) / 2) / ((long) Georradar.this.multiplus));
                }
                Georradar.this.ma0 = (double[][]) Array.newInstance(double.class, Georradar.this.col + 1, Georradar.this.SAMPLES);
                Georradar.this.ma2 = (double[][]) Array.newInstance(double.class, Georradar.this.col + 1, Georradar.this.SAMPLES);
                Georradar.this.ma3 = (double[][]) Array.newInstance(double.class, Georradar.this.col + 1, Georradar.this.SAMPLES);
                Georradar.this.num = 0.0d;
                Georradar.this.min = 0.0d;
                Georradar.this.max = 0.0d;
                for (int i2 = 0; i2 <= Georradar.this.col; i2++) {
                    for (int i3 = 0; i3 < Georradar.this.SAMPLES; i3++) {
                        Georradar.this.ma0[i2][i3] = 0.0d;
                    }
                }
                Georradar.this.max = 0.0d;
                Georradar.this.min = 0.0d;
                Georradar.this.chivozoom = 0;
                Georradar.this.contraste = 1.0d;
                Georradar.this.contraste2 = 1.0d;
                Georradar.this.chivobn = 0;
                Georradar.this.trunca = 1.0d;
                Georradar.this.cerado = 0;
                Georradar.this.sincentrar = true;
                Georradar.this.chivoderi = 1;
                Georradar.this.chivoderj = 1.0d;
                Georradar.this.sincentrar = true;
                Georradar.this.chivoderi = 0;
                Georradar.this.chivatocolor = 0;
                Georradar.this.pizarra.setScaleX(1.0f);
                Georradar.this.pizarra.setScaleY(1.0f);
                Georradar.this.pizarra.setScrollX(0);
                Georradar.this.pizarra.setScrollY(0);
                Georradar.this.cerado = 0;
                Georradar.this.fondo = 0;
                Georradar.this.der = 0;
                if (((double) Georradar.this.col) > Georradar.this.limitedivi) {
                    Georradar georradar = Georradar.this;
                    double d = Georradar.this.limitedivi;
                    double d2 = (double) Georradar.this.col;
                    Double.isNaN(d2);
                    georradar.divi = (float) (d / d2);
                } else {
                    Georradar.this.divi = 1.0f;
                }
                Georradar.this.col2 = (int) (((float) Georradar.this.col) * Georradar.this.divi);
                Georradar.this.SAMPLES2 = (int) (((float) Georradar.this.SAMPLES) * Georradar.this.divi);
                Georradar.this.TIMEWINDOW2 = Georradar.this.TIMEWINDOW;
                Georradar georradar2 = Georradar.this;
                double d3 = georradar2.DISTANCE_INTERVAL;
                double d4 = (double) Georradar.this.multiplus;
                Double.isNaN(d4);
                georradar2.DISTANCE_INTERVAL = d3 * d4;
                Georradar.this.DISTANCE_INTERVAL2 = Georradar.this.DISTANCE_INTERVAL;
                Georradar.this.col2 = Georradar.this.col;
                Georradar.this.rotulos();
                ProgressDialog unused = Georradar.this.pDialog = new ProgressDialog(Georradar.this);
                Georradar.this.pDialog.setProgressStyle(1);
                ProgressDialog access$1100 = Georradar.this.pDialog;
                access$1100.setMessage(Georradar.this.lidioma[Georradar.this.nidioma][68] + Georradar.this.archivoelegido + Georradar.this.lidioma[Georradar.this.nidioma][69]);
                Georradar.this.pDialog.setCancelable(true);
                Georradar.this.pDialog.setMax(100);
                Georradar.this.voy = -1.0d;
                Georradar.this.tarea2 = new MiTareaAsincronaDialog();
                MiTareaAsincronaDialog miTareaAsincronaDialog = Georradar.this.tarea2;
                miTareaAsincronaDialog.execute(Georradar.this.directorioelegido + "/" + Georradar.this.archivoelegido);
            }
        });
        builder.setNeutralButton(this.lidioma[this.nidioma][56], new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass29 */

            public void onClick(DialogInterface dialogInterface, int i) {
                ((RelativeLayout) Georradar.this.findViewById(R.id.idlectura)).setVisibility(0);
                Georradar.this.ocultar();
            }
        });
        builder.show();
    }

    public void fullhd() {
        Math.ceil((double) (this.LAST_TRACE / 500));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("¡¡ CUIDADO ||\nLa opción HD necesita más memoria y puede hacer inestable el dspositivo-");
        builder.setPositiveButton("HD", new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass30 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Georradar.this.multiplus = 1;
                File file = new File(Georradar.this.directorioelegido + "/" + Georradar.this.archivoelegido);
                Georradar.this.LAST_TRACE = Georradar.this.LAST_TRACE / Georradar.this.multiplus;
                Georradar.this.col = Georradar.this.LAST_TRACE;
                if (((int) ((file.length() / ((long) Georradar.this.SAMPLES)) / 2)) < Georradar.this.col * Georradar.this.multiplus) {
                    Georradar.this.col = (int) (((file.length() / ((long) Georradar.this.SAMPLES)) / 2) / ((long) Georradar.this.multiplus));
                }
                Georradar.this.ma0 = (double[][]) Array.newInstance(double.class, Georradar.this.col + 1, Georradar.this.SAMPLES);
                Georradar.this.ma2 = (double[][]) Array.newInstance(double.class, Georradar.this.col + 1, Georradar.this.SAMPLES);
                Georradar.this.ma3 = (double[][]) Array.newInstance(double.class, Georradar.this.col + 1, Georradar.this.SAMPLES);
                Georradar.this.num = 0.0d;
                Georradar.this.min = 0.0d;
                Georradar.this.max = 0.0d;
                for (int i2 = 0; i2 <= Georradar.this.col; i2++) {
                    for (int i3 = 0; i3 < Georradar.this.SAMPLES; i3++) {
                        Georradar.this.ma0[i2][i3] = 0.0d;
                    }
                }
                Georradar.this.max = 0.0d;
                Georradar.this.min = 0.0d;
                Georradar.this.chivozoom = 0;
                Georradar.this.contraste = 1.0d;
                Georradar.this.contraste2 = 1.0d;
                Georradar.this.chivobn = 0;
                Georradar.this.trunca = 1.0d;
                Georradar.this.cerado = 0;
                Georradar.this.sincentrar = true;
                Georradar.this.chivoderi = 1;
                Georradar.this.chivoderj = 1.0d;
                Georradar.this.sincentrar = true;
                Georradar.this.chivoderi = 0;
                Georradar.this.chivatocolor = 0;
                Georradar.this.pizarra.setScaleX(1.0f);
                Georradar.this.pizarra.setScaleY(1.0f);
                Georradar.this.pizarra.setScrollX(0);
                Georradar.this.pizarra.setScrollY(0);
                Georradar.this.cerado = 0;
                Georradar.this.fondo = 0;
                Georradar.this.der = 0;
                if (((double) Georradar.this.col) > Georradar.this.limitedivi) {
                    Georradar.this.col = (int) Georradar.this.limitedivi;
                }
                Georradar.this.divi = 1.0f;
                Georradar.this.col2 = (int) (((float) Georradar.this.col) * Georradar.this.divi);
                Georradar.this.SAMPLES2 = (int) (((float) Georradar.this.SAMPLES) * Georradar.this.divi);
                Georradar.this.TIMEWINDOW2 = Georradar.this.TIMEWINDOW;
                Georradar georradar = Georradar.this;
                double d = georradar.DISTANCE_INTERVAL;
                double d2 = (double) Georradar.this.multiplus;
                Double.isNaN(d2);
                georradar.DISTANCE_INTERVAL = d * d2;
                Georradar.this.DISTANCE_INTERVAL2 = Georradar.this.DISTANCE_INTERVAL;
                Georradar.this.col2 = Georradar.this.col;
                Georradar.this.rotulos();
                ProgressDialog unused = Georradar.this.pDialog = new ProgressDialog(Georradar.this);
                Georradar.this.pDialog.setProgressStyle(1);
                ProgressDialog access$1100 = Georradar.this.pDialog;
                access$1100.setMessage(Georradar.this.lidioma[Georradar.this.nidioma][68] + Georradar.this.archivoelegido + Georradar.this.lidioma[Georradar.this.nidioma][69]);
                Georradar.this.pDialog.setCancelable(true);
                Georradar.this.pDialog.setMax(100);
                Georradar.this.voy = -1.0d;
                Georradar.this.tarea2 = new MiTareaAsincronaDialog();
                MiTareaAsincronaDialog miTareaAsincronaDialog = Georradar.this.tarea2;
                miTareaAsincronaDialog.execute(Georradar.this.directorioelegido + "/" + Georradar.this.archivoelegido);
            }
        });
        builder.setNegativeButton("Completo", new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass31 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Georradar.this.multiplus = (int) Math.ceil((double) (Georradar.this.LAST_TRACE / 1000));
                File file = new File(Georradar.this.directorioelegido + "/" + Georradar.this.archivoelegido);
                Georradar.this.LAST_TRACE = Georradar.this.LAST_TRACE / Georradar.this.multiplus;
                Georradar.this.col = Georradar.this.LAST_TRACE;
                if (((int) ((file.length() / ((long) Georradar.this.SAMPLES)) / 2)) < Georradar.this.col * Georradar.this.multiplus) {
                    Georradar.this.col = (int) (((file.length() / ((long) Georradar.this.SAMPLES)) / 2) / ((long) Georradar.this.multiplus));
                }
                Georradar.this.ma0 = (double[][]) Array.newInstance(double.class, Georradar.this.col + 1, Georradar.this.SAMPLES);
                Georradar.this.ma2 = (double[][]) Array.newInstance(double.class, Georradar.this.col + 1, Georradar.this.SAMPLES);
                Georradar.this.ma3 = (double[][]) Array.newInstance(double.class, Georradar.this.col + 1, Georradar.this.SAMPLES);
                Georradar.this.num = 0.0d;
                Georradar.this.min = 0.0d;
                Georradar.this.max = 0.0d;
                for (int i2 = 0; i2 <= Georradar.this.col; i2++) {
                    for (int i3 = 0; i3 < Georradar.this.SAMPLES; i3++) {
                        Georradar.this.ma0[i2][i3] = 0.0d;
                    }
                }
                Georradar.this.max = 0.0d;
                Georradar.this.min = 0.0d;
                Georradar.this.chivozoom = 0;
                Georradar.this.contraste = 1.0d;
                Georradar.this.contraste2 = 1.0d;
                Georradar.this.chivobn = 0;
                Georradar.this.trunca = 1.0d;
                Georradar.this.cerado = 0;
                Georradar.this.sincentrar = true;
                Georradar.this.chivoderi = 1;
                Georradar.this.chivoderj = 1.0d;
                Georradar.this.sincentrar = true;
                Georradar.this.chivoderi = 0;
                Georradar.this.chivatocolor = 0;
                Georradar.this.pizarra.setScaleX(1.0f);
                Georradar.this.pizarra.setScaleY(1.0f);
                Georradar.this.pizarra.setScrollX(0);
                Georradar.this.pizarra.setScrollY(0);
                Georradar.this.cerado = 0;
                Georradar.this.fondo = 0;
                Georradar.this.der = 0;
                if (((double) Georradar.this.col) > Georradar.this.limitedivi) {
                    Georradar georradar = Georradar.this;
                    double d = Georradar.this.limitedivi;
                    double d2 = (double) Georradar.this.col;
                    Double.isNaN(d2);
                    georradar.divi = (float) (d / d2);
                } else {
                    Georradar.this.divi = 1.0f;
                }
                Georradar.this.col2 = (int) (((float) Georradar.this.col) * Georradar.this.divi);
                Georradar.this.SAMPLES2 = (int) (((float) Georradar.this.SAMPLES) * Georradar.this.divi);
                Georradar.this.TIMEWINDOW2 = Georradar.this.TIMEWINDOW;
                Georradar georradar2 = Georradar.this;
                double d3 = georradar2.DISTANCE_INTERVAL;
                double d4 = (double) Georradar.this.multiplus;
                Double.isNaN(d4);
                georradar2.DISTANCE_INTERVAL = d3 * d4;
                Georradar.this.DISTANCE_INTERVAL2 = Georradar.this.DISTANCE_INTERVAL;
                Georradar.this.col2 = Georradar.this.col;
                Georradar.this.rotulos();
                ProgressDialog unused = Georradar.this.pDialog = new ProgressDialog(Georradar.this);
                Georradar.this.pDialog.setProgressStyle(1);
                ProgressDialog access$1100 = Georradar.this.pDialog;
                access$1100.setMessage(Georradar.this.lidioma[Georradar.this.nidioma][68] + Georradar.this.archivoelegido + Georradar.this.lidioma[Georradar.this.nidioma][69]);
                Georradar.this.pDialog.setCancelable(true);
                Georradar.this.pDialog.setMax(100);
                Georradar.this.voy = -1.0d;
                Georradar.this.tarea2 = new MiTareaAsincronaDialog();
                MiTareaAsincronaDialog miTareaAsincronaDialog = Georradar.this.tarea2;
                miTareaAsincronaDialog.execute(Georradar.this.directorioelegido + "/" + Georradar.this.archivoelegido);
            }
        });
        builder.setNeutralButton(this.lidioma[this.nidioma][56], new DialogInterface.OnClickListener() {
            /* class com.nieto.luis.gpr.Georradar.AnonymousClass32 */

            public void onClick(DialogInterface dialogInterface, int i) {
                ((RelativeLayout) Georradar.this.findViewById(R.id.idlectura)).setVisibility(0);
                Georradar.this.ocultar();
            }
        });
        builder.show();
    }

    class MiTareaAsincronaDialog extends AsyncTask<String, Integer, Boolean> {
        int estouen = 1;

        MiTareaAsincronaDialog() {
        }

        /* access modifiers changed from: protected */
        public Boolean doInBackground(String... strArr) {
            File file = new File(strArr[0]);
            long j = 1000;
            if (file.length() <= 1000) {
                j = 1;
            }
            int length = (int) (file.length() / j);
            if (Georradar.this.voy == -1.0d) {
                Georradar.this.pDialog.setMax(length);
            } else {
                Georradar.this.pDialog.setMax(1000);
            }
            try {
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(Georradar.this.directorioelegido + "/" + Georradar.this.archivoelegido));
                for (int i = 0; i < Georradar.this.SAMPLES; i++) {
                    Georradar.this.ma0[Georradar.this.col][i] = 0.0d;
                }
                if (Georradar.this.voy == -1.0d) {
                    this.estouen = 1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= Georradar.this.col * Georradar.this.multiplus) {
                            break;
                        }
                        for (int i3 = 0; i3 < Georradar.this.SAMPLES; i3++) {
                            if (i2 % Georradar.this.multiplus == 0) {
                                byte readByte = dataInputStream.readByte();
                                byte readByte2 = dataInputStream.readByte();
                                Georradar georradar = Georradar.this;
                                double d = (double) readByte2;
                                Double.isNaN(d);
                                double d2 = (double) readByte;
                                Double.isNaN(d2);
                                georradar.num = (d * 256.0d) + (d2 * 1.0d);
                                Georradar.this.ma0[i2 / Georradar.this.multiplus][i3] = Georradar.this.num;
                                double[] dArr = Georradar.this.ma0[Georradar.this.col];
                                dArr[i3] = dArr[i3] + Georradar.this.num;
                            }
                        }
                        int i4 = (int) (((long) ((i2 * 2) * Georradar.this.SAMPLES)) / j);
                        if (i4 > length) {
                            i4 = length;
                        }
                        publishProgress(Integer.valueOf(i4));
                        if (isCancelled()) {
                            break;
                        }
                        i2++;
                    }
                    for (int i5 = 0; i5 < Georradar.this.SAMPLES; i5++) {
                        double[] dArr2 = Georradar.this.ma0[Georradar.this.col];
                        double d3 = Georradar.this.ma0[Georradar.this.col][i5];
                        double d4 = (double) Georradar.this.col;
                        Double.isNaN(d4);
                        dArr2[i5] = d3 / d4;
                    }
                    publishProgress(Integer.valueOf(length));
                    dataInputStream.close();
                    return true;
                }
                this.estouen = 0;
                int i6 = ((int) Georradar.this.voy) * Georradar.this.SAMPLES * 2;
                if (Georradar.this.voy != 0.0d) {
                    Georradar.this.pDialog.setMax(i6 / 1000);
                    int i7 = 0;
                    for (int i8 = 0; i8 < i6; i8++) {
                        dataInputStream.readByte();
                        i7++;
                        if (i7 == 1000) {
                            publishProgress(Integer.valueOf(i8 / 1000));
                            i7 = 0;
                        }
                    }
                    this.estouen = 0;
                }
                Georradar.this.pDialog.setMax(1000);
                int i9 = 0;
                while (true) {
                    if (i9 >= 1000) {
                        break;
                    }
                    for (int i10 = 0; i10 < Georradar.this.SAMPLES; i10++) {
                        byte readByte3 = dataInputStream.readByte();
                        byte readByte4 = dataInputStream.readByte();
                        Georradar georradar2 = Georradar.this;
                        double d5 = (double) readByte4;
                        Double.isNaN(d5);
                        double d6 = (double) readByte3;
                        Double.isNaN(d6);
                        georradar2.num = (d5 * 256.0d) + (d6 * 1.0d);
                        Georradar.this.ma0[i9][i10] = Georradar.this.num;
                        double[] dArr3 = Georradar.this.ma0[Georradar.this.col];
                        dArr3[i10] = dArr3[i10] + Georradar.this.num;
                    }
                    long j2 = ((long) ((i9 * 2) * Georradar.this.SAMPLES)) / j;
                    publishProgress(Integer.valueOf(i9));
                    if (isCancelled()) {
                        break;
                    }
                    i9++;
                }
                for (int i11 = 0; i11 < Georradar.this.SAMPLES; i11++) {
                    double[] dArr4 = Georradar.this.ma0[Georradar.this.col];
                    double d7 = Georradar.this.ma0[Georradar.this.col][i11];
                    double d8 = (double) Georradar.this.col;
                    Double.isNaN(d8);
                    dArr4[i11] = d7 / d8;
                }
                publishProgress(Integer.valueOf(length));
                dataInputStream.close();
                return true;
            } catch (IOException unused) {
            }
        }

        /* access modifiers changed from: protected */
        public void onProgressUpdate(Integer... numArr) {
            int intValue = numArr[0].intValue();
            if (this.estouen == 1) {
                Georradar.this.pDialog.setMessage(Georradar.this.lidioma[Georradar.this.nidioma][74]);
            }
            if (this.estouen == 0) {
                double max = (double) Georradar.this.pDialog.getMax();
                Double.isNaN(max);
                if (((double) intValue) > max * 0.95d) {
                    Georradar.this.pDialog.setMessage(Georradar.this.lidioma[Georradar.this.nidioma][75]);
                } else if (Georradar.this.voy == -1.0d) {
                    ProgressDialog access$1100 = Georradar.this.pDialog;
                    access$1100.setMessage(Georradar.this.lidioma[Georradar.this.nidioma][68] + Georradar.this.archivoelegido + Georradar.this.lidioma[Georradar.this.nidioma][69]);
                } else {
                    ProgressDialog access$11002 = Georradar.this.pDialog;
                    access$11002.setMessage(Georradar.this.lidioma[Georradar.this.nidioma][78] + Georradar.this.archivoelegido + Georradar.this.lidioma[Georradar.this.nidioma][79]);
                }
            }
            if (intValue % 10 == 0) {
                Georradar.this.pDialog.setProgress(intValue);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            Georradar.this.pDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                /* class com.nieto.luis.gpr.Georradar.MiTareaAsincronaDialog.AnonymousClass1 */

                public void onCancel(DialogInterface dialogInterface) {
                    MiTareaAsincronaDialog.this.cancel(true);
                }
            });
            Georradar.this.pDialog.setProgress(0);
            Georradar.this.pDialog.show();
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                Georradar.this.pDialog.dismiss();
                Toast.makeText(Georradar.this, Georradar.this.lidioma[Georradar.this.nidioma][76], 0).show();
                Georradar.this.sincentrar = true;
                Georradar.this.chivoderi = 0;
                Georradar.this.textoaux = "";
                ((TextView) Georradar.this.findViewById(R.id.textView)).setText(Georradar.this.textoaux);
                Georradar.this.reseto3();
            }
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            Toast.makeText(Georradar.this, Georradar.this.lidioma[Georradar.this.nidioma][77], 0).show();
            ((RelativeLayout) Georradar.this.findViewById(R.id.idlectura)).setVisibility(0);
            Georradar.this.ocultar();
        }
    }

    public void abrerd3a() {
        File file = new File(this.directorioelegido + "/" + this.archivoelegido);
        int length = (int) ((file.length() / ((long) this.SAMPLES)) / 2);
        this.voy = 0.0d;
        double length2 = (double) file.length();
        Double.isNaN(length2);
        this.fin = length2 * 0.01d;
        if (length < this.col) {
            this.col = length;
        }
        this.ma0 = (double[][]) Array.newInstance(double.class, this.col + 1, this.SAMPLES);
        this.ma2 = (double[][]) Array.newInstance(double.class, this.col + 1, this.SAMPLES);
        this.ma3 = (double[][]) Array.newInstance(double.class, this.col + 1, this.SAMPLES);
        this.num = 0.0d;
        this.min = 0.0d;
        this.max = 0.0d;
        for (int i = 0; i <= this.col; i++) {
            for (int i2 = 0; i2 < this.SAMPLES; i2++) {
                this.ma0[i][i2] = 0.0d;
            }
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(this.directorioelegido + "/" + this.archivoelegido));
            for (int i3 = 0; i3 < this.SAMPLES; i3++) {
                this.ma0[this.col][i3] = 0.0d;
            }
            for (int i4 = 0; i4 < this.col; i4++) {
                for (int i5 = 0; i5 < this.SAMPLES; i5++) {
                    byte readByte = dataInputStream.readByte();
                    double readByte2 = (double) dataInputStream.readByte();
                    Double.isNaN(readByte2);
                    double d = (double) readByte;
                    Double.isNaN(d);
                    this.num = (readByte2 * 256.0d) + (d * 1.0d);
                    this.ma0[i4][i5] = this.num;
                    double[] dArr = this.ma0[this.col];
                    dArr[i5] = dArr[i5] + this.num;
                    this.voy += 1.0d;
                }
            }
            for (int i6 = 0; i6 < this.SAMPLES; i6++) {
                double[] dArr2 = this.ma0[this.col];
                double d2 = this.ma0[this.col][i6];
                double d3 = (double) this.col;
                Double.isNaN(d3);
                dArr2[i6] = d2 / d3;
            }
            reseto2();
        } catch (IOException unused) {
        }
    }

    public class PolRegresion {
        public double[] a;
        public int grado;
        double[][] m;
        private int nDatos;
        double[] t;
        private double[] x;
        private double[] y;

        private double potencia(double d, int i) {
            double d2 = 1.0d;
            for (int i2 = 0; i2 < i; i2++) {
                d2 *= d;
            }
            return d2;
        }

        public PolRegresion(double[] dArr, double[] dArr2, int i) {
            this.x = dArr;
            this.y = dArr2;
            this.nDatos = dArr.length;
            this.grado = i;
            int i2 = i + 1;
            this.t = new double[i2];
            this.m = (double[][]) Array.newInstance(double.class, i2, i2);
            this.a = new double[i2];
        }

        private void coeficientes() {
            double[] dArr = new double[((this.grado * 2) + 1)];
            int i = 0;
            while (true) {
                double d = 0.0d;
                if (i > this.grado * 2) {
                    break;
                }
                for (int i2 = 0; i2 < this.nDatos; i2++) {
                    d += potencia(this.x[i2], i);
                }
                dArr[i] = d;
                i++;
            }
            for (int i3 = 0; i3 <= this.grado; i3++) {
                double d2 = 0.0d;
                for (int i4 = 0; i4 < this.nDatos; i4++) {
                    d2 += potencia(this.x[i4], i3) * this.y[i4];
                }
                this.t[i3] = d2;
            }
            for (int i5 = 0; i5 <= this.grado; i5++) {
                for (int i6 = 0; i6 <= this.grado; i6++) {
                    this.m[i5][i6] = dArr[i5 + i6];
                }
            }
        }

        public void calculaPolinomio() {
            double d;
            coeficientes();
            for (int i = 0; i <= this.grado; i++) {
                double d2 = this.m[i][i];
                for (int i2 = 0; i2 <= this.grado; i2++) {
                    this.m[i][i2] = (-this.m[i][i2]) / d2;
                }
                this.t[i] = this.t[i] / d2;
                this.m[i][i] = 0.0d;
            }
            double[] dArr = new double[(this.grado + 1)];
            dArr[0] = this.t[0];
            for (int i3 = 1; i3 <= this.grado; i3++) {
                dArr[i3] = 0.0d;
            }
            do {
                d = 0.0d;
                int i4 = 0;
                while (i4 <= this.grado) {
                    this.a[i4] = this.t[i4];
                    for (int i5 = 0; i5 < i4; i5++) {
                        double[] dArr2 = this.a;
                        dArr2[i4] = dArr2[i4] + (this.m[i4][i5] * this.a[i5]);
                    }
                    int i6 = i4 + 1;
                    for (int i7 = i6; i7 <= this.grado; i7++) {
                        double[] dArr3 = this.a;
                        dArr3[i4] = dArr3[i4] + (this.m[i4][i7] * dArr[i7]);
                    }
                    double abs = Math.abs((this.a[i4] - dArr[i4]) / this.a[i4]);
                    if (abs > d) {
                        d = abs;
                    }
                    i4 = i6;
                }
                for (int i8 = 0; i8 <= this.grado; i8++) {
                    dArr[i8] = this.a[i8];
                }
            } while (d > Georradar.this.eerror);
        }
    }

    /**
     * 语言 nidioma
     */
    public void cambiatitulos() {

        if (this.nidioma == 2) {
            ((TextView) findViewById(R.id.textViewt)).setText(" - Working folder:                                  ");
            ((Button) findViewById(R.id.button16)).setText("Open");
            ((Button) findViewById(R.id.button17)).setText("DB Outlying");
            ((Button) findViewById(R.id.button18)).setText("Exit");
            ((TextView) findViewById(R.id.textView5)).setText(" - Choice the rd3-rad file:");
            ((TextView) findViewById(R.id.textView4)).setText("READING DIALOGUE");
            ((Button) findViewById(R.id.imageButton13)).setBackgroundResource(R.drawable.en);
            ((Button) findViewById(R.id.imageButton13b)).setBackgroundResource(R.drawable.en);
        }

    }

    /* access modifiers changed from: package-private */
    public void iniciaidioma() {
        cambiatitulos();
        this.lidioma[1][0] = "";
        this.lidioma[2][0] = "";
        this.lidioma[3][0] = "";
        this.lidioma[1][1] = " - Datos del archivo rad: (tardará ";
        this.lidioma[2][1] = " - File data rad: (it will take ";
        this.lidioma[3][1] = " - Fichier Rad (cela va durer ";
        this.lidioma[1][2] = " segundos en procesar)";
        this.lidioma[2][2] = " seconds to process)";
        this.lidioma[3][2] = " secondes pour traiter)";
        this.lidioma[1][3] = " Datos:";
        this.lidioma[2][3] = " Data:";
        this.lidioma[3][3] = " Données:";
        this.lidioma[1][4] = "Alcanzado el truncamiento nulo";
        this.lidioma[2][4] = "Reached null truncation";
        this.lidioma[3][4] = "Atteint la troncature nulle";
        this.lidioma[1][5] = "Alcanzado el mínimo";
        this.lidioma[2][5] = "Reached minimun value";
        this.lidioma[3][5] = "Atteint le minimum";
        this.lidioma[1][6] = "Derivación verical nula";
        this.lidioma[2][6] = "Derivation vertical null";
        this.lidioma[3][6] = "Dérivation verticale nula";
        this.lidioma[1][7] = "Derivación horizontal nula";
        this.lidioma[2][7] = "Derivation horizontal null";
        this.lidioma[3][7] = "Dérivation horizontale nula";
        this.lidioma[1][8] = "Recorte inferior nulo";
        this.lidioma[2][8] = "Null lower trim";
        this.lidioma[3][8] = "Coupez nulle du bas";
        this.lidioma[1][9] = "Recorte derecho nulo";
        this.lidioma[2][9] = "Null right Crop";
        this.lidioma[3][9] = "Couper nulle droit";
        this.lidioma[1][10] = "Recorte izquierdo nulo";
        this.lidioma[2][10] = "Null left Crop";
        this.lidioma[3][10] = "Couper nulle gauche";
        this.lidioma[1][11] = "Alcanzado el recorte máximo";
        this.lidioma[2][11] = "Reached the maximum cut";
        this.lidioma[3][11] = "Arrivé la découpe maximale";
        this.lidioma[1][12] = "Recorte derecho nulo";
        this.lidioma[2][12] = "Null right Crop";
        this.lidioma[3][12] = "Couper nulle droit";
        this.lidioma[1][13] = "Recorte izquierdo nulo";
        this.lidioma[2][13] = "Null left Crop";
        this.lidioma[3][13] = "Couper nulle gauche";
        this.lidioma[1][14] = "Introducción directa del valor de truncamiento.";
        this.lidioma[2][14] = "Direct input of the truncation value.";
        this.lidioma[3][14] = "Introduction directe de la valeur de troncature.";
        this.lidioma[1][15] = "Introducción directa del valor de ganancia potencial.";
        this.lidioma[2][15] = "Direct introduction of the potential gain value.";
        this.lidioma[3][15] = "Introduction directe de la valeur du gain potentiel.";
        this.lidioma[1][16] = "Introducción directa del valor de cero.";
        this.lidioma[2][16] = "Direct input of the value of zero.";
        this.lidioma[3][16] = "Introduction directe de zéro.";
        this.lidioma[1][17] = "Introducción directa de la variable de derivación vertical.";
        this.lidioma[2][17] = "Direct introduction of the derivation vertical variable.";
        this.lidioma[3][17] = "Introduction directe de la variable de dérivation verticale.";
        this.lidioma[1][18] = "Introducción directa de la variable de derivación horizontal.";
        this.lidioma[2][18] = "Direct introduction of the derivation horizontal variable.";
        this.lidioma[3][18] = "Introduction directe de la variable de dérivation horizontale.";
        this.lidioma[1][19] = "Introducción directa del valor de ganancia.";
        this.lidioma[2][19] = "Direct introduction of the gain value.";
        this.lidioma[3][19] = "Introduction directe de la valeur du gain";
        this.lidioma[1][20] = "Introducción directa del valor de recorte inferior.";
        this.lidioma[2][20] = "Direct input of the lower trim value.";
        this.lidioma[3][20] = "Introduction directe de la valeur de la récolte du bas.";
        this.lidioma[1][21] = "Introducción directa del valor de recorte derecho.";
        this.lidioma[2][21] = "Direct input of the right trim value.";
        this.lidioma[3][21] = "Introduction directe de la valeur de la récolte du droite.";
        this.lidioma[1][22] = "Introducción directa del valor de recorte izquierdo.";
        this.lidioma[2][22] = "Direct input of the left trim value.";
        this.lidioma[3][22] = "Introduction directe de la valeur de la récolte du gauche.";
        this.lidioma[1][23] = "Introducción directa de la suavidad.";
        this.lidioma[2][23] = "Direct introduction of the smooth value.";
        this.lidioma[3][23] = "Introduction directe de la valeur fluide.";
        this.lidioma[1][24] = "Introducción directa de la medida.";
        this.lidioma[2][24] = "Direct introduction of the measure.";
        this.lidioma[3][24] = "Introduction directe de la mesure.";
        this.lidioma[1][25] = "Introducción directa del valor de la normalización.";
        this.lidioma[2][25] = "Direct introduction of the normalization value.";
        this.lidioma[3][25] = "Introduction directe de la valeur de la normalisation.";
        this.lidioma[1][26] = "Introducción directa del valor del contraste.";
        this.lidioma[2][26] = "Direct input of the contrast value.";
        this.lidioma[3][26] = "Introduction directe de la valeur du contraste.";
        this.lidioma[1][27] = "Ponga un valor positivo.";
        this.lidioma[2][27] = "Enter a positive value.";
        this.lidioma[3][27] = "Mettez une valeur positive.";
        this.lidioma[1][28] = "Abriendo fichero: ";
        this.lidioma[2][28] = "Opening file: ";
        this.lidioma[3][28] = "Ouverture du fichier:";
        this.lidioma[1][29] = ". Por favor, espere...unos ";
        this.lidioma[2][29] = ". Please wait ... about ";
        this.lidioma[3][29] = ". S'il vous plaît attendre ... environ ";
        this.lidioma[1][30] = "No hay archivos GPR";
        this.lidioma[2][30] = "There aren't GPR files";
        this.lidioma[3][30] = "Il n'y a pas de fichiers GPR";
        this.lidioma[1][31] = "Elija primero un archivo";
        this.lidioma[2][31] = "First select a file";
        this.lidioma[3][31] = "Commencez par sélectionner un fichier";
        this.lidioma[1][32] = "Fichero GPR: ";
        this.lidioma[2][32] = "GPR file: ";
        this.lidioma[3][32] = "Fichier GPR: ";
        this.lidioma[1][33] = "Utiliza los mandos para modificar la variable de frecuencia";
        this.lidioma[2][33] = "Use the controls to change the variable frequency";
        this.lidioma[3][33] = "Utiliser les mandants pour modifier la variable de fréquence";
        this.lidioma[1][34] = "Elija forma de calcular la frecuencia";
        this.lidioma[2][34] = "Choose frequency calculation method";
        this.lidioma[3][34] = "Choisir la méthode de calcul de fréquence";
        this.lidioma[1][35] = "- El método simplificado directo es más rápido pero más impreciso.\n- El método de la 2ª derivada es más exacto y ... lento.";
        this.lidioma[2][35] = "- The direct simplified method is faster but more imprecise.\n- The 2nd derivative method is more accurate and ... slow. ";
        this.lidioma[3][35] = "- La méthode simplifiée directe est plus rapide mais plus imprécise. \n - La méthode dérivée 2 est plus précise et ... lente. ";
        this.lidioma[1][36] = "Simplificado\ndirecta";
        this.lidioma[2][36] = "Simplified\ndirect";
        this.lidioma[3][36] = "Simplifié\ndirecte";
        this.lidioma[1][37] = "Simplificado\n2ª derivada";
        this.lidioma[2][37] = "Simplified\n2nd derivative";
        this.lidioma[3][37] = "Simplifié\n2ème dérivé";
        this.lidioma[1][38] = "Tenga paciencia hasta completar el cálculo.";
        this.lidioma[2][38] = "Be patient until the calculation is complete";
        this.lidioma[3][38] = "Soyez patient pour effectuer le calcul.";
        this.lidioma[1][39] = "Utiliza los mandos para modificar la normalización";
        this.lidioma[2][39] = "Use the controls to change the normalization";
        this.lidioma[3][39] = "Utilisez les commandes pour changer les normes";
        this.lidioma[1][40] = "Tipo de ganancia";
        this.lidioma[2][40] = "Type of gain";
        this.lidioma[3][40] = "Type de gain";
        this.lidioma[1][41] = "Potencial";
        this.lidioma[2][41] = "Potential";
        this.lidioma[3][41] = "Potentiel";
        this.lidioma[1][42] = "Arcotangencial";
        this.lidioma[2][42] = "Arctangential";
        this.lidioma[3][42] = "Arc tangentielle";
        this.lidioma[1][43] = "Utiliza los mandos para modificar la ganancia potencial";
        this.lidioma[2][43] = "Use the controls to change the potential gain";
        this.lidioma[3][43] = "Utilisez les commandes pour changer le gain potentiel";
        this.lidioma[1][44] = "Utiliza los mandos para modificar la ganancia";
        this.lidioma[2][44] = "Use the controls to change the gain";
        this.lidioma[3][44] = "Utilisez les commandes pour changer le gain";
        this.lidioma[1][45] = "Guardado en:";
        this.lidioma[2][45] = "Saved in:";
        this.lidioma[3][45] = "Enregistré en:";
        this.lidioma[1][46] = "No hay archivos GPR";
        this.lidioma[2][46] = "There aren't GPR files";
        this.lidioma[3][46] = "Il n'y a pas de fichiers GPR";
        this.lidioma[1][47] = "Utiliza los mandos del zoom para aumentaro dirminuir el truncamiento";
        this.lidioma[2][47] = "Use the zoom controls to increase or decrease the truncation";
        this.lidioma[3][47] = "Utilisez les commandes de zoom pour augmenter ou diminuer la troncature";
        this.lidioma[1][48] = "Utilice los controles para subir/bajar el \"cero\"";
        this.lidioma[2][48] = "Use the controls to get on /down the \"zero\"";
        this.lidioma[3][48] = "Utilisez les commandes pour abaisser / relever le \"zéro\"";
        this.lidioma[1][49] = "PARÁMETROS DE LOS CAMBIOS:";
        this.lidioma[2][49] = "PARAMETERS OF THE CHANGES:";
        this.lidioma[3][49] = "PARAMETRES DES MODIFICATIONS SURVENUES:";
        this.lidioma[1][50] = "Tipo de derivada";
        this.lidioma[2][50] = "Derivative type";
        this.lidioma[3][50] = "Type de dérivé";
        this.lidioma[1][51] = "Vertical\n(Samples)";
        this.lidioma[2][51] = "Vertical\n(Samples)";
        this.lidioma[3][51] = "Vertical\n(Samples)";
        this.lidioma[1][52] = "Horizontal\n(Traces)";
        this.lidioma[2][52] = "Horizontal\n(Traces)";
        this.lidioma[3][52] = "Horizontal\n(Traces)";
        this.lidioma[1][53] = "Horizontal_2\n(Traces)";
        this.lidioma[2][53] = "Horizontal_2\n(Traces)";
        this.lidioma[3][53] = "Horizontal_2\n(Traces)";
        this.lidioma[1][54] = "Introducción directa de la constante dieléctrica";
        this.lidioma[2][54] = "Direct introduction of the dielectric constant";
        this.lidioma[3][54] = "Introduction directe de la constante diélectrique";
        this.lidioma[1][55] = "Aceptar";
        this.lidioma[2][55] = "Accept";
        this.lidioma[3][55] = "Accepter";
        this.lidioma[1][56] = "Salir";
        this.lidioma[2][56] = "Exit";
        this.lidioma[3][56] = "Sortir";
        this.lidioma[1][57] = "Elección de tipo de marca";
        this.lidioma[2][57] = "Choice of marker type";
        this.lidioma[3][57] = "Choix du type de marqueur";
        this.lidioma[1][58] = " - Cuadrado: Muestra un cuadrado.\n - Hiperbólico: Muestra un círculo y su hipérbola asociada.";
        this.lidioma[2][58] = " - Square: Displays a square.\n - Hyperbolic: Shows a circle and its associated hyperbola.";
        this.lidioma[3][58] = " - Square: Affiche un carré.\n - Hyperbolique: Affiche un cercle et son hyperbole associée.";
        this.lidioma[1][59] = "Como no se ha tomado el desplazamiento sólo pueden medirse profundidades.";
        this.lidioma[2][59] = "As displacement has not been recorded, only depths can be measured.";
        this.lidioma[3][59] = "Comme le déplacement n'a pas été enregistré, seulement des profondeurs peut être mesurée.";
        this.lidioma[1][60] = "Cuadrado";
        this.lidioma[2][60] = "Square";
        this.lidioma[3][60] = "Carré";
        this.lidioma[1][61] = "Banda";
        this.lidioma[2][61] = "Band";
        this.lidioma[3][61] = "Band";
        this.lidioma[1][62] = "Hiperbólico";
        this.lidioma[2][62] = "Hyperbolic";
        this.lidioma[3][62] = "Hyperbolique";
        this.lidioma[1][63] = "Dirección del suavizado";
        this.lidioma[2][63] = "Smoothing direction";
        this.lidioma[3][63] = "Sens de lissage";
        this.lidioma[1][64] = "Tipo de corte";
        this.lidioma[2][64] = "Type of cut";
        this.lidioma[3][64] = "Type de coupe";
        this.lidioma[1][65] = "Inferior";
        this.lidioma[2][65] = "Lower";
        this.lidioma[3][65] = "Inférieur";
        this.lidioma[1][66] = "Derecho";
        this.lidioma[2][66] = "Right";
        this.lidioma[3][66] = "Droit";
        this.lidioma[1][67] = "Izquierdo";
        this.lidioma[2][67] = "Left";
        this.lidioma[3][67] = "Gauche";
        this.lidioma[1][68] = "Leyendo archivo ";
        this.lidioma[2][68] = "Reading file ";
        this.lidioma[3][68] = "Lecture du fichier ";
        this.lidioma[1][69] = " (en kB)";
        this.lidioma[2][69] = " (in kB)";
        this.lidioma[3][69] = " (en kB)";
        this.lidioma[1][70] = "El archivo es muy grande (";
        this.lidioma[2][70] = "The file is very large (";
        this.lidioma[3][70] = "Le fichier est très grand (";
        this.lidioma[1][71] = " lecturas)\nElija parte (1..";
        this.lidioma[2][71] = "Readings)\nChoose part (1 ..";
        this.lidioma[3][71] = "lectures)\nChoisissez une partie (1 ..";
        this.lidioma[1][72] = "Partido";
        this.lidioma[2][72] = "Part";
        this.lidioma[3][72] = "Partie";
        this.lidioma[1][73] = "Completo";
        this.lidioma[2][73] = "Full";
        this.lidioma[3][73] = "Complet";
        this.lidioma[1][74] = "Leyendo datos previos";
        this.lidioma[2][74] = "Reading previous data";
        this.lidioma[3][74] = "Lecture des données précédentes";
        this.lidioma[1][75] = "Finalizando la lectura\nPreparando el siguiente paso.";
        this.lidioma[2][75] = "Finishing the reading\nPreparing the next step.";
        this.lidioma[3][75] = "Terminer la lecture\nPréparer l'étape suivante.";
        this.lidioma[1][76] = "Tarea finalizada";
        this.lidioma[2][76] = "Task completed";
        this.lidioma[3][76] = "Tâche terminée";
        this.lidioma[1][77] = "¡Tarea cancelada!";
        this.lidioma[2][77] = "Task canceled!";
        this.lidioma[3][77] = "Tâche annulée!";
        this.lidioma[1][78] = "Leyendo archivo ";
        this.lidioma[2][78] = "Reading file ";
        this.lidioma[3][78] = "Lecture du fichier ";
        this.lidioma[1][79] = " (en traces)";
        this.lidioma[2][79] = " (in traces)";
        this.lidioma[3][79] = " (en traces)";
        this.lidioma[1][80] = "Abra un archivo válido";
        this.lidioma[2][80] = "Open a valid file";
        this.lidioma[3][80] = "Ouvrez un fichier valide";
    }
}