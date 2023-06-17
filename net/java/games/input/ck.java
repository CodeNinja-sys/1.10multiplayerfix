/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.IOException;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import net.java.games.a.a.a;
import net.java.games.input.OSXHIDDevice;
import net.java.games.input.OSXHIDDeviceIterator;
import net.java.games.input.OSXHIDQueue;
import net.java.games.input.at;
import net.java.games.input.au;
import net.java.games.input.cf;
import net.java.games.input.ch;
import net.java.games.input.ci;
import net.java.games.input.cl;
import net.java.games.input.cm;
import net.java.games.input.cn;
import net.java.games.input.co;
import net.java.games.input.cp;
import net.java.games.input.cq;
import net.java.games.input.dj;
import net.java.games.input.dm;
import net.java.games.input.dn;
import net.java.games.input.i;
import net.java.games.input.k;
import net.java.games.input.l;
import net.java.games.input.n;
import net.java.games.input.q;
import net.java.games.input.s;
import net.java.games.input.t;

public final class ck
extends t
implements a {
    private static boolean d = false;
    private final q[] e = this.b() ? ck.d() : new q[0];

    static void d(String string) {
        AccessController.doPrivileged(new cl(string));
    }

    static String e(String string) {
        return (String)AccessController.doPrivileged(new cm(string));
    }

    static String a(String string, String string2) {
        return (String)AccessController.doPrivileged(new cn(string, string2));
    }

    private static final boolean a(int n2, int n3) {
        int n4;
        int n5;
        String string = System.getProperty("os.version");
        StringTokenizer stringTokenizer = new StringTokenizer(string, ".");
        try {
            String string2 = stringTokenizer.nextToken();
            String string3 = stringTokenizer.nextToken();
            n5 = Integer.parseInt(string2);
            n4 = Integer.parseInt(string3);
        }
        catch (Exception exception) {
            ck.a("Exception occurred while trying to determine OS version: " + exception);
            return false;
        }
        return n5 > n2 || n5 == n2 && n4 >= n3;
    }

    public final q[] a() {
        return this.e;
    }

    public boolean b() {
        return d;
    }

    private static final void a(OSXHIDQueue oSXHIDQueue, List list, List list2, boolean bl2) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            co co2 = (co)iterator.next();
            l l2 = co2.a();
            if (l2 == null) continue;
            if (bl2) {
                if (l2 == n.a) {
                    l2 = n.aw;
                } else if (l2 == n.b) {
                    l2 = n.ay;
                } else if (l2 == n.c) {
                    l2 = n.ax;
                }
            }
            ci ci2 = new ci(l2, co2);
            list2.add(ci2);
            oSXHIDQueue.a(co2, ci2);
        }
    }

    private static final au a(OSXHIDDevice oSXHIDDevice, List list) {
        ArrayList arrayList = new ArrayList();
        OSXHIDQueue oSXHIDQueue = oSXHIDDevice.a(32);
        try {
            ck.a(oSXHIDQueue, list, arrayList, false);
        }
        catch (IOException iOException) {
            oSXHIDQueue.a();
            throw iOException;
        }
        k[] arrk = new k[arrayList.size()];
        arrayList.toArray(arrk);
        cp cp2 = new cp(oSXHIDDevice, oSXHIDQueue, arrk, new q[0], new dj[0]);
        return cp2;
    }

    private static final cf b(OSXHIDDevice oSXHIDDevice, List list) {
        ArrayList arrayList = new ArrayList();
        OSXHIDQueue oSXHIDQueue = oSXHIDDevice.a(32);
        try {
            ck.a(oSXHIDQueue, list, arrayList, true);
        }
        catch (IOException iOException) {
            oSXHIDQueue.a();
            throw iOException;
        }
        k[] arrk = new k[arrayList.size()];
        arrayList.toArray(arrk);
        cq cq2 = new cq(oSXHIDDevice, oSXHIDQueue, arrk, new q[0], new dj[0]);
        if (cq2.n() != null && cq2.k() != null && cq2.l() != null) {
            return cq2;
        }
        oSXHIDQueue.a();
        return null;
    }

    private static final i a(OSXHIDDevice oSXHIDDevice, List list, s s2) {
        ArrayList arrayList = new ArrayList();
        OSXHIDQueue oSXHIDQueue = oSXHIDDevice.a(32);
        try {
            ck.a(oSXHIDQueue, list, arrayList, false);
        }
        catch (IOException iOException) {
            oSXHIDQueue.a();
            throw iOException;
        }
        k[] arrk = new k[arrayList.size()];
        arrayList.toArray(arrk);
        ch ch2 = new ch(oSXHIDDevice, oSXHIDQueue, arrk, new q[0], new dj[0], s2);
        return ch2;
    }

    private static final void c(OSXHIDDevice oSXHIDDevice, List list) {
        i i2;
        dn dn2 = oSXHIDDevice.d();
        if (dn2 == null) {
            return;
        }
        List list2 = oSXHIDDevice.c();
        if (dn2.a() == dm.b && (dn2.b() == at.b || dn2.b() == at.a)) {
            cf cf2 = ck.b(oSXHIDDevice, list2);
            if (cf2 != null) {
                list.add(cf2);
            }
        } else if (dn2.a() == dm.b && (dn2.b() == at.e || dn2.b() == at.f)) {
            au au2 = ck.a(oSXHIDDevice, list2);
            if (au2 != null) {
                list.add(au2);
            }
        } else if (dn2.a() == dm.b && dn2.b() == at.c) {
            i i3 = ck.a(oSXHIDDevice, list2, s.h);
            if (i3 != null) {
                list.add(i3);
            }
        } else if (dn2.a() == dm.b && dn2.b() == at.g) {
            i i4 = ck.a(oSXHIDDevice, list2, s.h);
            if (i4 != null) {
                list.add(i4);
            }
        } else if (dn2.a() == dm.b && dn2.b() == at.d && (i2 = ck.a(oSXHIDDevice, list2, s.e)) != null) {
            list.add(i2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final q[] d() {
        q[] arrq;
        ArrayList arrayList;
        block12: {
            arrayList = new ArrayList();
            try {
                arrq = new OSXHIDDeviceIterator();
                block9: while (true) {
                    while (true) {
                        try {
                            OSXHIDDevice oSXHIDDevice = arrq.b();
                            if (oSXHIDDevice == null) {
                                break block12;
                            }
                            boolean bl2 = false;
                            try {
                                int n2 = arrayList.size();
                                ck.c(oSXHIDDevice, arrayList);
                                bl2 = n2 != arrayList.size();
                            }
                            catch (IOException iOException) {
                                ck.a("Failed to create controllers from device: " + oSXHIDDevice.b());
                            }
                            if (bl2) continue block9;
                            oSXHIDDevice.e();
                            continue block9;
                        }
                        catch (IOException iOException) {
                            ck.a("Failed to enumerate device: " + iOException.getMessage());
                            continue;
                        }
                        break;
                    }
                }
                finally {
                    arrq.a();
                }
            }
            catch (IOException iOException) {
                ck.b("Failed to enumerate devices: " + iOException.getMessage());
                return new q[0];
            }
        }
        arrq = new q[arrayList.size()];
        arrayList.toArray(arrq);
        return arrq;
    }

    static boolean a(boolean bl2) {
        d = bl2;
        return d;
    }

    static {
        String string = ck.a("os.name", "").trim();
        if (string.equals("Mac OS X")) {
            d = true;
            ck.d("jinput-osx");
        }
    }
}

