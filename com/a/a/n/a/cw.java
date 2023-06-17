/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.cg;
import com.a.a.n.a.ch;
import com.a.a.n.a.ci;
import com.a.a.n.a.cv;
import com.a.a.n.a.cx;
import com.a.a.n.a.du;
import java.util.concurrent.Executor;

class cw
implements cg {
    final /* synthetic */ ch a;
    final /* synthetic */ cv b;

    cw(cv cv2, ch ch2) {
        this.b = cv2;
        this.a = ch2;
    }

    @Override
    public void a(Object object) {
        this.b.a(object);
    }

    @Override
    public void a(Throwable throwable) {
        if (this.b.isCancelled()) {
            return;
        }
        try {
            cv.a(this.b, this.a.a(throwable));
            if (this.b.isCancelled()) {
                cv.a(this.b).cancel(this.b.b());
                return;
            }
            ci.a(cv.a(this.b), new cx(this), (Executor)du.a());
        }
        catch (Throwable throwable2) {
            this.b.a(throwable2);
        }
    }
}

