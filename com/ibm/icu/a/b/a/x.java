/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b.a;

import com.ibm.icu.a.b.a.s;
import com.ibm.icu.b.b;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class x
implements s {
    private Reader a;
    private List b;
    private boolean c;
    private String d;

    public x(Reader reader) {
        this.a = reader;
        this.b = new ArrayList();
        if (this.c().startsWith("?xml")) {
            this.d();
        }
        if (this.c().startsWith("!--")) {
            this.d();
        }
    }

    public boolean a(String string) {
        if (this.c().equals(string)) {
            this.b.add(string);
            this.d();
            return true;
        }
        return false;
    }

    public boolean a() {
        int n2 = this.b.size() - 1;
        String string = (String)this.b.get(n2);
        if (this.c().equals("/" + string)) {
            this.b.remove(n2);
            this.d();
            return true;
        }
        return false;
    }

    public boolean b(String string) {
        String string2 = this.f(string);
        if (string2 != null) {
            return "true".equals(string2);
        }
        return false;
    }

    public boolean[] c(String string) {
        String[] arrstring = this.g(string);
        if (arrstring != null) {
            boolean[] arrbl = new boolean[arrstring.length];
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                arrbl[i2] = "true".equals(arrstring[i2]);
            }
            return arrbl;
        }
        return null;
    }

    public char d(String string) {
        String string2 = this.f(string);
        if (string2 != null) {
            return string2.charAt(0);
        }
        return '\uffff';
    }

    public char[] e(String string) {
        String[] arrstring = this.g(string);
        if (arrstring != null) {
            char[] arrc = new char[arrstring.length];
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                arrc[i2] = arrstring[i2].charAt(0);
            }
            return arrc;
        }
        return null;
    }

    public byte a(String string, String[] arrstring) {
        String string2 = this.f(string);
        if (string2 != null) {
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                if (!string2.equals(arrstring[i2])) continue;
                return (byte)i2;
            }
        }
        return -1;
    }

    public byte[] b(String string, String[] arrstring) {
        String[] arrstring2 = this.g(string);
        if (arrstring2 != null) {
            byte[] arrby = new byte[arrstring2.length];
            block0: for (int i2 = 0; i2 < arrstring2.length; ++i2) {
                String string2 = arrstring2[i2];
                for (int i3 = 0; i3 < arrstring.length; ++i3) {
                    if (!arrstring[i3].equals(string2)) continue;
                    arrby[i2] = (byte)i3;
                    continue block0;
                }
                arrby[i2] = -1;
            }
            return arrby;
        }
        return null;
    }

    public String f(String string) {
        if (this.i(string)) {
            String string2 = this.e();
            if (this.i("/" + string)) {
                return string2;
            }
        }
        return null;
    }

    public String[] g(String string) {
        if (this.i(string + "List")) {
            String string2;
            ArrayList<String> arrayList = new ArrayList<String>();
            while (null != (string2 = this.f(string))) {
                if ("Null".equals(string2)) {
                    string2 = null;
                }
                arrayList.add(string2);
            }
            if (this.i("/" + string + "List")) {
                return arrayList.toArray(new String[arrayList.size()]);
            }
        }
        return null;
    }

    public String[][] h(String string) {
        if (this.i(string + "Table")) {
            String[] arrstring;
            ArrayList<String[]> arrayList = new ArrayList<String[]>();
            while (null != (arrstring = this.g(string))) {
                arrayList.add(arrstring);
            }
            if (this.i("/" + string + "Table")) {
                return (String[][])arrayList.toArray((T[])new String[arrayList.size()][]);
            }
        }
        return null;
    }

    private boolean i(String string) {
        if (this.c().equals(string)) {
            this.d();
            return true;
        }
        return false;
    }

    private String c() {
        if (this.d == null) {
            this.d = this.f();
        }
        return this.d;
    }

    private void d() {
        this.d = null;
    }

    private String e() {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl2 = false;
        while (true) {
            if ((n2 = this.b()) == -1 || n2 == 60) break;
            if (n2 == 38) {
                StringBuilder stringBuilder2;
                n2 = this.b();
                if (n2 == 35) {
                    stringBuilder2 = new StringBuilder();
                    int n3 = 10;
                    n2 = this.b();
                    if (n2 == 120) {
                        n3 = 16;
                        n2 = this.b();
                    }
                    while (n2 != 59 && n2 != -1) {
                        stringBuilder2.append((char)n2);
                        n2 = this.b();
                    }
                    try {
                        int n4 = Integer.parseInt(stringBuilder2.toString(), n3);
                        n2 = (char)n4;
                    }
                    catch (NumberFormatException numberFormatException) {
                        System.err.println("numbuf: " + stringBuilder2.toString() + " radix: " + n3);
                        throw numberFormatException;
                    }
                } else {
                    stringBuilder2 = new StringBuilder();
                    while (n2 != 59 && n2 != -1) {
                        stringBuilder2.append((char)n2);
                        n2 = this.b();
                    }
                    String string = stringBuilder2.toString();
                    if (string.equals("lt")) {
                        n2 = 60;
                    } else if (string.equals("gt")) {
                        n2 = 62;
                    } else if (string.equals("quot")) {
                        n2 = 34;
                    } else if (string.equals("apos")) {
                        n2 = 39;
                    } else if (string.equals("amp")) {
                        n2 = 38;
                    } else {
                        System.err.println("unrecognized character entity: '" + string + "'");
                        continue;
                    }
                }
            }
            if (com.ibm.icu.b.b.p(n2)) {
                if (bl2) continue;
                n2 = 32;
                bl2 = true;
            } else {
                bl2 = false;
            }
            stringBuilder.append((char)n2);
        }
        this.c = n2 == 60;
        return stringBuilder.toString();
    }

    private String f() {
        int n2 = 0;
        while (!this.c) {
            n2 = this.b();
            if (n2 == 60 || n2 == -1) {
                if (n2 != 60) break;
                this.c = true;
                break;
            }
            if (com.ibm.icu.b.b.p(n2)) continue;
            System.err.println("Unexpected non-whitespace character " + Integer.toHexString(n2));
            break;
        }
        if (this.c) {
            this.c = false;
            StringBuilder stringBuilder = new StringBuilder();
            while ((n2 = this.b()) != 62 && n2 != -1) {
                stringBuilder.append((char)n2);
            }
            return stringBuilder.toString();
        }
        return null;
    }

    int b() {
        try {
            return this.a.read();
        }
        catch (IOException iOException) {
            return -1;
        }
    }
}

