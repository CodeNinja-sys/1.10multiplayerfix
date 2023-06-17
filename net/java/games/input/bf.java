/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.List;
import net.java.games.a.a.a;
import net.java.games.input.LinuxEventDevice;
import net.java.games.input.LinuxJoystickDevice;
import net.java.games.input.au;
import net.java.games.input.aw;
import net.java.games.input.ay;
import net.java.games.input.az;
import net.java.games.input.bd;
import net.java.games.input.be;
import net.java.games.input.bg;
import net.java.games.input.bh;
import net.java.games.input.bi;
import net.java.games.input.bj;
import net.java.games.input.bk;
import net.java.games.input.bl;
import net.java.games.input.bm;
import net.java.games.input.bo;
import net.java.games.input.bq;
import net.java.games.input.bw;
import net.java.games.input.bx;
import net.java.games.input.by;
import net.java.games.input.bz;
import net.java.games.input.ca;
import net.java.games.input.cb;
import net.java.games.input.cc;
import net.java.games.input.cd;
import net.java.games.input.cf;
import net.java.games.input.dj;
import net.java.games.input.h;
import net.java.games.input.k;
import net.java.games.input.l;
import net.java.games.input.m;
import net.java.games.input.n;
import net.java.games.input.q;
import net.java.games.input.s;
import net.java.games.input.t;

public final class bf
extends t
implements a {
    private static final String d = "jinput-linux";
    private static final String e = "64";
    private static boolean f = false;
    private final q[] g;
    private final List h = new ArrayList();
    private static final be i = new be();

    static void d(String string) {
        AccessController.doPrivileged(new bg(string));
    }

    static String e(String string) {
        return (String)AccessController.doPrivileged(new bh(string));
    }

    static String a(String string, String string2) {
        return (String)AccessController.doPrivileged(new bi(string, string2));
    }

    public static final Object a(bd bd2) {
        return i.a(bd2);
    }

    public bf() {
        if (this.b()) {
            this.g = this.d();
            bf.a("Linux plugin claims to have found " + this.g.length + " controllers");
            AccessController.doPrivileged(new bj(this));
        } else {
            this.g = new q[0];
        }
    }

    public final q[] a() {
        return this.g;
    }

    private static final k[] a(List list, LinuxEventDevice linuxEventDevice) {
        Object object;
        bq bq2;
        int n2;
        bq[][] arrbq = new bq[4][2];
        ArrayList<az> arrayList = new ArrayList<az>();
        for (n2 = 0; n2 < list.size(); ++n2) {
            bq2 = (bq)list.get(n2);
            object = bq2.c();
            if (object == m.C) {
                int n3 = bq2.d().b();
                switch (n3) {
                    case 16: {
                        arrbq[0][0] = bq2;
                        break;
                    }
                    case 17: {
                        arrbq[0][1] = bq2;
                        break;
                    }
                    case 18: {
                        arrbq[1][0] = bq2;
                        break;
                    }
                    case 19: {
                        arrbq[1][1] = bq2;
                        break;
                    }
                    case 20: {
                        arrbq[2][0] = bq2;
                        break;
                    }
                    case 21: {
                        arrbq[2][1] = bq2;
                        break;
                    }
                    case 22: {
                        arrbq[3][0] = bq2;
                        break;
                    }
                    case 23: {
                        arrbq[3][1] = bq2;
                        break;
                    }
                    default: {
                        bf.a("Unknown POV instance: " + n3);
                        break;
                    }
                }
                continue;
            }
            if (object == null) continue;
            az az2 = new az(bq2);
            arrayList.add(az2);
            linuxEventDevice.a(bq2.d(), az2);
        }
        for (n2 = 0; n2 < arrbq.length; ++n2) {
            bq2 = arrbq[n2][0];
            object = arrbq[n2][1];
            if (bq2 == null || object == null) continue;
            cd cd2 = new cd(bq2, (bq)object);
            arrayList.add(cd2);
            linuxEventDevice.a(bq2.d(), cd2);
            linuxEventDevice.a(((bq)object).d(), cd2);
        }
        k[] arrk = new k[arrayList.size()];
        arrayList.toArray(arrk);
        return arrk;
    }

    private static final cf a(LinuxEventDevice linuxEventDevice, k[] arrk) {
        cb cb2 = new cb(linuxEventDevice, arrk, new q[0], linuxEventDevice.c());
        if (cb2.k() != null && cb2.l() != null && cb2.n() != null) {
            return cb2;
        }
        return null;
    }

    private static final au b(LinuxEventDevice linuxEventDevice, k[] arrk) {
        ca ca2 = new ca(linuxEventDevice, arrk, new q[0], linuxEventDevice.c());
        return ca2;
    }

    private static final q a(LinuxEventDevice linuxEventDevice, k[] arrk, s s2) {
        aw aw2 = new aw(linuxEventDevice, arrk, new q[0], linuxEventDevice.c(), s2);
        return aw2;
    }

    private static final q a(LinuxEventDevice linuxEventDevice) {
        List list = linuxEventDevice.g();
        k[] arrk = bf.a(list, linuxEventDevice);
        s s2 = linuxEventDevice.b();
        if (s2 == s.b) {
            return bf.a(linuxEventDevice, arrk);
        }
        if (s2 == s.c) {
            return bf.b(linuxEventDevice, arrk);
        }
        if (s2 == s.h || s2 == s.e) {
            return bf.a(linuxEventDevice, arrk, s2);
        }
        return null;
    }

    private final q[] d() {
        ArrayList<ay> arrayList = new ArrayList<ay>();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.b(arrayList2);
        this.a(arrayList3);
        block0: for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            for (int i3 = 0; i3 < arrayList3.size(); ++i3) {
                k[] arrk;
                k[] arrk2;
                q q2 = (q)arrayList2.get(i2);
                q q3 = (q)arrayList3.get(i3);
                if (!q2.g().equals(q3.g()) || (arrk2 = q2.c()).length != (arrk = q3.c()).length) continue;
                boolean bl2 = false;
                for (int i4 = 0; i4 < arrk2.length; ++i4) {
                    if (arrk2[i4].d() == arrk[i4].d()) continue;
                    bl2 = true;
                }
                if (bl2) continue;
                arrayList.add(new ay((aw)arrayList2.remove(i2), (bw)arrayList3.remove(i3)));
                --i2;
                --i3;
                continue block0;
            }
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(arrayList3);
        q[] arrq = new q[arrayList.size()];
        arrayList.toArray(arrq);
        return arrq;
    }

    private static final n a(int n2) {
        switch (n2) {
            case 0: {
                return n.a;
            }
            case 1: {
                return n.b;
            }
            case 2: {
                return n.c;
            }
            case 3: {
                return n.d;
            }
            case 4: {
                return n.e;
            }
            case 5: {
                return n.f;
            }
            case 6: {
                return n.g;
            }
            case 7: {
                return n.h;
            }
            case 8: {
                return n.i;
            }
            case 9: {
                return n.j;
            }
            case 10: {
                return n.k;
            }
            case 11: {
                return n.l;
            }
            case 12: {
                return n.m;
            }
            case 13: {
                return n.n;
            }
            case 14: {
                return n.o;
            }
            case 15: {
                return n.p;
            }
            case 16: {
                return n.q;
            }
            case 17: {
                return n.r;
            }
            case 18: {
                return n.s;
            }
            case 19: {
                return n.t;
            }
            case 20: {
                return n.u;
            }
            case 21: {
                return n.v;
            }
            case 22: {
                return n.w;
            }
            case 23: {
                return n.x;
            }
            case 24: {
                return n.y;
            }
            case 25: {
                return n.z;
            }
            case 26: {
                return n.A;
            }
            case 27: {
                return n.B;
            }
            case 28: {
                return n.C;
            }
            case 29: {
                return n.D;
            }
            case 30: {
                return n.E;
            }
            case 31: {
                return n.F;
            }
        }
        return null;
    }

    private static final q a(LinuxJoystickDevice linuxJoystickDevice) {
        h h2;
        l l2;
        int n2;
        ArrayList<by> arrayList = new ArrayList<by>();
        byte[] arrby = linuxJoystickDevice.e();
        char[] arrc = linuxJoystickDevice.f();
        bx[] arrbx = new bx[6];
        for (n2 = 0; n2 < linuxJoystickDevice.d(); ++n2) {
            l2 = cc.e(arrc[n2]);
            if (l2 == null) continue;
            h2 = new by(l2);
            linuxJoystickDevice.a(n2, (by)h2);
            arrayList.add((by)h2);
        }
        for (n2 = 0; n2 < linuxJoystickDevice.c(); ++n2) {
            l2 = (m)cc.d(arrby[n2]);
            h2 = new bx((m)l2);
            linuxJoystickDevice.a(n2, (bx)h2);
            if (arrby[n2] == 16) {
                arrbx[0] = h2;
                continue;
            }
            if (arrby[n2] == 17) {
                arrbx[1] = h2;
                h2 = new bz(m.C, arrbx[0], arrbx[1]);
                linuxJoystickDevice.a((bz)h2);
                arrayList.add((by)h2);
                continue;
            }
            if (arrby[n2] == 18) {
                arrbx[2] = h2;
                continue;
            }
            if (arrby[n2] == 19) {
                arrbx[3] = h2;
                h2 = new bz(m.C, arrbx[2], arrbx[3]);
                linuxJoystickDevice.a((bz)h2);
                arrayList.add((by)h2);
                continue;
            }
            if (arrby[n2] == 20) {
                arrbx[4] = h2;
                continue;
            }
            if (arrby[n2] == 21) {
                arrbx[5] = h2;
                h2 = new bz(m.C, arrbx[4], arrbx[5]);
                linuxJoystickDevice.a((bz)h2);
                arrayList.add((by)h2);
                continue;
            }
            arrayList.add((by)h2);
        }
        return new bw(linuxJoystickDevice, arrayList.toArray(new k[0]), new q[0], new dj[0]);
    }

    private final void a(List list) {
        File[] arrfile = bf.f("/dev/input");
        if ((arrfile == null || arrfile.length == 0) && (arrfile = bf.f("/dev")) == null) {
            return;
        }
        for (int i2 = 0; i2 < arrfile.length; ++i2) {
            File file = arrfile[i2];
            try {
                String string = bf.a(file);
                LinuxJoystickDevice linuxJoystickDevice = new LinuxJoystickDevice(string);
                q q2 = bf.a(linuxJoystickDevice);
                if (q2 != null) {
                    list.add(q2);
                    this.h.add(linuxJoystickDevice);
                    continue;
                }
                linuxJoystickDevice.a();
                continue;
            }
            catch (IOException iOException) {
                bf.a("Failed to open device (" + file + "): " + iOException.getMessage());
            }
        }
    }

    private static final File[] f(String string) {
        File file = new File(string);
        return bf.a(file, new bk());
    }

    private static String a(File file) {
        return (String)AccessController.doPrivileged(new bl(file));
    }

    private static File[] a(File file, FilenameFilter filenameFilter) {
        return (File[])AccessController.doPrivileged(new bm(file, filenameFilter));
    }

    private final void b(List list) {
        File file = new File("/dev/input");
        File[] arrfile = bf.a(file, new bo(this));
        if (arrfile == null) {
            return;
        }
        for (int i2 = 0; i2 < arrfile.length; ++i2) {
            File file2 = arrfile[i2];
            try {
                String string = bf.a(file2);
                LinuxEventDevice linuxEventDevice = new LinuxEventDevice(string);
                try {
                    q q2 = bf.a(linuxEventDevice);
                    if (q2 != null) {
                        list.add(q2);
                        this.h.add(linuxEventDevice);
                        continue;
                    }
                    linuxEventDevice.a();
                }
                catch (IOException iOException) {
                    bf.a("Failed to create Controller: " + iOException.getMessage());
                    linuxEventDevice.a();
                }
                continue;
            }
            catch (IOException iOException) {
                bf.a("Failed to open device (" + file2 + "): " + iOException.getMessage());
            }
        }
    }

    public boolean b() {
        return f;
    }

    static boolean a(boolean bl2) {
        f = bl2;
        return f;
    }

    static List a(bf bf2) {
        return bf2.h;
    }

    static {
        String string = bf.a("os.name", "").trim();
        if (string.equals("Linux")) {
            f = true;
            if ("i386".equals(bf.e("os.arch"))) {
                bf.d(d);
            } else {
                bf.d("jinput-linux64");
            }
        }
    }
}

