/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.eo;
import com.a.a.n.a.ep;
import java.util.logging.Level;

class eq
implements Runnable {
    final /* synthetic */ eo a;

    private eq(eo eo2) {
        this.a = eo2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        block18: {
            Object object;
            boolean bl2 = true;
            block14: while (true) {
                while (true) {
                    cl.b(eo.a(this.a));
                    Object object2 = eo.b(this.a);
                    synchronized (object2) {
                        object = (Runnable)eo.c(this.a).poll();
                        if (object == null) {
                            eo.a(this.a, false);
                            bl2 = false;
                            break block18;
                        }
                    }
                    try {
                        object.run();
                        continue block14;
                    }
                    catch (RuntimeException runtimeException) {
                        eo.a().log(Level.SEVERE, "Exception while executing runnable " + object, runtimeException);
                        continue;
                    }
                    break;
                }
            }
            finally {
                if (bl2) {
                    object = eo.b(this.a);
                    synchronized (object) {
                        eo.a(this.a, false);
                    }
                }
            }
        }
    }

    /* synthetic */ eq(eo eo2, ep ep2) {
        this(eo2);
    }
}

