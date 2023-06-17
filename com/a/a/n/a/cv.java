/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.ch;
import com.a.a.n.a.ci;
import com.a.a.n.a.cw;
import com.a.a.n.a.dl;
import com.a.a.n.a.g;
import java.util.concurrent.Executor;

class cv
extends g {
    private volatile dl a;

    cv(dl dl2, ch ch2, Executor executor) {
        this.a = dl2;
        ci.a(this.a, new cw(this, ch2), executor);
    }

    @Override
    public boolean cancel(boolean bl2) {
        if (super.cancel(bl2)) {
            this.a.cancel(bl2);
            return true;
        }
        return false;
    }

    static /* synthetic */ dl a(cv cv2, dl dl2) {
        cv2.a = dl2;
        return cv2.a;
    }

    static /* synthetic */ dl a(cv cv2) {
        return cv2.a;
    }
}

