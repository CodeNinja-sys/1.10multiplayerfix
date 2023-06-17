/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.g;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import org.apache.commons.compress.archivers.g.e;
import org.apache.commons.compress.archivers.g.f;
import org.apache.commons.compress.archivers.h.am;

public class a
implements org.apache.commons.compress.archivers.a,
e {
    private String ah = "";
    private int ai;
    private int aj = 0;
    private int ak = 0;
    private long al = 0L;
    private long am;
    private boolean an;
    private byte ao;
    private String ap = "";
    private String aq = "ustar\u0000";
    private String ar = "00";
    private String as;
    private String at = "";
    private int au = 0;
    private int av = 0;
    private boolean aw;
    private long ax;
    private final File ay;
    public static final int b = 31;
    public static final int c = 16877;
    public static final int d = 33188;
    public static final int e = 1000;

    private a() {
        String string = System.getProperty("user.name", "");
        if (string.length() > 31) {
            string = string.substring(0, 31);
        }
        this.as = string;
        this.ay = null;
    }

    public a(String string) {
        this(string, false);
    }

    public a(String string, boolean bl2) {
        this();
        string = a.a(string, bl2);
        boolean bl3 = string.endsWith("/");
        this.ah = string;
        this.ai = bl3 ? 16877 : 33188;
        this.ao = (byte)(bl3 ? 53 : 48);
        this.am = new Date().getTime() / 1000L;
        this.as = "";
    }

    public a(String string, byte by2) {
        this(string, by2, false);
    }

    public a(String string, byte by2, boolean bl2) {
        this(string, bl2);
        this.ao = by2;
        if (by2 == 76) {
            this.aq = "ustar ";
            this.ar = " \u0000";
        }
    }

    public a(File file) {
        this(file, a.a(file.getPath(), false));
    }

    public a(File file, String string) {
        this.ay = file;
        if (file.isDirectory()) {
            this.ai = 16877;
            this.ao = (byte)53;
            int n2 = string.length();
            this.ah = n2 == 0 || string.charAt(n2 - 1) != '/' ? string + "/" : string;
        } else {
            this.ai = 33188;
            this.ao = (byte)48;
            this.al = file.length();
            this.ah = string;
        }
        this.am = file.lastModified() / 1000L;
        this.as = "";
    }

    public a(byte[] arrby) {
        this();
        this.b(arrby);
    }

    public a(byte[] arrby, am am2) {
        this();
        this.a(arrby, am2);
    }

    public boolean a(a a2) {
        return this.getName().equals(a2.getName());
    }

    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        return this.a((a)object);
    }

    public int hashCode() {
        return this.getName().hashCode();
    }

    public boolean b(a a2) {
        return a2.getName().startsWith(this.getName());
    }

    public String getName() {
        return this.ah.toString();
    }

    public void a(String string) {
        this.ah = a.a(string, false);
    }

    public void a(int n2) {
        this.ai = n2;
    }

    public String b() {
        return this.ap.toString();
    }

    public void b(String string) {
        this.ap = string;
    }

    public int c() {
        return this.aj;
    }

    public void b(int n2) {
        this.aj = n2;
    }

    public int d() {
        return this.ak;
    }

    public void c(int n2) {
        this.ak = n2;
    }

    public String e() {
        return this.as.toString();
    }

    public void c(String string) {
        this.as = string;
    }

    public String f() {
        return this.at.toString();
    }

    public void d(String string) {
        this.at = string;
    }

    public void a(int n2, int n3) {
        this.b(n2);
        this.c(n3);
    }

    public void a(String string, String string2) {
        this.c(string);
        this.d(string2);
    }

    public void a(long l2) {
        this.am = l2 / 1000L;
    }

    public void a(Date date) {
        this.am = date.getTime() / 1000L;
    }

    public Date g() {
        return new Date(this.am * 1000L);
    }

    public Date a() {
        return this.g();
    }

    public boolean h() {
        return this.an;
    }

    public File i() {
        return this.ay;
    }

    public int j() {
        return this.ai;
    }

    public long getSize() {
        return this.al;
    }

    public void b(long l2) {
        if (l2 < 0L) {
            throw new IllegalArgumentException("Size is out of range: " + l2);
        }
        this.al = l2;
    }

    public int k() {
        return this.au;
    }

    public void d(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Major device number is out of range: " + n2);
        }
        this.au = n2;
    }

    public int l() {
        return this.av;
    }

    public void e(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Minor device number is out of range: " + n2);
        }
        this.av = n2;
    }

    public boolean m() {
        return this.aw;
    }

    public long n() {
        return this.ax;
    }

    public boolean o() {
        return this.ao == 83;
    }

    public boolean p() {
        return this.ao == 75 && this.ah.equals("././@LongLink");
    }

    public boolean q() {
        return this.ao == 76 && this.ah.equals("././@LongLink");
    }

    public boolean r() {
        return this.ao == 120 || this.ao == 88;
    }

    public boolean s() {
        return this.ao == 103;
    }

    public boolean isDirectory() {
        if (this.ay != null) {
            return this.ay.isDirectory();
        }
        if (this.ao == 53) {
            return true;
        }
        return this.getName().endsWith("/");
    }

    public boolean t() {
        if (this.ay != null) {
            return this.ay.isFile();
        }
        if (this.ao == 0 || this.ao == 48) {
            return true;
        }
        return !this.getName().endsWith("/");
    }

    public boolean u() {
        return this.ao == 50;
    }

    public boolean v() {
        return this.ao == 49;
    }

    public boolean w() {
        return this.ao == 51;
    }

    public boolean x() {
        return this.ao == 52;
    }

    public boolean y() {
        return this.ao == 54;
    }

    public a[] z() {
        if (this.ay == null || !this.ay.isDirectory()) {
            return new a[0];
        }
        String[] arrstring = this.ay.list();
        a[] arra = new a[arrstring.length];
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            arra[i2] = new a(new File(this.ay, arrstring[i2]));
        }
        return arra;
    }

    public void a(byte[] arrby) {
        try {
            this.a(arrby, f.a, false);
        }
        catch (IOException iOException) {
            try {
                this.a(arrby, f.b, false);
            }
            catch (IOException iOException2) {
                throw new RuntimeException(iOException2);
            }
        }
    }

    public void a(byte[] arrby, am am2, boolean bl2) {
        int n2 = 0;
        n2 = f.a(this.ah, arrby, n2, 100, am2);
        n2 = this.a(this.ai, arrby, n2, 8, bl2);
        n2 = this.a(this.aj, arrby, n2, 8, bl2);
        n2 = this.a(this.ak, arrby, n2, 8, bl2);
        n2 = this.a(this.al, arrby, n2, 12, bl2);
        int n3 = n2 = this.a(this.am, arrby, n2, 12, bl2);
        for (int i2 = 0; i2 < 8; ++i2) {
            arrby[n2++] = 32;
        }
        arrby[n2++] = this.ao;
        n2 = f.a(this.ap, arrby, n2, 100, am2);
        n2 = f.a(this.aq, arrby, n2, 6);
        n2 = f.a(this.ar, arrby, n2, 2);
        n2 = f.a(this.as, arrby, n2, 32, am2);
        n2 = f.a(this.at, arrby, n2, 32, am2);
        n2 = this.a(this.au, arrby, n2, 8, bl2);
        n2 = this.a(this.av, arrby, n2, 8, bl2);
        while (n2 < arrby.length) {
            arrby[n2++] = 0;
        }
        long l2 = f.a(arrby);
        f.e(l2, arrby, n3, 8);
    }

    private int a(long l2, byte[] arrby, int n2, int n3, boolean bl2) {
        if (!(bl2 || l2 >= 0L && l2 < 1L << 3 * (n3 - 1))) {
            return f.c(0L, arrby, n2, n3);
        }
        return f.d(l2, arrby, n2, n3);
    }

    public void b(byte[] arrby) {
        try {
            this.a(arrby, f.a);
        }
        catch (IOException iOException) {
            try {
                this.b(arrby, f.a, true);
            }
            catch (IOException iOException2) {
                throw new RuntimeException(iOException2);
            }
        }
    }

    public void a(byte[] arrby, am am2) {
        this.b(arrby, am2, false);
    }

    private void b(byte[] arrby, am am2, boolean bl2) {
        int n2 = 0;
        this.ah = bl2 ? f.c(arrby, n2, 100) : f.a(arrby, n2, 100, am2);
        this.ai = (int)f.b(arrby, n2 += 100, 8);
        this.aj = (int)f.b(arrby, n2 += 8, 8);
        this.ak = (int)f.b(arrby, n2 += 8, 8);
        this.al = f.b(arrby, n2 += 8, 12);
        this.am = f.b(arrby, n2 += 12, 12);
        n2 += 12;
        this.an = f.b(arrby);
        n2 += 8;
        this.ao = arrby[n2++];
        this.ap = bl2 ? f.c(arrby, n2, 100) : f.a(arrby, n2, 100, am2);
        this.aq = f.c(arrby, n2 += 100, 6);
        this.ar = f.c(arrby, n2 += 6, 2);
        this.as = bl2 ? f.c(arrby, n2, 32) : f.a(arrby, n2 += 2, 32, am2);
        this.at = bl2 ? f.c(arrby, n2, 32) : f.a(arrby, n2 += 32, 32, am2);
        this.au = (int)f.b(arrby, n2 += 32, 8);
        this.av = (int)f.b(arrby, n2 += 8, 8);
        n2 += 8;
        int n3 = this.c(arrby);
        switch (n3) {
            case 2: {
                n2 += 12;
                n2 += 12;
                n2 += 12;
                n2 += 4;
                ++n2;
                this.aw = f.a(arrby, n2 += 96);
                this.ax = f.a(arrby, ++n2, 12);
                n2 += 12;
                break;
            }
            default: {
                String string;
                String string2 = string = bl2 ? f.c(arrby, n2, 155) : f.a(arrby, n2, 155, am2);
                if (this.isDirectory() && !this.ah.endsWith("/")) {
                    this.ah = this.ah + "/";
                }
                if (string.length() <= 0) break;
                this.ah = string + "/" + this.ah;
            }
        }
    }

    private static String a(String string, boolean bl2) {
        String string2 = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);
        if (string2 != null) {
            int n2;
            if (string2.startsWith("windows")) {
                if (string.length() > 2) {
                    n2 = string.charAt(0);
                    char c2 = string.charAt(1);
                    if (c2 == ':' && (n2 >= 97 && n2 <= 122 || n2 >= 65 && n2 <= 90)) {
                        string = string.substring(2);
                    }
                }
            } else if (string2.indexOf("netware") > -1 && (n2 = string.indexOf(58)) != -1) {
                string = string.substring(n2 + 1);
            }
        }
        string = string.replace(File.separatorChar, '/');
        while (!bl2 && string.startsWith("/")) {
            string = string.substring(1);
        }
        return string;
    }

    private int c(byte[] arrby) {
        if (org.apache.commons.compress.c.a.a("ustar ", arrby, 257, 6)) {
            return 2;
        }
        if (org.apache.commons.compress.c.a.a("ustar\u0000", arrby, 257, 6)) {
            return 3;
        }
        return 0;
    }
}

