/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b.a;

import com.ibm.icu.a.b.a.t;
import com.ibm.icu.b.b;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class y
implements t {
    private Writer b;
    private List c;
    static final String a = "Null";
    private static final String d = "    ";

    public y(Writer writer) {
        this.b = writer;
        this.c = new ArrayList();
    }

    public boolean a(String string) {
        this.d();
        this.d("<" + string + ">");
        this.c.add(string);
        return true;
    }

    public boolean a() {
        int n2 = this.c.size() - 1;
        if (n2 >= 0) {
            String string = (String)this.c.remove(n2);
            this.d();
            this.d("</" + string + ">");
            return true;
        }
        return false;
    }

    public void b() {
        try {
            this.b.flush();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public void a(String string, boolean bl2) {
        this.b(string, String.valueOf(bl2));
    }

    public void a(String string, boolean[] arrbl) {
        if (arrbl != null) {
            String[] arrstring = new String[arrbl.length];
            for (int i2 = 0; i2 < arrbl.length; ++i2) {
                arrstring[i2] = String.valueOf(arrbl[i2]);
            }
            this.a(string, arrstring);
        }
    }

    private static String a(char c2) {
        if (c2 == '<') {
            return "&lt;";
        }
        if (c2 == '&') {
            return "&amp;";
        }
        return String.valueOf(c2);
    }

    public void a(String string, char c2) {
        if (c2 != '\uffff') {
            this.b(string, y.a(c2));
        }
    }

    public void a(String string, char[] arrc) {
        if (arrc != null) {
            String[] arrstring = new String[arrc.length];
            for (int i2 = 0; i2 < arrc.length; ++i2) {
                char c2 = arrc[i2];
                arrstring[i2] = c2 == '\uffff' ? a : y.a(c2);
            }
            this.b(string, arrstring);
        }
    }

    public void a(String string, String[] arrstring, int n2) {
        if (n2 >= 0) {
            this.b(string, arrstring[n2]);
        }
    }

    public void a(String string, String[] arrstring, byte[] arrby) {
        if (arrby != null) {
            String[] arrstring2 = new String[arrby.length];
            for (int i2 = 0; i2 < arrby.length; ++i2) {
                byte by2 = arrby[i2];
                arrstring2[i2] = by2 < 0 ? a : arrstring[by2];
            }
            this.b(string, arrstring2);
        }
    }

    public static String b(String string) {
        if (string == null) {
            return null;
        }
        StringBuilder stringBuilder = null;
        boolean bl2 = false;
        char c2 = '\u0000';
        boolean bl3 = false;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            c2 = string.charAt(i2);
            if (com.ibm.icu.b.b.p(c2)) {
                if (stringBuilder == null && (bl2 || c2 != ' ')) {
                    stringBuilder = new StringBuilder(string.substring(0, i2));
                }
                if (bl2) continue;
                bl2 = true;
                bl3 = false;
                c2 = ' ';
            } else {
                bl2 = false;
                boolean bl4 = bl3 = c2 == '<' || c2 == '&';
                if (bl3 && stringBuilder == null) {
                    stringBuilder = new StringBuilder(string.substring(0, i2));
                }
            }
            if (stringBuilder == null) continue;
            if (bl3) {
                stringBuilder.append(c2 == '<' ? "&lt;" : "&amp;");
                continue;
            }
            stringBuilder.append(c2);
        }
        if (stringBuilder != null) {
            return stringBuilder.toString();
        }
        return string;
    }

    private void b(String string, String string2) {
        if (string2 != null) {
            this.d();
            this.d("<" + string + ">" + string2 + "</" + string + ">");
        }
    }

    private void b(String string, String[] arrstring) {
        if (arrstring != null) {
            this.c(string + "List");
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                String string2 = arrstring[i2];
                if (string2 == null) {
                    string2 = a;
                }
                this.a(string, string2);
            }
            this.c();
        }
    }

    public void a(String string, String string2) {
        this.b(string, y.b(string2));
    }

    public void a(String string, String[] arrstring) {
        if (arrstring != null) {
            this.c(string + "List");
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                String string2 = y.b(arrstring[i2]);
                if (string2 == null) {
                    string2 = a;
                }
                this.b(string, string2);
            }
            this.c();
        }
    }

    public void a(String string, String[][] arrstring) {
        if (arrstring != null) {
            this.c(string + "Table");
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                String[] arrstring2 = arrstring[i2];
                if (arrstring2 == null) {
                    this.b(string + "List", a);
                    continue;
                }
                this.a(string, arrstring2);
            }
            this.c();
        }
    }

    private void c(String string) {
        this.d();
        this.d("<" + string + ">");
        this.c.add(string);
    }

    private void c() {
        int n2 = this.c.size() - 1;
        String string = (String)this.c.remove(n2);
        this.d();
        this.d("</" + string + ">");
    }

    private void d() {
        this.d("\n");
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            this.d(d);
        }
    }

    private void d(String string) {
        if (this.b != null) {
            try {
                this.b.write(string);
            }
            catch (IOException iOException) {
                System.err.println(iOException.getMessage());
                this.b = null;
            }
        }
    }
}

