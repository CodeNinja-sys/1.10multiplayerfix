/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.am;
import java.net.URL;
import java.security.PrivilegedAction;

final class an
implements PrivilegedAction {
    final /* synthetic */ String a;

    an(String string) {
        this.a = string;
    }

    public URL a() {
        return am.class.getResource(this.a);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

