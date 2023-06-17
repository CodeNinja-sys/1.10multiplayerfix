/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.tukaani.xz.ARMOptions
 *  org.tukaani.xz.ARMThumbOptions
 *  org.tukaani.xz.FilterOptions
 *  org.tukaani.xz.IA64Options
 *  org.tukaani.xz.PowerPCOptions
 *  org.tukaani.xz.SPARCOptions
 *  org.tukaani.xz.X86Options
 */
package org.apache.commons.compress.archivers.f;

import java.util.HashMap;
import org.apache.commons.compress.archivers.f.a;
import org.apache.commons.compress.archivers.f.j;
import org.apache.commons.compress.archivers.f.l;
import org.apache.commons.compress.archivers.f.m;
import org.apache.commons.compress.archivers.f.n;
import org.apache.commons.compress.archivers.f.p;
import org.apache.commons.compress.archivers.f.q;
import org.apache.commons.compress.archivers.f.s;
import org.apache.commons.compress.archivers.f.w;
import org.tukaani.xz.ARMOptions;
import org.tukaani.xz.ARMThumbOptions;
import org.tukaani.xz.FilterOptions;
import org.tukaani.xz.IA64Options;
import org.tukaani.xz.PowerPCOptions;
import org.tukaani.xz.SPARCOptions;
import org.tukaani.xz.X86Options;

final class i
extends HashMap {
    private static final long a = 1664829131806520867L;

    i() {
        this.put(w.a, new m());
        this.put(w.b, new p());
        this.put(w.c, new s());
        this.put(w.d, new n());
        this.put(w.e, new l());
        this.put(w.f, new a());
        this.put(w.g, new j((FilterOptions)new X86Options()));
        this.put(w.h, new j((FilterOptions)new PowerPCOptions()));
        this.put(w.i, new j((FilterOptions)new IA64Options()));
        this.put(w.j, new j((FilterOptions)new ARMOptions()));
        this.put(w.k, new j((FilterOptions)new ARMThumbOptions()));
        this.put(w.l, new j((FilterOptions)new SPARCOptions()));
        this.put(w.m, new q());
    }
}

