/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.b.aa;
import com.a.b.b.ad;
import com.a.b.b.x;
import com.a.b.b.y;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class w
extends AbstractMap
implements Serializable {
    private static final Comparator g = new x();
    Comparator a;
    ad b;
    int c = 0;
    int d = 0;
    final ad e = new ad();
    private y h;
    private aa i;

    public w() {
        this(g);
    }

    public w(Comparator comparator) {
        this.a = comparator != null ? comparator : g;
    }

    public int size() {
        return this.c;
    }

    public Object get(Object object) {
        ad ad2 = this.a(object);
        return ad2 != null ? ad2.g : null;
    }

    public boolean containsKey(Object object) {
        return this.a(object) != null;
    }

    public Object put(Object object, Object object2) {
        if (object == null) {
            throw new NullPointerException("key == null");
        }
        ad ad2 = this.a(object, true);
        Object object3 = ad2.g;
        ad2.g = object2;
        return object3;
    }

    public void clear() {
        ad ad2;
        this.b = null;
        this.c = 0;
        ++this.d;
        ad2.d = ad2.e = (ad2 = this.e);
    }

    public Object remove(Object object) {
        ad ad2 = this.b(object);
        return ad2 != null ? ad2.g : null;
    }

    ad a(Object object, boolean bl2) {
        ad ad2;
        Object object2;
        Comparator comparator = this.a;
        ad ad3 = this.b;
        int n2 = 0;
        if (ad3 != null) {
            object2 = comparator == g ? (Comparable)object : null;
            while (true) {
                int n3 = n2 = object2 != null ? object2.compareTo(ad3.f) : comparator.compare(object, ad3.f);
                if (n2 == 0) {
                    return ad3;
                }
                ad ad4 = ad2 = n2 < 0 ? ad3.b : ad3.c;
                if (ad2 == null) break;
                ad3 = ad2;
            }
        }
        if (!bl2) {
            return null;
        }
        object2 = this.e;
        if (ad3 == null) {
            if (comparator == g && !(object instanceof Comparable)) {
                throw new ClassCastException(object.getClass().getName() + " is not Comparable");
            }
            this.b = ad2 = new ad(ad3, object, (ad)object2, ((ad)object2).e);
        } else {
            ad2 = new ad(ad3, object, (ad)object2, ((ad)object2).e);
            if (n2 < 0) {
                ad3.b = ad2;
            } else {
                ad3.c = ad2;
            }
            this.b(ad3, true);
        }
        ++this.c;
        ++this.d;
        return ad2;
    }

    ad a(Object object) {
        try {
            return object != null ? this.a(object, false) : null;
        }
        catch (ClassCastException classCastException) {
            return null;
        }
    }

    ad a(Map.Entry entry) {
        ad ad2 = this.a(entry.getKey());
        boolean bl2 = ad2 != null && this.a(ad2.g, entry.getValue());
        return bl2 ? ad2 : null;
    }

    private boolean a(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
    }

    void a(ad ad2, boolean bl2) {
        if (bl2) {
            ad2.e.d = ad2.d;
            ad2.d.e = ad2.e;
        }
        ad ad3 = ad2.b;
        ad ad4 = ad2.c;
        ad ad5 = ad2.a;
        if (ad3 != null && ad4 != null) {
            ad ad6 = ad3.h > ad4.h ? ad3.b() : ad4.a();
            this.a(ad6, false);
            int n2 = 0;
            ad3 = ad2.b;
            if (ad3 != null) {
                n2 = ad3.h;
                ad6.b = ad3;
                ad3.a = ad6;
                ad2.b = null;
            }
            int n3 = 0;
            ad4 = ad2.c;
            if (ad4 != null) {
                n3 = ad4.h;
                ad6.c = ad4;
                ad4.a = ad6;
                ad2.c = null;
            }
            ad6.h = Math.max(n2, n3) + 1;
            this.a(ad2, ad6);
            return;
        }
        if (ad3 != null) {
            this.a(ad2, ad3);
            ad2.b = null;
        } else if (ad4 != null) {
            this.a(ad2, ad4);
            ad2.c = null;
        } else {
            this.a(ad2, null);
        }
        this.b(ad5, false);
        --this.c;
        ++this.d;
    }

    ad b(Object object) {
        ad ad2 = this.a(object);
        if (ad2 != null) {
            this.a(ad2, true);
        }
        return ad2;
    }

    private void a(ad ad2, ad ad3) {
        ad ad4 = ad2.a;
        ad2.a = null;
        if (ad3 != null) {
            ad3.a = ad4;
        }
        if (ad4 != null) {
            if (ad4.b == ad2) {
                ad4.b = ad3;
            } else {
                assert (ad4.c == ad2);
                ad4.c = ad3;
            }
        } else {
            this.b = ad3;
        }
    }

    private void b(ad ad2, boolean bl2) {
        ad ad3 = ad2;
        while (ad3 != null) {
            int n2;
            ad ad4;
            int n3;
            int n4;
            ad ad5;
            ad ad6;
            int n5;
            ad ad7 = ad3.b;
            int n6 = ad7 != null ? ad7.h : 0;
            int n7 = n6 - (n5 = (ad6 = ad3.c) != null ? ad6.h : 0);
            if (n7 == -2) {
                ad5 = ad6.b;
                n4 = ad5 != null ? ad5.h : 0;
                n2 = n4 - (n3 = (ad4 = ad6.c) != null ? ad4.h : 0);
                if (n2 == -1 || n2 == 0 && !bl2) {
                    this.a(ad3);
                } else {
                    assert (n2 == 1);
                    this.b(ad6);
                    this.a(ad3);
                }
                if (bl2) {
                    break;
                }
            } else if (n7 == 2) {
                ad5 = ad7.b;
                n4 = ad5 != null ? ad5.h : 0;
                n2 = n4 - (n3 = (ad4 = ad7.c) != null ? ad4.h : 0);
                if (n2 == 1 || n2 == 0 && !bl2) {
                    this.b(ad3);
                } else {
                    assert (n2 == -1);
                    this.a(ad7);
                    this.b(ad3);
                }
                if (bl2) {
                    break;
                }
            } else if (n7 == 0) {
                ad3.h = n6 + 1;
                if (bl2) {
                    break;
                }
            } else {
                assert (n7 == -1 || n7 == 1);
                ad3.h = Math.max(n6, n5) + 1;
                if (!bl2) break;
            }
            ad3 = ad3.a;
        }
    }

    private void a(ad ad2) {
        ad ad3 = ad2.b;
        ad ad4 = ad2.c;
        ad ad5 = ad4.b;
        ad ad6 = ad4.c;
        ad2.c = ad5;
        if (ad5 != null) {
            ad5.a = ad2;
        }
        this.a(ad2, ad4);
        ad4.b = ad2;
        ad2.a = ad4;
        ad2.h = Math.max(ad3 != null ? ad3.h : 0, ad5 != null ? ad5.h : 0) + 1;
        ad4.h = Math.max(ad2.h, ad6 != null ? ad6.h : 0) + 1;
    }

    private void b(ad ad2) {
        ad ad3;
        ad ad4 = ad2.b;
        ad ad5 = ad2.c;
        ad ad6 = ad4.b;
        ad2.b = ad3 = ad4.c;
        if (ad3 != null) {
            ad3.a = ad2;
        }
        this.a(ad2, ad4);
        ad4.c = ad2;
        ad2.a = ad4;
        ad2.h = Math.max(ad5 != null ? ad5.h : 0, ad3 != null ? ad3.h : 0) + 1;
        ad4.h = Math.max(ad2.h, ad6 != null ? ad6.h : 0) + 1;
    }

    public Set entrySet() {
        y y2 = this.h;
        return y2 != null ? y2 : (this.h = new y(this));
    }

    public Set keySet() {
        aa aa2 = this.i;
        return aa2 != null ? aa2 : (this.i = new aa(this));
    }

    private Object a() {
        return new LinkedHashMap(this);
    }
}

