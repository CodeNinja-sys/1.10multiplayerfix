/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.d.mq;

public class bzx
implements baa {
    private final Iterable c;

    public bzx(Iterable iterable) {
        this.c = iterable;
    }

    @Override
    public cm a(bkp bkp2) {
        return cn.a(mq.a(this.c, new bmf(this, bkp2)));
    }
}

