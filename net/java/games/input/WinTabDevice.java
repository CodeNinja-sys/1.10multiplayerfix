/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.util.ArrayList;
import java.util.List;
import net.java.games.input.WinTabContext;
import net.java.games.input.WinTabPacket;
import net.java.games.input.ar;
import net.java.games.input.dj;
import net.java.games.input.dq;
import net.java.games.input.ds;
import net.java.games.input.i;
import net.java.games.input.k;
import net.java.games.input.q;
import net.java.games.input.s;

public class WinTabDevice
extends i {
    private WinTabContext a;
    private List c = new ArrayList();

    private WinTabDevice(WinTabContext winTabContext, int n2, String string, k[] arrk) {
        super(string, arrk, new q[0], new dj[0]);
        this.a = winTabContext;
    }

    protected boolean a(ar ar2) {
        if (this.c.size() > 0) {
            ar ar3 = (ar)this.c.remove(0);
            ar2.a(ar3);
            return true;
        }
        return false;
    }

    protected void a() {
        this.a.d();
        super.a();
    }

    public s h() {
        return s.j;
    }

    public void a(WinTabPacket winTabPacket) {
        k[] arrk = this.c();
        for (int i2 = 0; i2 < arrk.length; ++i2) {
            ar ar2 = ((dq)arrk[i2]).a(winTabPacket);
            if (ar2 == null) continue;
            this.c.add(ar2);
        }
    }

    public static WinTabDevice a(WinTabContext winTabContext, int n2) {
        int n3;
        String string = WinTabDevice.nGetName(n2);
        ds.a("Device " + n2 + ", name: " + string);
        ArrayList arrayList = new ArrayList();
        int[] arrn = WinTabDevice.nGetAxisDetails(n2, 1);
        if (arrn.length == 0) {
            ds.a("ZAxis not supported");
        } else {
            ds.a("Xmin: " + arrn[0] + ", Xmax: " + arrn[1]);
            arrayList.addAll(dq.a(winTabContext, n2, 1, arrn));
        }
        arrn = WinTabDevice.nGetAxisDetails(n2, 2);
        if (arrn.length == 0) {
            ds.a("YAxis not supported");
        } else {
            ds.a("Ymin: " + arrn[0] + ", Ymax: " + arrn[1]);
            arrayList.addAll(dq.a(winTabContext, n2, 2, arrn));
        }
        arrn = WinTabDevice.nGetAxisDetails(n2, 3);
        if (arrn.length == 0) {
            ds.a("ZAxis not supported");
        } else {
            ds.a("Zmin: " + arrn[0] + ", Zmax: " + arrn[1]);
            arrayList.addAll(dq.a(winTabContext, n2, 3, arrn));
        }
        arrn = WinTabDevice.nGetAxisDetails(n2, 4);
        if (arrn.length == 0) {
            ds.a("NPressureAxis not supported");
        } else {
            ds.a("NPressMin: " + arrn[0] + ", NPressMax: " + arrn[1]);
            arrayList.addAll(dq.a(winTabContext, n2, 4, arrn));
        }
        arrn = WinTabDevice.nGetAxisDetails(n2, 5);
        if (arrn.length == 0) {
            ds.a("TPressureAxis not supported");
        } else {
            ds.a("TPressureAxismin: " + arrn[0] + ", TPressureAxismax: " + arrn[1]);
            arrayList.addAll(dq.a(winTabContext, n2, 5, arrn));
        }
        arrn = WinTabDevice.nGetAxisDetails(n2, 6);
        if (arrn.length == 0) {
            ds.a("OrientationAxis not supported");
        } else {
            ds.a("OrientationAxis mins/maxs: " + arrn[0] + "," + arrn[1] + ", " + arrn[2] + "," + arrn[3] + ", " + arrn[4] + "," + arrn[5]);
            arrayList.addAll(dq.a(winTabContext, n2, 6, arrn));
        }
        arrn = WinTabDevice.nGetAxisDetails(n2, 7);
        if (arrn.length == 0) {
            ds.a("RotationAxis not supported");
        } else {
            ds.a("RotationAxis is supported (by the device, not by this plugin)");
            arrayList.addAll(dq.a(winTabContext, n2, 7, arrn));
        }
        String[] arrstring = WinTabDevice.nGetCursorNames(n2);
        arrayList.addAll(dq.a(winTabContext, n2, arrstring));
        for (n3 = 0; n3 < arrstring.length; ++n3) {
            ds.a("Cursor " + n3 + "'s name: " + arrstring[n3]);
        }
        n3 = WinTabDevice.nGetMaxButtonCount(n2);
        ds.a("Device has " + n3 + " buttons");
        arrayList.addAll(dq.a(winTabContext, n2, n3));
        k[] arrk = arrayList.toArray(new k[0]);
        return new WinTabDevice(winTabContext, n2, string, arrk);
    }

    private static final native String nGetName(int var0);

    private static final native int[] nGetAxisDetails(int var0, int var1);

    private static final native String[] nGetCursorNames(int var0);

    private static final native int nGetMaxButtonCount(int var0);
}

