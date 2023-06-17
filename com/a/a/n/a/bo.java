/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.bd;
import com.a.a.n.a.bm;
import com.a.a.n.a.br;
import java.util.logging.Level;

final class bo
extends bm {
    @Override
    public void a(br br2) {
        bd.a().log(Level.SEVERE, "Detected potential deadlock", br2);
    }
}

