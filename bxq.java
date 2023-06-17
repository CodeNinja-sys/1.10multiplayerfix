/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.d.mq;

public class bxq
implements baa {
    final Iterable c;

    public bxq(Iterable iterable) {
        this.c = iterable;
    }

    @Override
    public cm a(bkp bkp2) {
        return cn.b(mq.a(this.c, new ca(this, bkp2)));
    }
}

