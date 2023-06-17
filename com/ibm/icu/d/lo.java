/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.b.b;
import com.ibm.icu.d.lf;
import com.ibm.icu.d.lh;
import com.ibm.icu.util.VersionInfo;

class lo
implements lh {
    VersionInfo a;

    lo(VersionInfo versionInfo) {
        this.a = versionInfo;
    }

    public boolean a(int n2) {
        VersionInfo versionInfo = b.P(n2);
        return versionInfo != lf.p() && versionInfo.a(this.a) <= 0;
    }
}

