/*
 * Decompiled with CFR 0.150.
 */
package e.a.a;

import com.b.a.b;
import com.b.a.c;
import com.b.a.d;
import com.b.b.h;
import com.b.b.v;
import e.a.e;
import e.a.n;
import e.a.p;
import e.a.t;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownServiceException;
import javax.sound.sampled.AudioFormat;

public class a
implements e {
    private static final boolean a = false;
    private static final boolean b = true;
    private static final boolean c = false;
    private URL d;
    private URLConnection e = null;
    private InputStream f;
    private AudioFormat g;
    private boolean h = false;
    private boolean i = false;
    private byte[] j = null;
    private int k;
    private int l = 0;
    private int m = 0;
    private int n;
    private byte[] o = null;
    private float[][][] p;
    private int[] q;
    private b r = new b();
    private c s = new c();
    private d t = new d();
    private com.b.a.e u = new com.b.a.e();
    private h v = new h();
    private com.b.b.a w = new com.b.b.a(this.v);
    private com.b.b.e x = new com.b.b.e();
    private v y = new v();
    private t z = e.a.p.b();

    public void a(boolean bl2) {
    }

    public boolean a(URL uRL) {
        this.a(true, false);
        if (this.t != null) {
            this.t.b();
        }
        if (this.w != null) {
            this.w.a();
        }
        if (this.v != null) {
            this.v.a();
        }
        if (this.y != null) {
            this.y.b();
        }
        if (this.u != null) {
            this.u.a();
        }
        if (this.f != null) {
            try {
                this.f.close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        this.d = uRL;
        this.k = 8192;
        this.j = null;
        this.l = 0;
        this.m = 0;
        this.t = new d();
        this.w = new com.b.b.a(this.v);
        this.v = new h();
        this.y = new v();
        this.u = new com.b.a.e();
        try {
            this.e = uRL.openConnection();
        }
        catch (UnknownServiceException unknownServiceException) {
            this.a("Unable to create a UrlConnection in method 'initialize'.");
            this.a(unknownServiceException);
            this.e();
            return false;
        }
        catch (IOException iOException) {
            this.a("Unable to create a UrlConnection in method 'initialize'.");
            this.a(iOException);
            this.e();
            return false;
        }
        if (this.e != null) {
            try {
                this.f = this.e.getInputStream();
            }
            catch (IOException iOException) {
                this.a("Unable to acquire inputstream in method 'initialize'.");
                this.a(iOException);
                this.e();
                return false;
            }
        }
        this.b(true, false);
        this.u.c();
        this.u.a(this.k);
        this.j = this.u.a;
        try {
            if (!this.g()) {
                this.a("Error reading the header");
                return false;
            }
        }
        catch (IOException iOException) {
            this.a("Error reading the header");
            return false;
        }
        this.n = this.k * 2;
        this.v.a(this.y);
        this.w.a(this.v);
        int n2 = this.y.b;
        int n3 = this.y.c;
        this.g = new AudioFormat(n3, 16, n2, true, false);
        this.p = new float[1][][];
        this.q = new int[this.y.b];
        this.a(true, true);
        return true;
    }

    public boolean a() {
        return this.a(false, false);
    }

    public n b() {
        byte[] arrby = null;
        while (!(this.b(false, false) || arrby != null && arrby.length >= e.a.p.l())) {
            if (arrby == null) {
                arrby = this.h();
                continue;
            }
            arrby = e.a.a.a.a(arrby, this.h());
        }
        if (arrby == null) {
            return null;
        }
        return new n(arrby, this.g);
    }

    public n c() {
        byte[] arrby = null;
        while (!this.b(false, false)) {
            if (arrby == null) {
                arrby = this.h();
                continue;
            }
            arrby = e.a.a.a.a(arrby, this.h());
        }
        if (arrby == null) {
            return null;
        }
        return new n(arrby, this.g);
    }

    public boolean d() {
        return this.b(false, false);
    }

    public void e() {
        this.t.b();
        this.w.a();
        this.v.a();
        this.y.b();
        this.u.a();
        if (this.f != null) {
            try {
                this.f.close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        this.t = null;
        this.w = null;
        this.v = null;
        this.y = null;
        this.u = null;
        this.f = null;
    }

    public AudioFormat f() {
        return this.g;
    }

    private boolean g() {
        this.m = this.u.a(this.k);
        int n2 = this.f.read(this.u.a, this.m, this.k);
        if (n2 < 0) {
            n2 = 0;
        }
        this.u.b(n2);
        if (this.u.b(this.s) != 1) {
            if (n2 < this.k) {
                return true;
            }
            this.a("Ogg header not recognized in method 'readHeader'.");
            return false;
        }
        this.t.a(this.s.f());
        this.y.a();
        this.x.a();
        if (this.t.a(this.s) < 0) {
            this.a("Problem with first Ogg header page in method 'readHeader'.");
            return false;
        }
        if (this.t.b(this.r) != 1) {
            this.a("Problem with first Ogg header packet in method 'readHeader'.");
            return false;
        }
        if (this.y.a(this.x, this.r) < 0) {
            this.a("File does not contain Vorbis header in method 'readHeader'.");
            return false;
        }
        int n3 = 0;
        while (n3 < 2) {
            int n4;
            while (n3 < 2 && (n4 = this.u.b(this.s)) != 0) {
                if (n4 != 1) continue;
                this.t.a(this.s);
                while (n3 < 2 && (n4 = this.t.b(this.r)) != 0) {
                    if (n4 == -1) {
                        this.a("Secondary Ogg header corrupt in method 'readHeader'.");
                        return false;
                    }
                    this.y.a(this.x, this.r);
                    ++n3;
                }
            }
            this.m = this.u.a(this.k);
            n2 = this.f.read(this.u.a, this.m, this.k);
            if (n2 < 0) {
                n2 = 0;
            }
            if (n2 == 0 && n3 < 2) {
                this.a("End of file reached before finished readingOgg header in method 'readHeader'");
                return false;
            }
            this.u.b(n2);
        }
        this.m = this.u.a(this.k);
        this.j = this.u.a;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private byte[] h() {
        if (!this.a(false, false)) {
            return null;
        }
        if (this.b(false, false)) {
            return null;
        }
        if (this.o == null) {
            this.o = new byte[this.n];
        }
        var1_1 = null;
        switch (this.u.b(this.s)) {
            case -1: 
            case 0: {
                break;
            }
            default: {
                this.t.a(this.s);
                if (this.s.e() == 0L) {
                    this.b(true, true);
                    return null;
                }
                block9: while (true) {
                    switch (this.t.b(this.r)) {
                        case 0: {
                            break block9;
                        }
                        case -1: {
                            continue block9;
                        }
                        default: {
                            if (this.w.a(this.r) == 0) {
                                this.v.a(this.w);
                            }
                            while (true) {
                                if ((var3_3 = this.v.a(this.p, this.q)) > 0) ** break;
                                continue block9;
                                var2_2 = this.p[0];
                                var4_4 = var3_3 < this.n ? var3_3 : this.n;
                                for (var8_8 = 0; var8_8 < this.y.b; ++var8_8) {
                                    var5_5 = var8_8 * 2;
                                    var6_6 = this.q[var8_8];
                                    for (var9_9 = 0; var9_9 < var4_4; var5_5 += 2 * this.y.b, ++var9_9) {
                                        var7_7 = (int)((double)var2_2[var8_8][var6_6 + var9_9] * 32767.0);
                                        if (var7_7 > 32767) {
                                            var7_7 = 32767;
                                        }
                                        if (var7_7 < -32768) {
                                            var7_7 = -32768;
                                        }
                                        if (var7_7 < 0) {
                                            var7_7 |= 32768;
                                        }
                                        this.o[var5_5] = (byte)var7_7;
                                        this.o[var5_5 + 1] = (byte)(var7_7 >>> 8);
                                    }
                                }
                                this.v.a(var4_4);
                                var1_1 = e.a.a.a.a(var1_1, this.o, 2 * this.y.b * var4_4);
                            }
                        }
                    }
                    break;
                }
                if (this.s.d() == 0) break;
                this.b(true, true);
            }
        }
        if (this.b(false, false) != false) return var1_1;
        this.m = this.u.a(this.k);
        this.j = this.u.a;
        try {
            this.l = this.f.read(this.j, this.m, this.k);
        }
        catch (Exception var10_10) {
            this.a(var10_10);
            return null;
        }
        if (this.l == -1) {
            return var1_1;
        }
        this.u.b(this.l);
        if (this.l != 0) return var1_1;
        this.b(true, true);
        return var1_1;
    }

    private synchronized boolean a(boolean bl2, boolean bl3) {
        if (bl2) {
            this.i = bl3;
        }
        return this.i;
    }

    private synchronized boolean b(boolean bl2, boolean bl3) {
        if (bl2) {
            this.h = bl3;
        }
        return this.h;
    }

    private static byte[] a(byte[] arrby, int n2) {
        byte[] arrby2 = null;
        if (arrby != null && arrby.length > n2) {
            arrby2 = new byte[n2];
            System.arraycopy(arrby, 0, arrby2, 0, n2);
        }
        return arrby2;
    }

    private static byte[] a(byte[] arrby, byte[] arrby2, int n2) {
        byte[] arrby3;
        int n3 = n2;
        if (arrby2 == null || arrby2.length == 0) {
            n3 = 0;
        } else if (arrby2.length < n2) {
            n3 = arrby2.length;
        }
        if (arrby == null && (arrby2 == null || n3 <= 0)) {
            return null;
        }
        if (arrby == null) {
            arrby3 = new byte[n3];
            System.arraycopy(arrby2, 0, arrby3, 0, n3);
            arrby2 = null;
        } else if (arrby2 == null || n3 <= 0) {
            arrby3 = new byte[arrby.length];
            System.arraycopy(arrby, 0, arrby3, 0, arrby.length);
            arrby = null;
        } else {
            arrby3 = new byte[arrby.length + n3];
            System.arraycopy(arrby, 0, arrby3, 0, arrby.length);
            System.arraycopy(arrby2, 0, arrby3, arrby.length, n3);
            arrby = null;
            arrby2 = null;
        }
        return arrby3;
    }

    private static byte[] a(byte[] arrby, byte[] arrby2) {
        byte[] arrby3;
        if (arrby == null && arrby2 == null) {
            return null;
        }
        if (arrby == null) {
            arrby3 = new byte[arrby2.length];
            System.arraycopy(arrby2, 0, arrby3, 0, arrby2.length);
            arrby2 = null;
        } else if (arrby2 == null) {
            arrby3 = new byte[arrby.length];
            System.arraycopy(arrby, 0, arrby3, 0, arrby.length);
            arrby = null;
        } else {
            arrby3 = new byte[arrby.length + arrby2.length];
            System.arraycopy(arrby, 0, arrby3, 0, arrby.length);
            System.arraycopy(arrby2, 0, arrby3, arrby.length, arrby2.length);
            arrby = null;
            arrby2 = null;
        }
        return arrby3;
    }

    private void a(String string) {
        this.z.a("CodecJOrbis", string, 0);
    }

    private void a(Exception exception) {
        this.z.a(exception, 1);
    }
}

