/*
 * Decompiled with CFR 0.150.
 */
package com.b.b;

import com.b.b.ap;
import com.b.b.e;
import com.b.b.v;

class b {
    b() {
    }

    public static void a(String[] arrstring) {
        ap ap2 = null;
        try {
            ap2 = arrstring.length > 0 ? new ap(arrstring[0]) : new ap(System.in, null, -1);
        }
        catch (Exception exception) {
            System.err.println(exception);
            return;
        }
        if (ap2.f()) {
            System.out.println("Input bitstream contained " + ap2.e() + " logical bitstream section(s).");
            System.out.println("Total bitstream playing time: " + ap2.f(-1) + " seconds\n");
        } else {
            System.out.println("Standard input was not seekable.");
            System.out.println("First logical bitstream information:\n");
        }
        for (int i2 = 0; i2 < ap2.e(); ++i2) {
            v v2 = ap2.h(i2);
            System.out.println("\tlogical bitstream section " + (i2 + 1) + " information:");
            System.out.println("\t\t" + v2.c + "Hz " + v2.b + " channels bitrate " + ap2.b(i2) / 1000 + "kbps serial number=" + ap2.c(i2));
            System.out.print("\t\tcompressed length: " + ap2.d(i2) + " bytes ");
            System.out.println(" play time: " + ap2.f(i2) + "s");
            e e2 = ap2.i(i2);
            System.out.println(e2);
        }
    }
}

