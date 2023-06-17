/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.do;
import com.sun.jna.a.d.dq;
import java.io.IOException;

class dp
extends Thread {
    final /* synthetic */ do a;

    dp(do do_, String string) {
        this.a = do_;
        super(string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        while (true) {
            dq dq2;
            if ((dq2 = do.a(this.a)) == null) {
                do do_ = this.a;
                synchronized (do_) {
                    if (do.b(this.a).isEmpty()) {
                        do.a(this.a, null);
                        break;
                    }
                }
            }
            try {
                do.a(this.a, dq2);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }
}

