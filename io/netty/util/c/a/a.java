/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.aa;
import io.netty.util.c.a.ab;
import io.netty.util.c.a.ad;
import io.netty.util.c.a.af;
import io.netty.util.c.a.ag;
import io.netty.util.c.a.ah;
import io.netty.util.c.a.ai;
import io.netty.util.c.a.aj;
import io.netty.util.c.a.ak;
import io.netty.util.c.a.al;
import io.netty.util.c.a.am;
import io.netty.util.c.a.an;
import io.netty.util.c.a.ao;
import io.netty.util.c.a.ap;
import io.netty.util.c.a.aq;
import io.netty.util.c.a.ar;
import io.netty.util.c.a.as;
import io.netty.util.c.a.at;
import io.netty.util.c.a.au;
import io.netty.util.c.a.av;
import io.netty.util.c.a.aw;
import io.netty.util.c.a.ax;
import io.netty.util.c.a.ay;
import io.netty.util.c.a.az;
import io.netty.util.c.a.b;
import io.netty.util.c.a.ba;
import io.netty.util.c.a.bb;
import io.netty.util.c.a.bc;
import io.netty.util.c.a.bd;
import io.netty.util.c.a.be;
import io.netty.util.c.a.bf;
import io.netty.util.c.a.bg;
import io.netty.util.c.a.bh;
import io.netty.util.c.a.bi;
import io.netty.util.c.a.bj;
import io.netty.util.c.a.bk;
import io.netty.util.c.a.bl;
import io.netty.util.c.a.bm;
import io.netty.util.c.a.bn;
import io.netty.util.c.a.bo;
import io.netty.util.c.a.bq;
import io.netty.util.c.a.bt;
import io.netty.util.c.a.c;
import io.netty.util.c.a.e;
import io.netty.util.c.a.f;
import io.netty.util.c.a.j;
import io.netty.util.c.a.l;
import io.netty.util.c.a.n;
import io.netty.util.c.a.p;
import io.netty.util.c.a.q;
import io.netty.util.c.a.r;
import io.netty.util.c.a.s;
import io.netty.util.c.a.t;
import io.netty.util.c.a.u;
import io.netty.util.c.a.v;
import io.netty.util.c.a.w;
import io.netty.util.c.a.x;
import io.netty.util.c.a.y;
import io.netty.util.c.a.z;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;

public class a
implements Serializable,
ConcurrentMap {
    private static final long m = 7249069246763182397L;
    private static final int n = 0x40000000;
    private static final int o = 16;
    static final int a = 0x7FFFFFF7;
    private static final int p = 16;
    private static final float q = 0.75f;
    static final int b = 8;
    static final int c = 6;
    static final int d = 64;
    private static final int r = 16;
    static final int e = -1;
    static final int f = -2;
    static final int g = -3;
    static final int h = Integer.MAX_VALUE;
    static final int i = Runtime.getRuntime().availableProcessors();
    private static final ObjectStreamField[] s = new ObjectStreamField[]{new ObjectStreamField("segments", bk[].class), new ObjectStreamField("segmentMask", Integer.TYPE), new ObjectStreamField("segmentShift", Integer.TYPE)};
    volatile transient av[] j;
    private volatile transient av[] t;
    private volatile transient long u;
    private volatile transient int v;
    private volatile transient int w;
    private volatile transient int x;
    private volatile transient int y;
    private volatile transient j[] z;
    private transient ab A;
    private transient bq B;
    private transient n C;
    static final AtomicInteger k = new AtomicInteger();
    static final int l = 1640531527;
    private static final Unsafe D;
    private static final long E;
    private static final long F;
    private static final long G;
    private static final long H;
    private static final long I;
    private static final long J;
    private static final long K;
    private static final int L;

    static final int a(int n2) {
        return (n2 ^ n2 >>> 16) & Integer.MAX_VALUE;
    }

    private static final int c(int n2) {
        int n3 = n2 - 1;
        n3 |= n3 >>> 1;
        n3 |= n3 >>> 2;
        n3 |= n3 >>> 4;
        n3 |= n3 >>> 8;
        return (n3 |= n3 >>> 16) < 0 ? 1 : (n3 >= 0x40000000 ? 0x40000000 : n3 + 1);
    }

    static Class a(Object object) {
        if (object instanceof Comparable) {
            Class<?> class_ = object.getClass();
            if (class_ == String.class) {
                return class_;
            }
            Type[] arrtype = class_.getGenericInterfaces();
            if (arrtype != null) {
                for (int i2 = 0; i2 < arrtype.length; ++i2) {
                    Type[] arrtype2;
                    ParameterizedType parameterizedType;
                    Type type = arrtype[i2];
                    if (!(type instanceof ParameterizedType) || (parameterizedType = (ParameterizedType)type).getRawType() != Comparable.class || (arrtype2 = parameterizedType.getActualTypeArguments()) == null || arrtype2.length != 1 || arrtype2[0] != class_) continue;
                    return class_;
                }
            }
        }
        return null;
    }

    static int a(Class class_, Object object, Object object2) {
        return object2 == null || object2.getClass() != class_ ? 0 : ((Comparable)object).compareTo(object2);
    }

    static final av a(av[] arrav, int n2) {
        return (av)D.getObjectVolatile(arrav, ((long)n2 << L) + K);
    }

    static final boolean a(av[] arrav, int n2, av av2, av av3) {
        return D.compareAndSwapObject(arrav, ((long)n2 << L) + K, av2, av3);
    }

    static final void a(av[] arrav, int n2, av av2) {
        D.putObjectVolatile(arrav, ((long)n2 << L) + K, av2);
    }

    public a() {
    }

    public a(int n2) {
        int n3;
        if (n2 < 0) {
            throw new IllegalArgumentException();
        }
        this.v = n3 = n2 >= 0x20000000 ? 0x40000000 : io.netty.util.c.a.a.c(n2 + (n2 >>> 1) + 1);
    }

    public a(Map map) {
        this.v = 16;
        this.putAll(map);
    }

    public a(int n2, float f2) {
        this(n2, f2, 1);
    }

    public a(int n2, float f2, int n3) {
        long l2;
        int n4;
        if (!(f2 > 0.0f) || n2 < 0 || n3 <= 0) {
            throw new IllegalArgumentException();
        }
        if (n2 < n3) {
            n2 = n3;
        }
        this.v = n4 = (l2 = (long)(1.0 + (double)((float)n2 / f2))) >= 0x40000000L ? 0x40000000 : io.netty.util.c.a.a.c((int)l2);
    }

    @Override
    public int size() {
        long l2 = this.f();
        return l2 < 0L ? 0 : (l2 > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l2);
    }

    @Override
    public boolean isEmpty() {
        return this.f() <= 0L;
    }

    @Override
    public Object get(Object object) {
        av av2;
        int n2;
        int n3 = io.netty.util.c.a.a.a(object.hashCode());
        av[] arrav = this.j;
        if (this.j != null && (n2 = arrav.length) > 0 && (av2 = io.netty.util.c.a.a.a(arrav, n2 - 1 & n3)) != null) {
            Object object2;
            int n4 = av2.b;
            if (n4 == n3) {
                object2 = av2.c;
                if (object2 == object || object2 != null && object.equals(object2)) {
                    return av2.d;
                }
            } else if (n4 < 0) {
                av av3 = av2.a(n3, object);
                return av3 != null ? av3.d : null;
            }
            while ((av2 = av2.e) != null) {
                if (av2.b != n3 || (object2 = av2.c) != object && (object2 == null || !object.equals(object2))) continue;
                return av2.d;
            }
        }
        return null;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.get(object) != null;
    }

    @Override
    public boolean containsValue(Object object) {
        if (object == null) {
            throw new NullPointerException();
        }
        av[] arrav = this.j;
        if (this.j != null) {
            av av2;
            bl bl2 = new bl(arrav, arrav.length, 0, arrav.length);
            while ((av2 = bl2.c()) != null) {
                Object object2 = av2.d;
                if (object2 != object && (object2 == null || !object.equals(object2))) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public Object put(Object object, Object object2) {
        return this.a(object, object2, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final Object a(Object object, Object object2, boolean bl2) {
        int n2;
        block19: {
            Object object3;
            int n3;
            if (object == null || object2 == null) {
                throw new NullPointerException();
            }
            int n4 = io.netty.util.c.a.a.a(object.hashCode());
            n2 = 0;
            av[] arrav = this.j;
            while (true) {
                int n5;
                if (arrav == null || (n5 = arrav.length) == 0) {
                    arrav = this.h();
                    continue;
                }
                n3 = n5 - 1 & n4;
                av av2 = io.netty.util.c.a.a.a(arrav, n3);
                if (av2 == null) {
                    if (!io.netty.util.c.a.a.a(arrav, n3, null, new av(n4, object, object2, null))) continue;
                    break block19;
                }
                int n6 = av2.b;
                if (n6 == -1) {
                    arrav = this.a(arrav, av2);
                    continue;
                }
                object3 = null;
                av av3 = av2;
                synchronized (av3) {
                    block20: {
                        if (io.netty.util.c.a.a.a(arrav, n3) == av2) {
                            av av4;
                            if (n6 >= 0) {
                                n2 = 1;
                                av4 = av2;
                                while (true) {
                                    Object object4;
                                    if (av4.b == n4 && ((object4 = av4.c) == object || object4 != null && object.equals(object4))) {
                                        object3 = av4.d;
                                        if (!bl2) {
                                            av4.d = object2;
                                        }
                                        break block20;
                                    }
                                    av av5 = av4;
                                    av4 = av4.e;
                                    if (av4 == null) {
                                        av5.e = new av(n4, object, object2, null);
                                        break block20;
                                    }
                                    ++n2;
                                }
                            }
                            if (av2 instanceof bm) {
                                n2 = 2;
                                av4 = ((bm)av2).a(n4, object, object2);
                                if (av4 != null) {
                                    object3 = av4.d;
                                    if (!bl2) {
                                        av4.d = object2;
                                    }
                                }
                            }
                        }
                    }
                }
                if (n2 != 0) break;
            }
            if (n2 >= 8) {
                this.b(arrav, n3);
            }
            if (object3 != null) {
                return object3;
            }
        }
        this.a(1L, n2);
        return null;
    }

    @Override
    public void putAll(Map map) {
        this.d(map.size());
        for (Map.Entry entry : map.entrySet()) {
            this.a(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override
    public Object remove(Object object) {
        return this.a(object, (Object)null, (Object)null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final Object a(Object object, Object object2, Object object3) {
        int n2;
        av av2;
        int n3;
        int n4 = io.netty.util.c.a.a.a(object.hashCode());
        av[] arrav = this.j;
        while (arrav != null && (n3 = arrav.length) != 0 && (av2 = io.netty.util.c.a.a.a(arrav, n2 = n3 - 1 & n4)) != null) {
            int n5 = av2.b;
            if (n5 == -1) {
                arrav = this.a(arrav, av2);
                continue;
            }
            Object object4 = null;
            boolean bl2 = false;
            av av3 = av2;
            synchronized (av3) {
                if (io.netty.util.c.a.a.a(arrav, n2) == av2) {
                    Object object5;
                    Object object6;
                    av av4;
                    av av5;
                    if (n5 >= 0) {
                        bl2 = true;
                        av5 = av2;
                        av4 = null;
                        do {
                            if (av5.b == n4 && ((object6 = av5.c) == object || object6 != null && object.equals(object6))) {
                                object5 = av5.d;
                                if (object3 == null || object3 == object5 || object5 != null && object3.equals(object5)) {
                                    object4 = object5;
                                    if (object2 != null) {
                                        av5.d = object2;
                                    } else if (av4 != null) {
                                        av4.e = av5.e;
                                    } else {
                                        io.netty.util.c.a.a.a(arrav, n2, av5.e);
                                    }
                                }
                                break;
                            }
                            av4 = av5;
                        } while ((av5 = av5.e) != null);
                    } else if (av2 instanceof bm) {
                        bl2 = true;
                        av5 = (bm)av2;
                        av4 = ((bm)av5).a;
                        if (av4 != null && (object6 = ((bn)av4).a(n4, object, null)) != null) {
                            object5 = ((bn)object6).d;
                            if (object3 == null || object3 == object5 || object5 != null && object3.equals(object5)) {
                                object4 = object5;
                                if (object2 != null) {
                                    ((bn)object6).d = object2;
                                } else if (((bm)av5).a((bn)object6)) {
                                    io.netty.util.c.a.a.a(arrav, n2, io.netty.util.c.a.a.a(((bm)av5).f));
                                }
                            }
                        }
                    }
                }
            }
            if (!bl2) continue;
            if (object4 == null) break;
            if (object2 == null) {
                this.a(-1L, -1);
            }
            return object4;
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void clear() {
        long l2 = 0L;
        int n2 = 0;
        av[] arrav = this.j;
        while (arrav != null && n2 < arrav.length) {
            av av2 = io.netty.util.c.a.a.a(arrav, n2);
            if (av2 == null) {
                ++n2;
                continue;
            }
            int n3 = av2.b;
            if (n3 == -1) {
                arrav = this.a(arrav, av2);
                n2 = 0;
                continue;
            }
            av av3 = av2;
            synchronized (av3) {
                if (io.netty.util.c.a.a.a(arrav, n2) == av2) {
                    av av4;
                    av av5 = n3 >= 0 ? av2 : (av4 = av2 instanceof bm ? ((bm)av2).f : null);
                    while (av4 != null) {
                        --l2;
                        av4 = av4.e;
                    }
                    io.netty.util.c.a.a.a(arrav, n2++, null);
                }
            }
        }
        if (l2 != 0L) {
            this.a(l2, -1);
        }
    }

    public ab a() {
        ab ab2 = this.A;
        return ab2 != null ? ab2 : (this.A = new ab(this, null));
    }

    @Override
    public Collection values() {
        bq bq2 = this.B;
        return bq2 != null ? bq2 : (this.B = new bq(this));
    }

    @Override
    public Set entrySet() {
        n n2 = this.C;
        return n2 != null ? n2 : (this.C = new n(this));
    }

    @Override
    public int hashCode() {
        int n2 = 0;
        av[] arrav = this.j;
        if (this.j != null) {
            av av2;
            bl bl2 = new bl(arrav, arrav.length, 0, arrav.length);
            while ((av2 = bl2.c()) != null) {
                n2 += av2.c.hashCode() ^ av2.d.hashCode();
            }
        }
        return n2;
    }

    public String toString() {
        av[] arrav = this.j;
        int n2 = this.j == null ? 0 : arrav.length;
        bl bl2 = new bl(arrav, n2, 0, n2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('{');
        av av2 = bl2.c();
        if (av2 != null) {
            while (true) {
                Object object = av2.c;
                Object object2 = av2.d;
                stringBuilder.append(object == this ? "(this Map)" : object);
                stringBuilder.append('=');
                stringBuilder.append(object2 == this ? "(this Map)" : object2);
                av2 = bl2.c();
                if (av2 == null) break;
                stringBuilder.append(',').append(' ');
            }
        }
        return stringBuilder.append('}').toString();
    }

    @Override
    public boolean equals(Object object) {
        if (object != this) {
            Object object2;
            Object object3;
            if (!(object instanceof Map)) {
                return false;
            }
            Map map = (Map)object;
            av[] arrav = this.j;
            int n2 = this.j == null ? 0 : arrav.length;
            bl bl2 = new bl(arrav, n2, 0, n2);
            while ((object3 = bl2.c()) != null) {
                Object object4 = ((av)object3).d;
                object2 = map.get(((av)object3).c);
                if (object2 != null && (object2 == object4 || object2.equals(object4))) continue;
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                Object object4;
                Object v2;
                object2 = entry.getKey();
                if (object2 != null && (v2 = entry.getValue()) != null && (object4 = this.get(object2)) != null && (v2 == object4 || v2.equals(object4))) continue;
                return false;
            }
        }
        return true;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        int n2;
        int n3 = 0;
        for (n2 = 1; n2 < 16; n2 <<= 1) {
            ++n3;
        }
        int n4 = 32 - n3;
        int n5 = n2 - 1;
        bk[] arrbk = new bk[16];
        for (int i2 = 0; i2 < arrbk.length; ++i2) {
            arrbk[i2] = new bk(0.75f);
        }
        objectOutputStream.putFields().put("segments", arrbk);
        objectOutputStream.putFields().put("segmentShift", n4);
        objectOutputStream.putFields().put("segmentMask", n5);
        objectOutputStream.writeFields();
        av[] arrav = this.j;
        if (this.j != null) {
            av av2;
            bl bl2 = new bl(arrav, arrav.length, 0, arrav.length);
            while ((av2 = bl2.c()) != null) {
                objectOutputStream.writeObject(av2.c);
                objectOutputStream.writeObject(av2.d);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
        arrbk = null;
    }

    private void a(ObjectInputStream objectInputStream) {
        av[] arrav;
        this.v = -1;
        objectInputStream.defaultReadObject();
        long l2 = 0L;
        av av2 = null;
        while (true) {
            Object object = objectInputStream.readObject();
            arrav = objectInputStream.readObject();
            if (object == null || arrav == null) break;
            av2 = new av(io.netty.util.c.a.a.a(object.hashCode()), object, arrav, av2);
            ++l2;
        }
        if (l2 == 0L) {
            this.v = 0;
        } else {
            int n2;
            if (l2 >= 0x20000000L) {
                n2 = 0x40000000;
            } else {
                int n3 = (int)l2;
                n2 = io.netty.util.c.a.a.c(n3 + (n3 >>> 1) + 1);
            }
            arrav = new av[n2];
            int n4 = n2 - 1;
            long l3 = 0L;
            while (av2 != null) {
                boolean bl2;
                av av3 = av2.e;
                int n5 = av2.b;
                int n6 = n5 & n4;
                av av4 = io.netty.util.c.a.a.a(arrav, n6);
                if (av4 == null) {
                    bl2 = true;
                } else {
                    Object object = av2.c;
                    if (av4.b < 0) {
                        bm bm2 = (bm)av4;
                        if (bm2.a(n5, object, av2.d) == null) {
                            ++l3;
                        }
                        bl2 = false;
                    } else {
                        int n7 = 0;
                        bl2 = true;
                        av av5 = av4;
                        while (av5 != null) {
                            Object object2;
                            if (av5.b == n5 && ((object2 = av5.c) == object || object2 != null && object.equals(object2))) {
                                bl2 = false;
                                break;
                            }
                            ++n7;
                            av5 = av5.e;
                        }
                        if (bl2 && n7 >= 8) {
                            bl2 = false;
                            ++l3;
                            av2.e = av4;
                            bn bn2 = null;
                            bn bn3 = null;
                            av5 = av2;
                            while (av5 != null) {
                                bn bn4 = new bn(av5.b, av5.c, av5.d, null, null);
                                bn4.h = bn3;
                                if (bn4.h == null) {
                                    bn2 = bn4;
                                } else {
                                    bn3.e = bn4;
                                }
                                bn3 = bn4;
                                av5 = av5.e;
                            }
                            io.netty.util.c.a.a.a(arrav, n6, new bm(bn2));
                        }
                    }
                }
                if (bl2) {
                    ++l3;
                    av2.e = av4;
                    io.netty.util.c.a.a.a(arrav, n6, av2);
                }
                av2 = av3;
            }
            this.j = arrav;
            this.v = n2 - (n2 >>> 2);
            this.u = l3;
        }
    }

    @Override
    public Object putIfAbsent(Object object, Object object2) {
        return this.a(object, object2, true);
    }

    @Override
    public boolean remove(Object object, Object object2) {
        if (object == null) {
            throw new NullPointerException();
        }
        return object2 != null && this.a(object, null, object2) != null;
    }

    @Override
    public boolean replace(Object object, Object object2, Object object3) {
        if (object == null || object2 == null || object3 == null) {
            throw new NullPointerException();
        }
        return this.a(object, object3, object2) != null;
    }

    @Override
    public Object replace(Object object, Object object2) {
        if (object == null || object2 == null) {
            throw new NullPointerException();
        }
        return this.a(object, object2, (Object)null);
    }

    @Override
    public Object getOrDefault(Object object, Object object2) {
        Object object3 = this.get(object);
        return object3 == null ? object2 : object3;
    }

    public void a(e e2) {
        if (e2 == null) {
            throw new NullPointerException();
        }
        av[] arrav = this.j;
        if (this.j != null) {
            av av2;
            bl bl2 = new bl(arrav, arrav.length, 0, arrav.length);
            while ((av2 = bl2.c()) != null) {
                e2.a(av2.c, av2.d);
            }
        }
    }

    public void a(f f2) {
        if (f2 == null) {
            throw new NullPointerException();
        }
        av[] arrav = this.j;
        if (this.j != null) {
            av av2;
            bl bl2 = new bl(arrav, arrav.length, 0, arrav.length);
            while ((av2 = bl2.c()) != null) {
                Object object;
                Object object2 = av2.d;
                Object object3 = av2.c;
                do {
                    if ((object = f2.a(object3, object2)) != null) continue;
                    throw new NullPointerException();
                } while (this.a(object3, object, object2) == null && (object2 = this.get(object3)) != null);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object a(Object object, y y2) {
        int n2;
        Object object2;
        block30: {
            boolean bl2;
            int n3;
            if (object == null || y2 == null) {
                throw new NullPointerException();
            }
            int n4 = io.netty.util.c.a.a.a(object.hashCode());
            object2 = null;
            n2 = 0;
            av[] arrav = this.j;
            while (true) {
                av av2;
                av av3;
                int n5;
                if (arrav == null || (n5 = arrav.length) == 0) {
                    arrav = this.h();
                    continue;
                }
                n3 = n5 - 1 & n4;
                av av4 = io.netty.util.c.a.a.a(arrav, n3);
                if (av4 == null) {
                    bf bf2;
                    av3 = bf2 = new bf();
                    synchronized (av3) {
                        if (io.netty.util.c.a.a.a(arrav, n3, null, bf2)) {
                            n2 = 1;
                            av2 = null;
                            try {
                                object2 = y2.a(object);
                                if (object2 != null) {
                                    av2 = new av(n4, object, object2, null);
                                }
                            }
                            finally {
                                io.netty.util.c.a.a.a(arrav, n3, av2);
                            }
                        }
                    }
                    if (n2 == 0) continue;
                    break block30;
                }
                int n6 = av4.b;
                if (n6 == -1) {
                    arrav = this.a(arrav, av4);
                    continue;
                }
                bl2 = false;
                av3 = av4;
                synchronized (av3) {
                    block31: {
                        if (io.netty.util.c.a.a.a(arrav, n3) == av4) {
                            Object object3;
                            if (n6 >= 0) {
                                n2 = 1;
                                av2 = av4;
                                while (true) {
                                    if (av2.b == n4 && ((object3 = av2.c) == object || object3 != null && object.equals(object3))) {
                                        object2 = av2.d;
                                        break block31;
                                    }
                                    av av5 = av2;
                                    av2 = av2.e;
                                    if (av2 == null) {
                                        object2 = y2.a(object);
                                        if (object2 != null) {
                                            bl2 = true;
                                            av5.e = new av(n4, object, object2, null);
                                        }
                                        break block31;
                                    }
                                    ++n2;
                                }
                            }
                            if (av4 instanceof bm) {
                                bn bn2;
                                n2 = 2;
                                av2 = (bm)av4;
                                object3 = ((bm)av2).a;
                                if (object3 != null && (bn2 = ((bn)object3).a(n4, object, null)) != null) {
                                    object2 = bn2.d;
                                } else {
                                    object2 = y2.a(object);
                                    if (object2 != null) {
                                        bl2 = true;
                                        ((bm)av2).a(n4, object, object2);
                                    }
                                }
                            }
                        }
                    }
                }
                if (n2 != 0) break;
            }
            if (n2 >= 8) {
                this.b(arrav, n3);
            }
            if (!bl2) {
                return object2;
            }
        }
        if (object2 != null) {
            this.a(1L, n2);
        }
        return object2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object a(Object object, f f2) {
        if (object == null || f2 == null) {
            throw new NullPointerException();
        }
        int n2 = io.netty.util.c.a.a.a(object.hashCode());
        Object object2 = null;
        int n3 = 0;
        int n4 = 0;
        av[] arrav = this.j;
        while (true) {
            int n5;
            if (arrav == null || (n5 = arrav.length) == 0) {
                arrav = this.h();
                continue;
            }
            int n6 = n5 - 1 & n2;
            av av2 = io.netty.util.c.a.a.a(arrav, n6);
            if (av2 == null) break;
            int n7 = av2.b;
            if (n7 == -1) {
                arrav = this.a(arrav, av2);
                continue;
            }
            av av3 = av2;
            synchronized (av3) {
                if (io.netty.util.c.a.a.a(arrav, n6) == av2) {
                    Object object3;
                    av av4;
                    av av5;
                    if (n7 >= 0) {
                        n4 = 1;
                        av5 = av2;
                        av4 = null;
                        while (true) {
                            if (av5.b == n2 && ((object3 = av5.c) == object || object3 != null && object.equals(object3))) {
                                object2 = f2.a(object, av5.d);
                                if (object2 != null) {
                                    av5.d = object2;
                                } else {
                                    n3 = -1;
                                    av av6 = av5.e;
                                    if (av4 != null) {
                                        av4.e = av6;
                                    } else {
                                        io.netty.util.c.a.a.a(arrav, n6, av6);
                                    }
                                }
                            } else {
                                av4 = av5;
                                av5 = av5.e;
                                if (av5 != null) {
                                    ++n4;
                                    continue;
                                }
                            }
                            break;
                        }
                    } else if (av2 instanceof bm) {
                        n4 = 2;
                        av5 = (bm)av2;
                        av4 = ((bm)av5).a;
                        if (av4 != null && (object3 = ((bn)av4).a(n2, object, null)) != null) {
                            object2 = f2.a(object, ((bn)object3).d);
                            if (object2 != null) {
                                ((bn)object3).d = object2;
                            } else {
                                n3 = -1;
                                if (((bm)av5).a((bn)object3)) {
                                    io.netty.util.c.a.a.a(arrav, n6, io.netty.util.c.a.a.a(((bm)av5).f));
                                }
                            }
                        }
                    }
                }
            }
            if (n4 != 0) break;
        }
        if (n3 != 0) {
            this.a((long)n3, n4);
        }
        return object2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object b(Object object, f f2) {
        int n2;
        int n3;
        Object object2;
        block33: {
            int n4;
            if (object == null || f2 == null) {
                throw new NullPointerException();
            }
            int n5 = io.netty.util.c.a.a.a(object.hashCode());
            object2 = null;
            n3 = 0;
            n2 = 0;
            av[] arrav = this.j;
            while (true) {
                av av2;
                av av3;
                av av4;
                av av5;
                block35: {
                    int n6;
                    if (arrav == null || (n6 = arrav.length) == 0) {
                        arrav = this.h();
                        continue;
                    }
                    n4 = n6 - 1 & n5;
                    av5 = io.netty.util.c.a.a.a(arrav, n4);
                    if (av5 != null) break block35;
                    av4 = new bf();
                    av3 = av4;
                    synchronized (av3) {
                        if (io.netty.util.c.a.a.a(arrav, n4, null, av4)) {
                            block32: {
                                n2 = 1;
                                av2 = null;
                                try {
                                    object2 = f2.a(object, null);
                                    if (object2 == null) break block32;
                                    n3 = 1;
                                    av2 = new av(n5, object, object2, null);
                                }
                                catch (Throwable throwable) {
                                    io.netty.util.c.a.a.a(arrav, n4, av2);
                                    throw throwable;
                                }
                            }
                            io.netty.util.c.a.a.a(arrav, n4, av2);
                        }
                    }
                    if (n2 == 0) continue;
                    break block33;
                }
                int n7 = av5.b;
                if (n7 == -1) {
                    arrav = this.a(arrav, av5);
                    continue;
                }
                av4 = av5;
                synchronized (av4) {
                    block34: {
                        if (io.netty.util.c.a.a.a(arrav, n4) == av5) {
                            Object object3;
                            Object object4;
                            if (n7 >= 0) {
                                n2 = 1;
                                av3 = av5;
                                av2 = null;
                                while (true) {
                                    if (av3.b == n5 && ((object4 = av3.c) == object || object4 != null && object.equals(object4))) {
                                        object2 = f2.a(object, av3.d);
                                        if (object2 != null) {
                                            av3.d = object2;
                                        } else {
                                            n3 = -1;
                                            object3 = av3.e;
                                            if (av2 != null) {
                                                av2.e = object3;
                                            } else {
                                                io.netty.util.c.a.a.a(arrav, n4, (av)object3);
                                            }
                                        }
                                        break block34;
                                    }
                                    av2 = av3;
                                    av3 = av3.e;
                                    if (av3 == null) {
                                        object2 = f2.a(object, null);
                                        if (object2 != null) {
                                            n3 = 1;
                                            av2.e = new av(n5, object, object2, null);
                                        }
                                        break block34;
                                    }
                                    ++n2;
                                }
                            }
                            if (av5 instanceof bm) {
                                n2 = 1;
                                av3 = (bm)av5;
                                av2 = ((bm)av3).a;
                                object4 = av2 != null ? ((bn)av2).a(n5, object, null) : null;
                                object3 = object4 == null ? null : ((bn)object4).d;
                                object2 = f2.a(object, object3);
                                if (object2 != null) {
                                    if (object4 != null) {
                                        ((bn)object4).d = object2;
                                    } else {
                                        n3 = 1;
                                        ((bm)av3).a(n5, object, object2);
                                    }
                                } else if (object4 != null) {
                                    n3 = -1;
                                    if (((bm)av3).a((bn)object4)) {
                                        io.netty.util.c.a.a.a(arrav, n4, io.netty.util.c.a.a.a(((bm)av3).f));
                                    }
                                }
                            }
                        }
                    }
                }
                if (n2 != 0) break;
            }
            if (n2 >= 8) {
                this.b(arrav, n4);
            }
        }
        if (n3 != 0) {
            this.a((long)n3, n2);
        }
        return object2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object a(Object object, Object object2, f f2) {
        int n2;
        int n3;
        Object object3;
        block26: {
            int n4;
            if (object == null || object2 == null || f2 == null) {
                throw new NullPointerException();
            }
            int n5 = io.netty.util.c.a.a.a(object.hashCode());
            object3 = null;
            n3 = 0;
            n2 = 0;
            av[] arrav = this.j;
            while (true) {
                int n6;
                if (arrav == null || (n6 = arrav.length) == 0) {
                    arrav = this.h();
                    continue;
                }
                n4 = n6 - 1 & n5;
                av av2 = io.netty.util.c.a.a.a(arrav, n4);
                if (av2 == null) {
                    if (!io.netty.util.c.a.a.a(arrav, n4, null, new av(n5, object, object2, null))) continue;
                    n3 = 1;
                    object3 = object2;
                    break block26;
                }
                int n7 = av2.b;
                if (n7 == -1) {
                    arrav = this.a(arrav, av2);
                    continue;
                }
                av av3 = av2;
                synchronized (av3) {
                    block27: {
                        if (io.netty.util.c.a.a.a(arrav, n4) == av2) {
                            Object object4;
                            av av4;
                            av av5;
                            if (n7 >= 0) {
                                n2 = 1;
                                av5 = av2;
                                av4 = null;
                                while (true) {
                                    if (av5.b == n5 && ((object4 = av5.c) == object || object4 != null && object.equals(object4))) {
                                        object3 = f2.a(av5.d, object2);
                                        if (object3 != null) {
                                            av5.d = object3;
                                        } else {
                                            n3 = -1;
                                            av av6 = av5.e;
                                            if (av4 != null) {
                                                av4.e = av6;
                                            } else {
                                                io.netty.util.c.a.a.a(arrav, n4, av6);
                                            }
                                        }
                                        break block27;
                                    }
                                    av4 = av5;
                                    av5 = av5.e;
                                    if (av5 == null) {
                                        n3 = 1;
                                        object3 = object2;
                                        av4.e = new av(n5, object, object3, null);
                                        break block27;
                                    }
                                    ++n2;
                                }
                            }
                            if (av2 instanceof bm) {
                                n2 = 2;
                                av5 = (bm)av2;
                                av4 = ((bm)av5).a;
                                object4 = av4 == null ? null : ((bn)av4).a(n5, object, null);
                                Object object5 = object3 = object4 == null ? object2 : f2.a(((bn)object4).d, object2);
                                if (object3 != null) {
                                    if (object4 != null) {
                                        ((bn)object4).d = object3;
                                    } else {
                                        n3 = 1;
                                        ((bm)av5).a(n5, object, object3);
                                    }
                                } else if (object4 != null) {
                                    n3 = -1;
                                    if (((bm)av5).a((bn)object4)) {
                                        io.netty.util.c.a.a.a(arrav, n4, io.netty.util.c.a.a.a(((bm)av5).f));
                                    }
                                }
                            }
                        }
                    }
                }
                if (n2 != 0) break;
            }
            if (n2 >= 8) {
                this.b(arrav, n4);
            }
        }
        if (n3 != 0) {
            this.a((long)n3, n2);
        }
        return object3;
    }

    public boolean b(Object object) {
        return this.containsValue(object);
    }

    public Enumeration b() {
        av[] arrav = this.j;
        int n2 = this.j == null ? 0 : arrav.length;
        return new aa(arrav, n2, 0, n2, this);
    }

    public Enumeration c() {
        av[] arrav = this.j;
        int n2 = this.j == null ? 0 : arrav.length;
        return new bo(arrav, n2, 0, n2, this);
    }

    public long d() {
        long l2 = this.f();
        return l2 < 0L ? 0L : l2;
    }

    public static ab e() {
        return new ab(new a(), Boolean.TRUE);
    }

    public static ab b(int n2) {
        return new ab(new a(n2), Boolean.TRUE);
    }

    public ab c(Object object) {
        if (object == null) {
            throw new NullPointerException();
        }
        return new ab(this, object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final av[] h() {
        av[] arrav;
        block6: {
            int n2;
            while (true) {
                arrav = this.j;
                if (this.j != null && arrav.length != 0) break block6;
                n2 = this.v;
                if (n2 < 0) {
                    Thread.yield();
                    continue;
                }
                if (D.compareAndSwapInt(this, E, n2, -1)) break;
            }
            try {
                arrav = this.j;
                if (this.j == null || arrav.length == 0) {
                    int n3 = n2 > 0 ? n2 : 16;
                    av[] arrav2 = new av[n3];
                    arrav = arrav2;
                    this.j = arrav2;
                    n2 = n3 - (n3 >>> 2);
                }
            }
            finally {
                this.v = n2;
            }
        }
        return arrav;
    }

    private final void a(long l2, int n2) {
        av[] arrav;
        av[] arrav2;
        long l3;
        long l4;
        j[] arrj = this.z;
        if (this.z != null || !D.compareAndSwapLong(this, H, l4 = this.u, l3 = l4 + l2)) {
            long l5;
            int n3;
            boolean bl2 = true;
            io.netty.util.c.f f2 = io.netty.util.c.f.b();
            arrav2 = f2.o();
            if (arrav2 == null || arrj == null || (n3 = arrj.length - 1) < 0 || (arrav = arrj[n3 & arrav2.a]) == null || !(bl2 = D.compareAndSwapLong(arrav, J, l5 = arrav.h, l5 + l2))) {
                this.a(f2, l2, (io.netty.util.c.e)arrav2, bl2);
                return;
            }
            if (n2 <= 1) {
                return;
            }
            l3 = this.f();
        }
        if (n2 >= 0) {
            int n4;
            while (l3 >= (long)(n4 = this.v)) {
                arrav2 = this.j;
                if (this.j == null || arrav2.length >= 0x40000000) break;
                if (n4 < 0) {
                    if (n4 == -1 || this.w <= this.x) break;
                    arrav = this.t;
                    if (this.t == null) break;
                    if (D.compareAndSwapInt(this, E, n4, n4 - 1)) {
                        this.a(arrav2, arrav);
                    }
                } else if (D.compareAndSwapInt(this, E, n4, -2)) {
                    this.a(arrav2, (av[])null);
                }
                l3 = this.f();
            }
        }
    }

    final av[] a(av[] arrav, av av2) {
        if (av2 instanceof x) {
            av[] arrav2 = ((x)av2).a;
            if (((x)av2).a != null) {
                int n2;
                if (arrav2 == this.t && arrav == this.j && this.w > this.x && (n2 = this.v) < -1 && D.compareAndSwapInt(this, E, n2, n2 - 1)) {
                    this.a(arrav, arrav2);
                }
                return arrav2;
            }
        }
        return this.j;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void d(int n2) {
        int n3;
        int n4;
        int n5 = n4 = n2 >= 0x20000000 ? 0x40000000 : io.netty.util.c.a.a.c(n2 + (n2 >>> 1) + 1);
        while ((n3 = this.v) >= 0) {
            int n6;
            av[] arrav = this.j;
            if (arrav == null || (n6 = arrav.length) == 0) {
                int n7 = n6 = n3 > n4 ? n3 : n4;
                if (!D.compareAndSwapInt(this, E, n3, -1)) continue;
                try {
                    if (this.j != arrav) continue;
                    av[] arrav2 = new av[n6];
                    this.j = arrav2;
                    n3 = n6 - (n6 >>> 2);
                    continue;
                }
                finally {
                    this.v = n3;
                    continue;
                }
            }
            if (n4 <= n3 || n6 >= 0x40000000) break;
            if (arrav != this.j || !D.compareAndSwapInt(this, E, n3, -2)) continue;
            this.a(arrav, (av[])null);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void a(av[] arrav, av[] arrav2) {
        int n2;
        int n3;
        int n4 = arrav.length;
        int n5 = i > 1 ? (n4 >>> 3) / i : n4;
        if (n5 < 16) {
            n5 = 16;
        }
        if (arrav2 == null) {
            Object object;
            try {
                object = new av[n4 << 1];
                arrav2 = object;
            }
            catch (Throwable throwable) {
                this.v = Integer.MAX_VALUE;
                return;
            }
            this.t = arrav2;
            this.x = n4;
            this.w = n4;
            object = new x(arrav);
            int n6 = n4;
            while (n6 > 0) {
                for (n3 = n2 = n6 > n5 ? n6 - n5 : 0; n3 < n6; ++n3) {
                    arrav2[n3] = object;
                }
                for (n3 = n4 + n2; n3 < n4 + n6; ++n3) {
                    arrav2[n3] = object;
                }
                n6 = n2;
                D.putOrderedInt(this, G, n6);
            }
        }
        int n7 = arrav2.length;
        x x2 = new x(arrav2);
        n2 = 1;
        n3 = 0;
        int n8 = 0;
        int n9 = 0;
        while (true) {
            if (n2 != 0) {
                if (--n8 >= n9 || n3 != 0) {
                    n2 = 0;
                    continue;
                }
                int n10 = this.w;
                if (n10 <= this.x) {
                    n8 = -1;
                    n2 = 0;
                    continue;
                }
                int n11 = n10 > n5 ? n10 - n5 : 0;
                if (!D.compareAndSwapInt(this, F, n10, n11)) continue;
                n9 = n11;
                n8 = n10 - 1;
                n2 = 0;
                continue;
            }
            if (n8 < 0 || n8 >= n4 || n8 + n4 >= n7) {
                int n12;
                if (n3 != 0) {
                    this.t = null;
                    this.j = arrav2;
                    this.v = (n4 << 1) - (n4 >>> 1);
                    return;
                }
                do {
                    n12 = this.v;
                } while (!D.compareAndSwapInt(this, E, n12, ++n12));
                if (n12 != -1) {
                    return;
                }
                n2 = 1;
                n3 = 1;
                n8 = n4;
                continue;
            }
            av av2 = io.netty.util.c.a.a.a(arrav, n8);
            if (av2 == null) {
                if (!io.netty.util.c.a.a.a(arrav, n8, null, x2)) continue;
                io.netty.util.c.a.a.a(arrav2, n8, null);
                io.netty.util.c.a.a.a(arrav2, n8 + n4, null);
                n2 = 1;
                continue;
            }
            int n13 = av2.b;
            if (n13 == -1) {
                n2 = 1;
                continue;
            }
            av av3 = av2;
            synchronized (av3) {
                if (io.netty.util.c.a.a.a(arrav, n8) == av2) {
                    Object object;
                    av av4;
                    av av5;
                    av av6;
                    av av7;
                    if (n13 >= 0) {
                        int n14;
                        int n15 = n13 & n4;
                        av7 = av2;
                        av6 = av2.e;
                        while (av6 != null) {
                            n14 = av6.b & n4;
                            if (n14 != n15) {
                                n15 = n14;
                                av7 = av6;
                            }
                            av6 = av6.e;
                        }
                        if (n15 == 0) {
                            av5 = av7;
                            av4 = null;
                        } else {
                            av4 = av7;
                            av5 = null;
                        }
                        av6 = av2;
                        while (av6 != av7) {
                            n14 = av6.b;
                            object = av6.c;
                            Object object2 = av6.d;
                            if ((n14 & n4) == 0) {
                                av5 = new av(n14, object, object2, av5);
                            } else {
                                av4 = new av(n14, object, object2, av4);
                            }
                            av6 = av6.e;
                        }
                        io.netty.util.c.a.a.a(arrav2, n8, av5);
                        io.netty.util.c.a.a.a(arrav2, n8 + n4, av4);
                        io.netty.util.c.a.a.a(arrav, n8, x2);
                        n2 = 1;
                    } else if (av2 instanceof bm) {
                        bm bm2 = (bm)av2;
                        av7 = null;
                        av6 = null;
                        bn bn2 = null;
                        object = null;
                        int n16 = 0;
                        int n17 = 0;
                        av av8 = bm2.f;
                        while (av8 != null) {
                            int n18 = av8.b;
                            bn bn3 = new bn(n18, av8.c, av8.d, null, null);
                            if ((n18 & n4) == 0) {
                                bn3.h = av6;
                                if (bn3.h == null) {
                                    av7 = bn3;
                                } else {
                                    ((bn)av6).e = bn3;
                                }
                                av6 = bn3;
                                ++n16;
                            } else {
                                bn3.h = object;
                                if (bn3.h == null) {
                                    bn2 = bn3;
                                } else {
                                    ((bn)object).e = bn3;
                                }
                                object = bn3;
                                ++n17;
                            }
                            av8 = av8.e;
                        }
                        av av9 = n16 <= 6 ? io.netty.util.c.a.a.a(av7) : (av5 = n17 != 0 ? new bm((bn)av7) : bm2);
                        av4 = n17 <= 6 ? io.netty.util.c.a.a.a(bn2) : (n16 != 0 ? new bm(bn2) : bm2);
                        io.netty.util.c.a.a.a(arrav2, n8, av5);
                        io.netty.util.c.a.a.a(arrav2, n8 + n4, av4);
                        io.netty.util.c.a.a.a(arrav, n8, x2);
                        n2 = 1;
                    }
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void b(av[] arrav, int n2) {
        if (arrav != null) {
            int n3 = arrav.length;
            if (n3 < 64) {
                int n4;
                if (arrav == this.j && (n4 = this.v) >= 0 && D.compareAndSwapInt(this, E, n4, -2)) {
                    this.a(arrav, (av[])null);
                }
            } else {
                av av2 = io.netty.util.c.a.a.a(arrav, n2);
                if (av2 != null && av2.b >= 0) {
                    av av3 = av2;
                    synchronized (av3) {
                        if (io.netty.util.c.a.a.a(arrav, n2) == av2) {
                            bn bn2 = null;
                            bn bn3 = null;
                            av av4 = av2;
                            while (av4 != null) {
                                bn bn4 = new bn(av4.b, av4.c, av4.d, null, null);
                                bn4.h = bn3;
                                if (bn4.h == null) {
                                    bn2 = bn4;
                                } else {
                                    bn3.e = bn4;
                                }
                                bn3 = bn4;
                                av4 = av4.e;
                            }
                            io.netty.util.c.a.a.a(arrav, n2, new bm(bn2));
                        }
                    }
                }
            }
        }
    }

    static av a(av av2) {
        av av3 = null;
        av av4 = null;
        av av5 = av2;
        while (av5 != null) {
            av av6 = new av(av5.b, av5.c, av5.d, null);
            if (av4 == null) {
                av3 = av6;
            } else {
                av4.e = av6;
            }
            av4 = av6;
            av5 = av5.e;
        }
        return av3;
    }

    final int a(long l2) {
        long l3;
        if (l2 == Long.MAX_VALUE || (l3 = this.f()) <= 1L || l3 < l2) {
            return 0;
        }
        int n2 = bt.h() << 2;
        return l2 <= 0L || (l3 /= l2) >= (long)n2 ? n2 : (int)l3;
    }

    public void a(long l2, e e2) {
        if (e2 == null) {
            throw new NullPointerException();
        }
        new r(null, this.a(l2), 0, 0, this.j, e2).t();
    }

    public void a(long l2, f f2, c c2) {
        if (f2 == null || c2 == null) {
            throw new NullPointerException();
        }
        new u(null, this.a(l2), 0, 0, this.j, f2, c2).t();
    }

    public Object a(long l2, f f2) {
        if (f2 == null) {
            throw new NullPointerException();
        }
        return new bi(null, this.a(l2), 0, 0, this.j, f2, new AtomicReference()).t();
    }

    public Object a(long l2, f f2, f f3) {
        if (f2 == null || f3 == null) {
            throw new NullPointerException();
        }
        return new an(null, this.a(l2), 0, 0, this.j, null, f2, f3).t();
    }

    public double a(long l2, aw aw2, double d2, l l3) {
        if (aw2 == null || l3 == null) {
            throw new NullPointerException();
        }
        return (Double)new ao(null, this.a(l2), 0, 0, this.j, null, aw2, d2, l3).t();
    }

    public long a(long l2, ay ay2, long l3, ad ad2) {
        if (ay2 == null || ad2 == null) {
            throw new NullPointerException();
        }
        return (Long)new aq(null, this.a(l2), 0, 0, this.j, null, ay2, l3, ad2).t();
    }

    public int a(long l2, ax ax2, int n2, z z2) {
        if (ax2 == null || z2 == null) {
            throw new NullPointerException();
        }
        return (Integer)new ap(null, this.a(l2), 0, 0, this.j, null, ax2, n2, z2).t();
    }

    public void a(long l2, c c2) {
        if (c2 == null) {
            throw new NullPointerException();
        }
        new q(null, this.a(l2), 0, 0, this.j, c2).t();
    }

    public void a(long l2, y y2, c c2) {
        if (y2 == null || c2 == null) {
            throw new NullPointerException();
        }
        new t(null, this.a(l2), 0, 0, this.j, y2, c2).t();
    }

    public Object a(long l2, y y2) {
        if (y2 == null) {
            throw new NullPointerException();
        }
        return new bh(null, this.a(l2), 0, 0, this.j, y2, new AtomicReference()).t();
    }

    public Object b(long l2, f f2) {
        if (f2 == null) {
            throw new NullPointerException();
        }
        return new bd(null, this.a(l2), 0, 0, this.j, null, f2).t();
    }

    public Object a(long l2, y y2, f f2) {
        if (y2 == null || f2 == null) {
            throw new NullPointerException();
        }
        return new aj(null, this.a(l2), 0, 0, this.j, null, y2, f2).t();
    }

    public double a(long l2, az az2, double d2, l l3) {
        if (az2 == null || l3 == null) {
            throw new NullPointerException();
        }
        return (Double)new ak(null, this.a(l2), 0, 0, this.j, null, az2, d2, l3).t();
    }

    public long a(long l2, bb bb2, long l3, ad ad2) {
        if (bb2 == null || ad2 == null) {
            throw new NullPointerException();
        }
        return (Long)new am(null, this.a(l2), 0, 0, this.j, null, bb2, l3, ad2).t();
    }

    public int a(long l2, ba ba2, int n2, z z2) {
        if (ba2 == null || z2 == null) {
            throw new NullPointerException();
        }
        return (Integer)new al(null, this.a(l2), 0, 0, this.j, null, ba2, n2, z2).t();
    }

    public void b(long l2, c c2) {
        if (c2 == null) {
            throw new NullPointerException();
        }
        new w(null, this.a(l2), 0, 0, this.j, c2).t();
    }

    public void b(long l2, y y2, c c2) {
        if (y2 == null || c2 == null) {
            throw new NullPointerException();
        }
        new v(null, this.a(l2), 0, 0, this.j, y2, c2).t();
    }

    public Object b(long l2, y y2) {
        if (y2 == null) {
            throw new NullPointerException();
        }
        return new bj(null, this.a(l2), 0, 0, this.j, y2, new AtomicReference()).t();
    }

    public Object c(long l2, f f2) {
        if (f2 == null) {
            throw new NullPointerException();
        }
        return new be(null, this.a(l2), 0, 0, this.j, null, f2).t();
    }

    public Object b(long l2, y y2, f f2) {
        if (y2 == null || f2 == null) {
            throw new NullPointerException();
        }
        return new ar(null, this.a(l2), 0, 0, this.j, null, y2, f2).t();
    }

    public double b(long l2, az az2, double d2, l l3) {
        if (az2 == null || l3 == null) {
            throw new NullPointerException();
        }
        return (Double)new as(null, this.a(l2), 0, 0, this.j, null, az2, d2, l3).t();
    }

    public long b(long l2, bb bb2, long l3, ad ad2) {
        if (bb2 == null || ad2 == null) {
            throw new NullPointerException();
        }
        return (Long)new au(null, this.a(l2), 0, 0, this.j, null, bb2, l3, ad2).t();
    }

    public int b(long l2, ba ba2, int n2, z z2) {
        if (ba2 == null || z2 == null) {
            throw new NullPointerException();
        }
        return (Integer)new at(null, this.a(l2), 0, 0, this.j, null, ba2, n2, z2).t();
    }

    public void c(long l2, c c2) {
        if (c2 == null) {
            throw new NullPointerException();
        }
        new p(null, this.a(l2), 0, 0, this.j, c2).t();
    }

    public void c(long l2, y y2, c c2) {
        if (y2 == null || c2 == null) {
            throw new NullPointerException();
        }
        new s(null, this.a(l2), 0, 0, this.j, y2, c2).t();
    }

    public Object c(long l2, y y2) {
        if (y2 == null) {
            throw new NullPointerException();
        }
        return new bg(null, this.a(l2), 0, 0, this.j, y2, new AtomicReference()).t();
    }

    public Map.Entry d(long l2, f f2) {
        if (f2 == null) {
            throw new NullPointerException();
        }
        return (Map.Entry)new bc(null, this.a(l2), 0, 0, this.j, null, f2).t();
    }

    public Object c(long l2, y y2, f f2) {
        if (y2 == null || f2 == null) {
            throw new NullPointerException();
        }
        return new af(null, this.a(l2), 0, 0, this.j, null, y2, f2).t();
    }

    public double c(long l2, az az2, double d2, l l3) {
        if (az2 == null || l3 == null) {
            throw new NullPointerException();
        }
        return (Double)new ag(null, this.a(l2), 0, 0, this.j, null, az2, d2, l3).t();
    }

    public long c(long l2, bb bb2, long l3, ad ad2) {
        if (bb2 == null || ad2 == null) {
            throw new NullPointerException();
        }
        return (Long)new ai(null, this.a(l2), 0, 0, this.j, null, bb2, l3, ad2).t();
    }

    public int c(long l2, ba ba2, int n2, z z2) {
        if (ba2 == null || z2 == null) {
            throw new NullPointerException();
        }
        return (Integer)new ah(null, this.a(l2), 0, 0, this.j, null, ba2, n2, z2).t();
    }

    final long f() {
        j[] arrj = this.z;
        long l2 = this.u;
        if (arrj != null) {
            for (int i2 = 0; i2 < arrj.length; ++i2) {
                j j2 = arrj[i2];
                if (j2 == null) continue;
                l2 += j2.h;
            }
        }
        return l2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void a(io.netty.util.c.f f2, long l2, io.netty.util.c.e e2, boolean bl2) {
        int n2;
        int n3;
        if (e2 == null) {
            e2 = new io.netty.util.c.e();
            n3 = k.addAndGet(1640531527);
            e2.a = n3 == 0 ? 1 : n3;
            n2 = e2.a;
            f2.a(e2);
        } else {
            n2 = e2.a;
        }
        n3 = 0;
        while (true) {
            long l3;
            int n4;
            j[] arrj = this.z;
            if (this.z != null && (n4 = arrj.length) > 0) {
                j[] arrj2;
                j j2 = arrj[n4 - 1 & n2];
                if (j2 == null) {
                    if (this.y == 0) {
                        arrj2 = new j(l2);
                        if (this.y == 0 && D.compareAndSwapInt(this, I, 0, 1)) {
                            boolean bl3 = false;
                            try {
                                int n5;
                                int n6;
                                j[] arrj3 = this.z;
                                if (this.z != null && (n6 = arrj3.length) > 0 && arrj3[n5 = n6 - 1 & n2] == null) {
                                    arrj3[n5] = arrj2;
                                    bl3 = true;
                                }
                            }
                            finally {
                                this.y = 0;
                            }
                            if (!bl3) continue;
                            break;
                        }
                    }
                    n3 = 0;
                } else if (!bl2) {
                    bl2 = true;
                } else {
                    l3 = j2.h;
                    if (D.compareAndSwapLong(j2, J, l3, l3 + l2)) break;
                    if (this.z != arrj || n4 >= i) {
                        n3 = 0;
                    } else if (n3 == 0) {
                        n3 = 1;
                    } else if (this.y == 0 && D.compareAndSwapInt(this, I, 0, 1)) {
                        try {
                            if (this.z == arrj) {
                                arrj2 = new j[n4 << 1];
                                for (int i2 = 0; i2 < n4; ++i2) {
                                    arrj2[i2] = arrj[i2];
                                }
                                this.z = arrj2;
                            }
                        }
                        finally {
                            this.y = 0;
                        }
                        n3 = 0;
                        continue;
                    }
                }
                n2 ^= n2 << 13;
                n2 ^= n2 >>> 17;
                n2 ^= n2 << 5;
                continue;
            }
            if (this.y == 0 && this.z == arrj && D.compareAndSwapInt(this, I, 0, 1)) {
                boolean bl4 = false;
                try {
                    if (this.z == arrj) {
                        j[] arrj4 = new j[2];
                        arrj4[n2 & 1] = new j(l2);
                        this.z = arrj4;
                        bl4 = true;
                    }
                }
                finally {
                    this.y = 0;
                }
                if (!bl4) continue;
                break;
            }
            l3 = this.u;
            if (D.compareAndSwapLong(this, H, l3, l3 + l2)) break;
        }
        e2.a = n2;
    }

    private static Unsafe i() {
        try {
            return Unsafe.getUnsafe();
        }
        catch (SecurityException securityException) {
            try {
                return (Unsafe)AccessController.doPrivileged(new b());
            }
            catch (PrivilegedActionException privilegedActionException) {
                throw new RuntimeException("Could not initialize intrinsics", privilegedActionException.getCause());
            }
        }
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.a();
    }

    static /* synthetic */ Unsafe g() {
        return io.netty.util.c.a.a.i();
    }

    static {
        try {
            D = io.netty.util.c.a.a.i();
            Class<a> class_ = a.class;
            E = D.objectFieldOffset(class_.getDeclaredField("sizeCtl"));
            F = D.objectFieldOffset(class_.getDeclaredField("transferIndex"));
            G = D.objectFieldOffset(class_.getDeclaredField("transferOrigin"));
            H = D.objectFieldOffset(class_.getDeclaredField("baseCount"));
            I = D.objectFieldOffset(class_.getDeclaredField("cellsBusy"));
            Class<j> class_2 = j.class;
            J = D.objectFieldOffset(class_2.getDeclaredField("value"));
            Class<av[]> class_3 = av[].class;
            K = D.arrayBaseOffset(class_3);
            int n2 = D.arrayIndexScale(class_3);
            if ((n2 & n2 - 1) != 0) {
                throw new Error("data type scale not a power of two");
            }
            L = 31 - Integer.numberOfLeadingZeros(n2);
        }
        catch (Exception exception) {
            throw new Error(exception);
        }
    }
}

