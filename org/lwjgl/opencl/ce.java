/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.util.Map;
import org.lwjgl.d;
import org.lwjgl.k;
import org.lwjgl.opencl.APPLEGLSharing;
import org.lwjgl.opencl.CL10;
import org.lwjgl.opencl.CL11;
import org.lwjgl.opencl.EXTDeviceFission;
import org.lwjgl.opencl.KHRGLSharing;
import org.lwjgl.opencl.KHRICD;
import org.lwjgl.opencl.cd;
import org.lwjgl.opencl.cf;

public final class ce {
    private static final Map a = d.a((k)new cf(), null, CL10.class, CL11.class, KHRGLSharing.class, KHRICD.class, APPLEGLSharing.class, EXTDeviceFission.class);

    private ce() {
    }

    public static void a(int n2) {
        if (n2 != 0) {
            ce.b(n2);
        }
    }

    private static void b(int n2) {
        String string = (String)a.get(n2);
        if (string == null) {
            string = "UNKNOWN";
        }
        throw new cd("Error Code: " + string + " (" + d.a(n2) + ")");
    }
}

