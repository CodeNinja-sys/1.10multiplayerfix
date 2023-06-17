/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.ad;
import com.sun.jna.a.d.ck;
import com.sun.jna.a.d.cn;
import com.sun.jna.a.e;
import com.sun.jna.bw;
import java.io.File;
import java.io.IOException;

public class dr
extends e {
    public boolean a() {
        return true;
    }

    public void a(File[] arrfile) {
        int n2;
        ck ck2 = ck.g;
        cn cn2 = new cn();
        cn2.b = 3;
        String[] arrstring = new String[arrfile.length];
        for (n2 = 0; n2 < arrstring.length; ++n2) {
            arrstring[n2] = arrfile[n2].getAbsolutePath();
        }
        cn2.c = new bw(cn2.b(arrstring));
        cn2.G = (short)1620;
        n2 = ck2.a(cn2);
        if (n2 != 0) {
            throw new IOException("Move to trash failed: " + cn2.c + ": " + ad.a(n2));
        }
        if (cn2.H) {
            throw new IOException("Move to trash aborted");
        }
    }
}

