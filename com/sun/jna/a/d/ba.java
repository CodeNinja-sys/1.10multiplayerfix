/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.aw;
import com.sun.jna.a.d.ax;
import com.sun.jna.a.d.bc;
import com.sun.jna.a.d.be;
import com.sun.jna.a.d.gi;
import com.sun.jna.at;
import com.sun.jna.bd;

public class ba
extends bd {
    public at a;
    public int b;
    public gi c;
    public bc F;

    public void j() {
        super.j();
        switch (this.b) {
            case 0: 
            case 1: {
                this.F.b(be.class);
                break;
            }
            case 2: {
                this.F.b(ax.class);
                break;
            }
            default: {
                this.F.b(aw.class);
            }
        }
        this.F.j();
    }
}

