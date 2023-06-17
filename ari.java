/*
 * Decompiled with CFR 0.150.
 */
import java.nio.ByteBuffer;
import java.util.List;

public class ari {
    public void a(bix bix2) {
        if (bix2.h() > 0) {
            int n2;
            Object object;
            int n3;
            ava ava2 = bix2.g();
            int n4 = ava2.g();
            ByteBuffer byteBuffer = bix2.f();
            List list = ava2.h();
            block12: for (n3 = 0; n3 < list.size(); ++n3) {
                ctq ctq2 = (ctq)list.get(n3);
                object = ctq2.b();
                int n5 = ctq2.a().c();
                n2 = ctq2.d();
                byteBuffer.position(ava2.d(n3));
                switch (bjf.a[((Enum)object).ordinal()]) {
                    case 1: {
                        cja.b(ctq2.c(), n5, n4, byteBuffer);
                        cja.n(32884);
                        continue block12;
                    }
                    case 2: {
                        cjg.l(cjg.q + n2);
                        cja.a(ctq2.c(), n5, n4, byteBuffer);
                        cja.n(32888);
                        cjg.l(cjg.q);
                        continue block12;
                    }
                    case 3: {
                        cja.c(ctq2.c(), n5, n4, byteBuffer);
                        cja.n(32886);
                        continue block12;
                    }
                    case 4: {
                        cja.a(n5, n4, byteBuffer);
                        cja.n(32885);
                    }
                }
            }
            cja.d(bix2.i(), 0, bix2.h());
            int n6 = list.size();
            block13: for (n3 = 0; n3 < n6; ++n3) {
                object = (ctq)list.get(n3);
                ui ui2 = ((ctq)object).b();
                n2 = ((ctq)object).d();
                switch (ui2) {
                    case a: {
                        cja.m(32884);
                        continue block13;
                    }
                    case d: {
                        cjg.l(cjg.q + n2);
                        cja.m(32888);
                        cjg.l(cjg.q);
                        continue block13;
                    }
                    case c: {
                        cja.m(32886);
                        cja.F();
                        continue block13;
                    }
                    case b: {
                        cja.m(32885);
                    }
                }
            }
        }
        bix2.b();
    }
}

