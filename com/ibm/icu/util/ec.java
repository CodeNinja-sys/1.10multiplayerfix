/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.af;
import com.ibm.icu.util.a;
import com.ibm.icu.util.av;
import com.ibm.icu.util.b;
import com.ibm.icu.util.bl;
import com.ibm.icu.util.cm;
import com.ibm.icu.util.dg;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dl;
import com.ibm.icu.util.dm;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.MissingResourceException;
import java.util.StringTokenizer;

public class ec
extends b {
    private static final long a = -6851467294127795902L;
    private b b;
    private List i;
    private String j = null;
    private String z = null;
    private Date A = null;
    private static String B;
    private static final String C = "X-TZINFO";
    private static final int D = 3600000;
    private static final long E = 0L;
    private static final long F = Long.MIN_VALUE;
    private static final long G = Long.MAX_VALUE;
    private static final String H = ":";
    private static final String I = ";";
    private static final String J = "=";
    private static final String K = ",";
    private static final String L = "\r\n";
    private static final String M = "BEGIN:VTIMEZONE";
    private static final String N = "END:VTIMEZONE";
    private static final String O = "BEGIN";
    private static final String P = "END";
    private static final String Q = "VTIMEZONE";
    private static final String R = "TZID";
    private static final String S = "STANDARD";
    private static final String T = "DAYLIGHT";
    private static final String U = "DTSTART";
    private static final String V = "TZOFFSETFROM";
    private static final String W = "TZOFFSETTO";
    private static final String X = "RDATE";
    private static final String Y = "RRULE";
    private static final String Z = "TZNAME";
    private static final String aa = "TZURL";
    private static final String ab = "LAST-MODIFIED";
    private static final String ac = "FREQ";
    private static final String ad = "UNTIL";
    private static final String ae = "YEARLY";
    private static final String af = "BYMONTH";
    private static final String ag = "BYDAY";
    private static final String ah = "BYMONTHDAY";
    private static final String[] ai;
    private static final int[] aj;
    private static final int ak = 0;
    private static final int al = 1;
    private static final int am = 2;
    private static final int an = 3;
    private transient boolean ao = false;

    public static ec h(String string) {
        ec ec2 = new ec(string);
        ec2.b = (b)dj.a(string, 0);
        ec2.j = ec2.b.l();
        return ec2;
    }

    public static ec a(Reader reader) {
        ec ec2 = new ec();
        if (ec2.b(reader)) {
            return ec2;
        }
        return null;
    }

    public int a(int n2, int n3, int n4, int n5, int n6, int n7) {
        return this.b.a(n2, n3, n4, n5, n6, n7);
    }

    public void a(long l2, boolean bl2, int[] arrn) {
        this.b.a(l2, bl2, arrn);
    }

    public void a(long l2, int n2, int n3, int[] arrn) {
        this.b.a(l2, n2, n3, arrn);
    }

    public int a() {
        return this.b.a();
    }

    public boolean a(Date date) {
        return this.b.a(date);
    }

    public void a(int n2) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen VTimeZone instance.");
        }
        this.b.a(n2);
    }

    public boolean b() {
        return this.b.b();
    }

    public boolean c() {
        return this.b.c();
    }

    public boolean a(dj dj2) {
        if (this == dj2) {
            return true;
        }
        if (dj2 instanceof ec) {
            return this.b.a(((ec)dj2).b);
        }
        return this.b.a(dj2);
    }

    public String e() {
        return this.z;
    }

    public void i(String string) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen VTimeZone instance.");
        }
        this.z = string;
    }

    public Date r() {
        return this.A;
    }

    public void b(Date date) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen VTimeZone instance.");
        }
        this.A = date;
    }

    public void a(Writer writer) {
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        if (this.i != null) {
            for (String string : this.i) {
                if (string.startsWith("TZURL:")) {
                    if (this.z == null) continue;
                    bufferedWriter.write(aa);
                    bufferedWriter.write(H);
                    bufferedWriter.write(this.z);
                    bufferedWriter.write(L);
                    continue;
                }
                if (string.startsWith("LAST-MODIFIED:")) {
                    if (this.A == null) continue;
                    bufferedWriter.write(ab);
                    bufferedWriter.write(H);
                    bufferedWriter.write(ec.e(this.A.getTime()));
                    bufferedWriter.write(L);
                    continue;
                }
                bufferedWriter.write(string);
                bufferedWriter.write(L);
            }
            bufferedWriter.flush();
        } else {
            String[] arrstring = null;
            if (this.j != null && B != null) {
                arrstring = new String[]{"X-TZINFO:" + this.j + "[" + B + "]"};
            }
            this.a(writer, this.b, arrstring);
        }
    }

    public void a(Writer writer, long l2) {
        dl[] arrdl = this.b.a(l2);
        cm cm2 = new cm(this.b.l(), (bl)arrdl[0]);
        for (int i2 = 1; i2 < arrdl.length; ++i2) {
            cm2.a(arrdl[i2]);
        }
        String[] arrstring = null;
        if (this.j != null && B != null) {
            arrstring = new String[]{"X-TZINFO:" + this.j + "[" + B + "/Partial@" + l2 + "]"};
        }
        this.a(writer, cm2, arrstring);
    }

    public void b(Writer writer, long l2) {
        dl[] arrdl = this.b.b(l2);
        cm cm2 = new cm(this.b.l(), (bl)arrdl[0]);
        for (int i2 = 1; i2 < arrdl.length; ++i2) {
            cm2.a(arrdl[i2]);
        }
        String[] arrstring = null;
        if (this.j != null && B != null) {
            arrstring = new String[]{"X-TZINFO:" + this.j + "[" + B + "/Simple@" + l2 + "]"};
        }
        this.a(writer, cm2, arrstring);
    }

    public dm a(long l2, boolean bl2) {
        return this.b.a(l2, bl2);
    }

    public dm b(long l2, boolean bl2) {
        return this.b.b(l2, bl2);
    }

    public boolean a(dj dj2, long l2, long l3) {
        if (this == dj2) {
            return true;
        }
        return this.b.a(dj2, l2, l3);
    }

    public dl[] k() {
        return this.b.k();
    }

    public dl[] a(long l2) {
        return this.b.a(l2);
    }

    public Object clone() {
        if (this.f()) {
            return this;
        }
        return this.h();
    }

    private ec() {
    }

    private ec(String string) {
        super(string);
    }

    private boolean b(Reader reader) {
        try {
            this.i = new LinkedList();
            boolean bl2 = false;
            boolean bl3 = false;
            boolean bl4 = false;
            StringBuilder stringBuilder = new StringBuilder();
            while (true) {
                int n2;
                if ((n2 = reader.read()) == -1) {
                    if (!bl3 || !stringBuilder.toString().startsWith(N)) break;
                    this.i.add(stringBuilder.toString());
                    bl4 = true;
                    break;
                }
                if (n2 == 13) continue;
                if (bl2) {
                    if (n2 != 9 && n2 != 32) {
                        if (bl3 && stringBuilder.length() > 0) {
                            this.i.add(stringBuilder.toString());
                        }
                        stringBuilder.setLength(0);
                        if (n2 != 10) {
                            stringBuilder.append((char)n2);
                        }
                    }
                    bl2 = false;
                    continue;
                }
                if (n2 == 10) {
                    bl2 = true;
                    if (bl3) {
                        if (!stringBuilder.toString().startsWith(N)) continue;
                        this.i.add(stringBuilder.toString());
                        bl4 = true;
                        break;
                    }
                    if (!stringBuilder.toString().startsWith(M)) continue;
                    this.i.add(stringBuilder.toString());
                    stringBuilder.setLength(0);
                    bl3 = true;
                    bl2 = false;
                    continue;
                }
                stringBuilder.append((char)n2);
            }
            if (!bl4) {
                return false;
            }
        }
        catch (IOException iOException) {
            return false;
        }
        return this.s();
    }

    private boolean s() {
        int n2;
        int n3;
        Object object2;
        if (this.i == null || this.i.size() == 0) {
            return false;
        }
        String string = null;
        int n4 = 0;
        boolean bl2 = false;
        String string2 = null;
        String string3 = null;
        String string4 = null;
        String string5 = null;
        boolean bl3 = false;
        LinkedList<String> linkedList = null;
        ArrayList<dl> arrayList = new ArrayList<dl>();
        int n5 = 0;
        int n6 = 0;
        long l2 = Long.MAX_VALUE;
        for (Object object2 : this.i) {
            n3 = ((String)object2).indexOf(H);
            if (n3 < 0) continue;
            String string6 = ((String)object2).substring(0, n3);
            String string7 = ((String)object2).substring(n3 + 1);
            switch (n4) {
                case 0: {
                    if (!string6.equals(O) || !string7.equals(Q)) break;
                    n4 = 1;
                    break;
                }
                case 1: {
                    if (string6.equals(R)) {
                        string = string7;
                        break;
                    }
                    if (string6.equals(aa)) {
                        this.z = string7;
                        break;
                    }
                    if (string6.equals(ab)) {
                        this.A = new Date(ec.c(string7, 0));
                        break;
                    }
                    if (string6.equals(O)) {
                        boolean bl4 = string7.equals(T);
                        if (string7.equals(S) || bl4) {
                            if (string == null) {
                                n4 = 3;
                                break;
                            }
                            linkedList = null;
                            bl3 = false;
                            string2 = null;
                            string3 = null;
                            string4 = null;
                            bl2 = bl4;
                            n4 = 2;
                            break;
                        }
                        n4 = 3;
                        break;
                    }
                    if (!string6.equals(P)) break;
                    break;
                }
                case 2: {
                    if (string6.equals(U)) {
                        string5 = string7;
                        break;
                    }
                    if (string6.equals(Z)) {
                        string4 = string7;
                        break;
                    }
                    if (string6.equals(V)) {
                        string2 = string7;
                        break;
                    }
                    if (string6.equals(W)) {
                        string3 = string7;
                        break;
                    }
                    if (string6.equals(X)) {
                        if (bl3) {
                            n4 = 3;
                            break;
                        }
                        if (linkedList == null) {
                            linkedList = new LinkedList<String>();
                        }
                        StringTokenizer stringTokenizer = new StringTokenizer(string7, K);
                        while (stringTokenizer.hasMoreTokens()) {
                            String string8 = stringTokenizer.nextToken();
                            linkedList.add(string8);
                        }
                        break;
                    }
                    if (string6.equals(Y)) {
                        if (!bl3 && linkedList != null) {
                            n4 = 3;
                            break;
                        }
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                        }
                        bl3 = true;
                        linkedList.add(string7);
                        break;
                    }
                    if (!string6.equals(P)) break;
                    if (string5 == null || string2 == null || string3 == null) {
                        n4 = 3;
                        break;
                    }
                    if (string4 == null) {
                        string4 = ec.a(string, bl2);
                    }
                    dl dl2 = null;
                    int n7 = 0;
                    int n8 = 0;
                    int n9 = 0;
                    n2 = 0;
                    long l3 = 0L;
                    try {
                        n7 = ec.j(string2);
                        n8 = ec.j(string3);
                        if (bl2) {
                            if (n8 - n7 > 0) {
                                n9 = n7;
                                n2 = n8 - n7;
                            } else {
                                n9 = n8 - 3600000;
                                n2 = 3600000;
                            }
                        } else {
                            n9 = n8;
                            n2 = 0;
                        }
                        l3 = ec.c(string5, n7);
                        Date date = null;
                        dl2 = bl3 ? ec.a(string4, n9, n2, l3, linkedList, n7) : ec.b(string4, n9, n2, l3, linkedList, n7);
                        if (dl2 != null && (date = dl2.a(n7, 0)).getTime() < l2) {
                            l2 = date.getTime();
                            if (n2 > 0) {
                                n5 = n7;
                                n6 = 0;
                            } else if (n7 - n8 == 3600000) {
                                n5 = n7 - 3600000;
                                n6 = 3600000;
                            } else {
                                n5 = n7;
                                n6 = 0;
                            }
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        // empty catch block
                    }
                    if (dl2 == null) {
                        n4 = 3;
                        break;
                    }
                    arrayList.add(dl2);
                    n4 = 1;
                }
            }
            if (n4 != 3) continue;
            this.i = null;
            return false;
        }
        if (arrayList.size() == 0) {
            return false;
        }
        bl bl5 = new bl(ec.a(string, false), n5, n6);
        object2 = new cm(string, bl5);
        n3 = -1;
        int n10 = 0;
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            dl dl3 = (dl)arrayList.get(i2);
            if (!(dl3 instanceof a) || ((a)dl3).c() != Integer.MAX_VALUE) continue;
            ++n10;
            n3 = i2;
        }
        if (n10 > 2) {
            return false;
        }
        if (n10 == 1) {
            if (arrayList.size() == 1) {
                arrayList.clear();
            } else {
                dl dl4;
                Date date;
                a a2 = (a)arrayList.get(n3);
                int n11 = a2.f();
                int n12 = a2.g();
                Date date2 = date = a2.a(n5, n6);
                for (n2 = 0; n2 < arrayList.size(); ++n2) {
                    dl dl5;
                    Date date3;
                    if (n3 == n2 || !(date3 = (dl5 = (dl)arrayList.get(n2)).b(n11, n12)).after(date2)) continue;
                    date2 = a2.a(date3.getTime(), dl5.f(), dl5.g(), false);
                }
                if (date2 == date) {
                    dl4 = new dg(a2.e(), a2.f(), a2.g(), new long[]{date.getTime()}, 2);
                } else {
                    int[] arrn = com.ibm.icu.a.af.b(date2.getTime(), null);
                    dl4 = new a(a2.e(), a2.f(), a2.g(), a2.a(), a2.b(), arrn[0]);
                }
                arrayList.set(n3, dl4);
            }
        }
        for (dl dl6 : arrayList) {
            ((cm)object2).a(dl6);
        }
        this.b = object2;
        this.a_(string);
        return true;
    }

    private static String a(String string, boolean bl2) {
        if (bl2) {
            return string + "(DST)";
        }
        return string + "(STD)";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static dl a(String string, int n2, int n3, long l2, List list, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        long[] arrl;
        if (list == null || list.size() == 0) {
            return null;
        }
        String string2 = (String)list.get(0);
        int[] arrn = ec.a(string2, arrl = new long[1]);
        if (arrn == null) {
            return null;
        }
        int n9 = arrn[0];
        int n10 = arrn[1];
        int n11 = arrn[2];
        int n12 = arrn[3];
        if (list.size() == 1) {
            if (arrn.length > 4) {
                if (arrn.length != 10 || n9 == -1 || n10 == 0) {
                    return null;
                }
                n8 = 31;
                int[] arrn2 = new int[7];
                for (n7 = 0; n7 < 7; ++n7) {
                    arrn2[n7] = arrn[3 + n7];
                    arrn2[n7] = arrn2[n7] > 0 ? arrn2[n7] : aj[n9] + arrn2[n7] + 1;
                    n8 = arrn2[n7] < n8 ? arrn2[n7] : n8;
                }
                for (n7 = 1; n7 < 7; ++n7) {
                    n6 = 0;
                    for (n5 = 0; n5 < 7; ++n5) {
                        if (arrn2[n5] != n8 + n7) continue;
                        n6 = 1;
                        break;
                    }
                    if (n6 != 0) continue;
                    return null;
                }
                n12 = n8;
            }
        } else {
            if (n9 == -1 || n10 == 0 || n12 == 0) {
                return null;
            }
            if (list.size() > 7) {
                return null;
            }
            n8 = n9;
            int n13 = arrn.length - 3;
            n7 = 31;
            for (n6 = 0; n6 < n13; ++n6) {
                n5 = arrn[3 + n6];
                n5 = n5 > 0 ? n5 : aj[n9] + n5 + 1;
                n7 = n5 < n7 ? n5 : n7;
            }
            n6 = -1;
            for (n5 = 1; n5 < list.size(); ++n5) {
                int n14;
                string2 = (String)list.get(n5);
                long[] arrl2 = new long[1];
                int[] arrn3 = ec.a(string2, arrl2);
                if (arrl2[0] > arrl[0]) {
                    arrl = arrl2;
                }
                if (arrn3[0] == -1 || arrn3[1] == 0 || arrn3[3] == 0) {
                    return null;
                }
                int n15 = arrn3.length - 3;
                if (n13 + n15 > 7) {
                    return null;
                }
                if (arrn3[1] != n10) {
                    return null;
                }
                if (arrn3[0] != n9) {
                    if (n6 == -1) {
                        n14 = arrn3[0] - n9;
                        if (n14 == -11 || n14 == -1) {
                            n8 = n6 = arrn3[0];
                            n7 = 31;
                        } else {
                            if (n14 != 11 && n14 != 1) return null;
                            n6 = arrn3[0];
                        }
                    } else if (arrn3[0] != n9 && arrn3[0] != n6) {
                        return null;
                    }
                }
                if (arrn3[0] == n8) {
                    for (n14 = 0; n14 < n15; ++n14) {
                        int n16 = arrn3[3 + n14];
                        n16 = n16 > 0 ? n16 : aj[arrn3[0]] + n16 + 1;
                        n7 = n16 < n7 ? n16 : n7;
                    }
                }
                n13 += n15;
            }
            if (n13 != 7) {
                return null;
            }
            n9 = n8;
            n12 = n7;
        }
        int[] arrn4 = com.ibm.icu.a.af.b(l2 + (long)n4, null);
        int n17 = arrn4[0];
        if (n9 == -1) {
            n9 = arrn4[1];
        }
        if (n10 == 0 && n11 == 0 && n12 == 0) {
            n12 = arrn4[2];
        }
        n7 = arrn4[5];
        n6 = Integer.MAX_VALUE;
        if (arrl[0] != Long.MIN_VALUE) {
            com.ibm.icu.a.af.b(arrl[0], arrn4);
            n6 = arrn4[0];
        }
        av av2 = null;
        if (n10 == 0 && n11 == 0 && n12 != 0) {
            av2 = new av(n9, n12, n7, 0);
            return new a(string, n2, n3, av2, n17, n6);
        } else if (n10 != 0 && n11 != 0 && n12 == 0) {
            av2 = new av(n9, n11, n10, n7, 0);
            return new a(string, n2, n3, av2, n17, n6);
        } else {
            if (n10 == 0 || n11 != 0 || n12 == 0) return null;
            av2 = new av(n9, n12, n10, true, n7, 0);
        }
        return new a(string, n2, n3, av2, n17, n6);
    }

    private static int[] a(String string, long[] arrl) {
        Object object;
        int n2 = -1;
        int n3 = 0;
        int n4 = 0;
        int[] arrn = null;
        long l2 = Long.MIN_VALUE;
        boolean bl2 = false;
        boolean bl3 = false;
        StringTokenizer stringTokenizer = new StringTokenizer(string, I);
        block8: while (stringTokenizer.hasMoreTokens()) {
            int n5;
            int n6;
            String string2 = stringTokenizer.nextToken();
            int n7 = string2.indexOf(J);
            if (n7 == -1) {
                bl3 = true;
                break;
            }
            object = string2.substring(0, n7);
            String string3 = string2.substring(n7 + 1);
            if (((String)object).equals(ac)) {
                if (string3.equals(ae)) {
                    bl2 = true;
                    continue;
                }
                bl3 = true;
                break;
            }
            if (((String)object).equals(ad)) {
                try {
                    l2 = ec.c(string3, 0);
                    continue;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    bl3 = true;
                    break;
                }
            }
            if (((String)object).equals(af)) {
                if (string3.length() > 2) {
                    bl3 = true;
                    break;
                }
                try {
                    n2 = Integer.parseInt(string3) - 1;
                    if (n2 >= 0 && n2 < 12) continue;
                    bl3 = true;
                }
                catch (NumberFormatException numberFormatException) {
                    bl3 = true;
                }
                break;
            }
            if (((String)object).equals(ag)) {
                int n8 = string3.length();
                if (n8 < 2 || n8 > 4) {
                    bl3 = true;
                    break;
                }
                if (n8 > 2) {
                    n6 = 1;
                    if (string3.charAt(0) == '+') {
                        n6 = 1;
                    } else if (string3.charAt(0) == '-') {
                        n6 = -1;
                    } else if (n8 == 4) {
                        bl3 = true;
                        break;
                    }
                    try {
                        n5 = Integer.parseInt(string3.substring(n8 - 3, n8 - 2));
                        if (n5 == 0 || n5 > 4) {
                            bl3 = true;
                            break;
                        }
                        n4 = n5 * n6;
                    }
                    catch (NumberFormatException numberFormatException) {
                        bl3 = true;
                        break;
                    }
                    string3 = string3.substring(n8 - 2);
                }
                for (n6 = 0; n6 < ai.length && !string3.equals(ai[n6]); ++n6) {
                }
                if (n6 < ai.length) {
                    n3 = n6 + 1;
                    continue;
                }
                bl3 = true;
                break;
            }
            if (!((String)object).equals(ah)) continue;
            StringTokenizer stringTokenizer2 = new StringTokenizer(string3, K);
            n6 = stringTokenizer2.countTokens();
            arrn = new int[n6];
            n5 = 0;
            while (stringTokenizer2.hasMoreTokens()) {
                try {
                    arrn[n5++] = Integer.parseInt(stringTokenizer2.nextToken());
                }
                catch (NumberFormatException numberFormatException) {
                    bl3 = true;
                    continue block8;
                }
            }
        }
        if (bl3) {
            return null;
        }
        if (!bl2) {
            return null;
        }
        arrl[0] = l2;
        if (arrn == null) {
            object = new int[4];
            object[3] = 0;
        } else {
            object = new int[3 + arrn.length];
            for (int i2 = 0; i2 < arrn.length; ++i2) {
                object[3 + i2] = arrn[i2];
            }
        }
        object[0] = n2;
        object[1] = n3;
        object[2] = n4;
        return object;
    }

    private static dl b(String string, int n2, int n3, long l2, List list, int n4) {
        long[] arrl;
        if (list == null || list.size() == 0) {
            arrl = new long[]{l2};
        } else {
            arrl = new long[list.size()];
            int n5 = 0;
            try {
                for (String string2 : list) {
                    arrl[n5++] = ec.c(string2, n4);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return null;
            }
        }
        return new dg(string, n2, n3, arrl, 2);
    }

    private void a(Writer writer, b b2, String[] arrstring) {
        dm dm2;
        this.b(writer);
        if (arrstring != null && arrstring.length > 0) {
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                if (arrstring[i2] == null) continue;
                writer.write(arrstring[i2]);
                writer.write(L);
            }
        }
        long l2 = Long.MIN_VALUE;
        String string = null;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        long l3 = 0L;
        long l4 = 0L;
        int n10 = 0;
        a a2 = null;
        String string2 = null;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        int n17 = 0;
        int n18 = 0;
        long l5 = 0L;
        long l6 = 0L;
        int n19 = 0;
        a a3 = null;
        int[] arrn = new int[6];
        boolean bl2 = false;
        while ((dm2 = b2.a(l2, false)) != null) {
            bl2 = true;
            l2 = dm2.a();
            String string3 = dm2.b().e();
            boolean bl3 = dm2.b().g() != 0;
            int n20 = dm2.c().f() + dm2.c().g();
            int n21 = dm2.c().g();
            int n22 = dm2.b().f() + dm2.b().g();
            com.ibm.icu.a.af.b(dm2.a() + (long)n20, arrn);
            int n23 = com.ibm.icu.a.af.b(arrn[0], arrn[1], arrn[2]);
            int n24 = arrn[0];
            boolean bl4 = false;
            if (bl3) {
                if (a2 == null && dm2.b() instanceof a && ((a)dm2.b()).c() == Integer.MAX_VALUE) {
                    a2 = (a)dm2.b();
                }
                if (n10 > 0) {
                    if (n24 == n5 + n10 && string3.equals(string) && n2 == n20 && n4 == n22 && n6 == arrn[1] && n7 == arrn[3] && n8 == n23 && n9 == arrn[5]) {
                        l4 = l2;
                        ++n10;
                        bl4 = true;
                    }
                    if (!bl4) {
                        if (n10 == 1) {
                            ec.a(writer, true, string, n2, n4, l3, true);
                        } else {
                            ec.a(writer, true, string, n2, n4, n6, n8, n7, l3, l4);
                        }
                    }
                }
                if (!bl4) {
                    string = string3;
                    n2 = n20;
                    n3 = n21;
                    n4 = n22;
                    n5 = n24;
                    n6 = arrn[1];
                    n7 = arrn[3];
                    n8 = n23;
                    n9 = arrn[5];
                    l3 = l4 = l2;
                    n10 = 1;
                }
                if (a3 == null || a2 == null) continue;
                break;
            }
            if (a3 == null && dm2.b() instanceof a && ((a)dm2.b()).c() == Integer.MAX_VALUE) {
                a3 = (a)dm2.b();
            }
            if (n19 > 0) {
                if (n24 == n14 + n19 && string3.equals(string2) && n11 == n20 && n13 == n22 && n15 == arrn[1] && n16 == arrn[3] && n17 == n23 && n18 == arrn[5]) {
                    l6 = l2;
                    ++n19;
                    bl4 = true;
                }
                if (!bl4) {
                    if (n19 == 1) {
                        ec.a(writer, false, string2, n11, n13, l5, true);
                    } else {
                        ec.a(writer, false, string2, n11, n13, n15, n17, n16, l5, l6);
                    }
                }
            }
            if (!bl4) {
                string2 = string3;
                n11 = n20;
                n12 = n21;
                n13 = n22;
                n14 = n24;
                n15 = arrn[1];
                n16 = arrn[3];
                n17 = n23;
                n18 = arrn[5];
                l5 = l6 = l2;
                n19 = 1;
            }
            if (a3 == null || a2 == null) continue;
            break;
        }
        if (!bl2) {
            int n25 = b2.c(0L);
            boolean bl5 = n25 != b2.a();
            ec.a(writer, bl5, ec.a(b2.l(), bl5), n25, n25, 0L - (long)n25, false);
        } else {
            if (n10 > 0) {
                if (a2 == null) {
                    if (n10 == 1) {
                        ec.a(writer, true, string, n2, n4, l3, true);
                    } else {
                        ec.a(writer, true, string, n2, n4, n6, n8, n7, l3, l4);
                    }
                } else if (n10 == 1) {
                    ec.a(writer, true, a2, n2 - n3, n3, l3);
                } else if (ec.a(n6, n8, n7, a2.a())) {
                    ec.a(writer, true, string, n2, n4, n6, n8, n7, l3, Long.MAX_VALUE);
                } else {
                    ec.a(writer, true, string, n2, n4, n6, n8, n7, l3, l4);
                    ec.a(writer, true, a2, n2 - n3, n3, l3);
                }
            }
            if (n19 > 0) {
                if (a3 == null) {
                    if (n19 == 1) {
                        ec.a(writer, false, string2, n11, n13, l5, true);
                    } else {
                        ec.a(writer, false, string2, n11, n13, n15, n17, n16, l5, l6);
                    }
                } else if (n19 == 1) {
                    ec.a(writer, false, a3, n11 - n12, n12, l5);
                } else if (ec.a(n15, n17, n16, a3.a())) {
                    ec.a(writer, false, string2, n11, n13, n15, n17, n16, l5, Long.MAX_VALUE);
                } else {
                    ec.a(writer, false, string2, n11, n13, n15, n17, n16, l5, l6);
                    ec.a(writer, false, a3, n11 - n12, n12, l5);
                }
            }
        }
        ec.c(writer);
    }

    private static boolean a(int n2, int n3, int n4, av av2) {
        if (n2 != av2.b() || n4 != av2.d()) {
            return false;
        }
        if (av2.f() != 0) {
            return false;
        }
        if (av2.a() == 1 && av2.e() == n3) {
            return true;
        }
        int n5 = av2.c();
        if (av2.a() == 2) {
            if (n5 % 7 == 1 && (n5 + 6) / 7 == n3) {
                return true;
            }
            if (n2 != 1 && (aj[n2] - n5) % 7 == 6 && n3 == -1 * ((aj[n2] - n5 + 1) / 7)) {
                return true;
            }
        }
        if (av2.a() == 3) {
            if (n5 % 7 == 0 && n5 / 7 == n3) {
                return true;
            }
            if (n2 != 1 && (aj[n2] - n5) % 7 == 0 && n3 == -1 * ((aj[n2] - n5) / 7 + 1)) {
                return true;
            }
        }
        return false;
    }

    private static void a(Writer writer, boolean bl2, String string, int n2, int n3, long l2, boolean bl3) {
        ec.a(writer, bl2, string, n2, n3, l2);
        if (bl3) {
            writer.write(X);
            writer.write(H);
            writer.write(ec.d(l2 + (long)n2));
            writer.write(L);
        }
        ec.a(writer, bl2);
    }

    private static void a(Writer writer, boolean bl2, String string, int n2, int n3, int n4, int n5, long l2, long l3) {
        ec.a(writer, bl2, string, n2, n3, l2);
        ec.a(writer, n4);
        writer.write(ah);
        writer.write(J);
        writer.write(Integer.toString(n5));
        if (l3 != Long.MAX_VALUE) {
            ec.a(writer, ec.d(l3 + (long)n2));
        }
        writer.write(L);
        ec.a(writer, bl2);
    }

    private static void a(Writer writer, boolean bl2, String string, int n2, int n3, int n4, int n5, int n6, long l2, long l3) {
        ec.a(writer, bl2, string, n2, n3, l2);
        ec.a(writer, n4);
        writer.write(ag);
        writer.write(J);
        writer.write(Integer.toString(n5));
        writer.write(ai[n6 - 1]);
        if (l3 != Long.MAX_VALUE) {
            ec.a(writer, ec.d(l3 + (long)n2));
        }
        writer.write(L);
        ec.a(writer, bl2);
    }

    private static void b(Writer writer, boolean bl2, String string, int n2, int n3, int n4, int n5, int n6, long l2, long l3) {
        if (n5 % 7 == 1) {
            ec.a(writer, bl2, string, n2, n3, n4, (n5 + 6) / 7, n6, l2, l3);
        } else if (n4 != 1 && (aj[n4] - n5) % 7 == 6) {
            ec.a(writer, bl2, string, n2, n3, n4, -1 * ((aj[n4] - n5 + 1) / 7), n6, l2, l3);
        } else {
            ec.a(writer, bl2, string, n2, n3, l2);
            int n7 = n5;
            int n8 = 7;
            if (n5 <= 0) {
                int n9 = 1 - n5;
                n8 -= n9;
                int n10 = n4 - 1 < 0 ? 11 : n4 - 1;
                ec.a(writer, n10, -n9, n6, n9, Long.MAX_VALUE, n2);
                n7 = 1;
            } else if (n5 + 6 > aj[n4]) {
                int n11 = n5 + 6 - aj[n4];
                n8 -= n11;
                int n12 = n4 + 1 > 11 ? 0 : n4 + 1;
                ec.a(writer, n12, 1, n6, n11, Long.MAX_VALUE, n2);
            }
            ec.a(writer, n4, n7, n6, n8, l3, n2);
            ec.a(writer, bl2);
        }
    }

    private static void a(Writer writer, int n2, int n3, int n4, int n5, long l2, int n6) {
        boolean bl2;
        int n7 = n3;
        boolean bl3 = bl2 = n2 == 1;
        if (n3 < 0 && !bl2) {
            n7 = aj[n2] + n3 + 1;
        }
        ec.a(writer, n2);
        writer.write(ag);
        writer.write(J);
        writer.write(ai[n4 - 1]);
        writer.write(I);
        writer.write(ah);
        writer.write(J);
        writer.write(Integer.toString(n7));
        for (int i2 = 1; i2 < n5; ++i2) {
            writer.write(K);
            writer.write(Integer.toString(n7 + i2));
        }
        if (l2 != Long.MAX_VALUE) {
            ec.a(writer, ec.d(l2 + (long)n6));
        }
        writer.write(L);
    }

    private static void c(Writer writer, boolean bl2, String string, int n2, int n3, int n4, int n5, int n6, long l2, long l3) {
        if (n5 % 7 == 0) {
            ec.a(writer, bl2, string, n2, n3, n4, n5 / 7, n6, l2, l3);
        } else if (n4 != 1 && (aj[n4] - n5) % 7 == 0) {
            ec.a(writer, bl2, string, n2, n3, n4, -1 * ((aj[n4] - n5) / 7 + 1), n6, l2, l3);
        } else if (n4 == 1 && n5 == 29) {
            ec.a(writer, bl2, string, n2, n3, 1, -1, n6, l2, l3);
        } else {
            ec.b(writer, bl2, string, n2, n3, n4, n5 - 6, n6, l2, l3);
        }
    }

    private static void a(Writer writer, boolean bl2, a a2, int n2, int n3, long l2) {
        av av2 = ec.a(a2.a(), n2, n3);
        int n4 = av2.g();
        if (n4 < 0) {
            l2 += (long)(0 - n4);
        } else if (n4 >= 86400000) {
            l2 -= (long)(n4 - 86399999);
        }
        int n5 = a2.f() + a2.g();
        switch (av2.a()) {
            case 0: {
                ec.a(writer, bl2, a2.e(), n2 + n3, n5, av2.b(), av2.c(), l2, Long.MAX_VALUE);
                break;
            }
            case 1: {
                ec.a(writer, bl2, a2.e(), n2 + n3, n5, av2.b(), av2.e(), av2.d(), l2, Long.MAX_VALUE);
                break;
            }
            case 2: {
                ec.b(writer, bl2, a2.e(), n2 + n3, n5, av2.b(), av2.c(), av2.d(), l2, Long.MAX_VALUE);
                break;
            }
            case 3: {
                ec.c(writer, bl2, a2.e(), n2 + n3, n5, av2.b(), av2.c(), av2.d(), l2, Long.MAX_VALUE);
            }
        }
    }

    private static av a(av av2, int n2, int n3) {
        if (av2.f() == 0) {
            return av2;
        }
        int n4 = av2.g();
        if (av2.f() == 2) {
            n4 += n2 + n3;
        } else if (av2.f() == 1) {
            n4 += n3;
        }
        int n5 = -1;
        int n6 = 0;
        int n7 = 0;
        int n8 = -1;
        int n9 = 0;
        if (n4 < 0) {
            n9 = -1;
            n4 += 86400000;
        } else if (n4 >= 86400000) {
            n9 = 1;
            n4 -= 86400000;
        }
        n5 = av2.b();
        n6 = av2.c();
        n7 = av2.d();
        n8 = av2.a();
        if (n9 != 0) {
            if (n8 == 1) {
                int n10 = av2.e();
                if (n10 > 0) {
                    n8 = 2;
                    n6 = 7 * (n10 - 1) + 1;
                } else {
                    n8 = 3;
                    n6 = aj[n5] + 7 * (n10 + 1);
                }
            }
            if ((n6 += n9) == 0) {
                n5 = --n5 < 0 ? 11 : n5;
                n6 = aj[n5];
            } else if (n6 > aj[n5]) {
                n5 = ++n5 > 11 ? 0 : n5;
                n6 = 1;
            }
            if (n8 != 0) {
                if ((n7 += n9) < 1) {
                    n7 = 7;
                } else if (n7 > 7) {
                    n7 = 1;
                }
            }
        }
        av av3 = n8 == 0 ? new av(n5, n6, n4, 0) : new av(n5, n6, n7, n8 == 2, n4, 0);
        return av3;
    }

    private static void a(Writer writer, boolean bl2, String string, int n2, int n3, long l2) {
        writer.write(O);
        writer.write(H);
        if (bl2) {
            writer.write(T);
        } else {
            writer.write(S);
        }
        writer.write(L);
        writer.write(W);
        writer.write(H);
        writer.write(ec.b(n3));
        writer.write(L);
        writer.write(V);
        writer.write(H);
        writer.write(ec.b(n2));
        writer.write(L);
        writer.write(Z);
        writer.write(H);
        writer.write(string);
        writer.write(L);
        writer.write(U);
        writer.write(H);
        writer.write(ec.d(l2 + (long)n2));
        writer.write(L);
    }

    private static void a(Writer writer, boolean bl2) {
        writer.write(P);
        writer.write(H);
        if (bl2) {
            writer.write(T);
        } else {
            writer.write(S);
        }
        writer.write(L);
    }

    private static void a(Writer writer, int n2) {
        writer.write(Y);
        writer.write(H);
        writer.write(ac);
        writer.write(J);
        writer.write(ae);
        writer.write(I);
        writer.write(af);
        writer.write(J);
        writer.write(Integer.toString(n2 + 1));
        writer.write(I);
    }

    private static void a(Writer writer, String string) {
        if (string != null) {
            writer.write(I);
            writer.write(ad);
            writer.write(J);
            writer.write(string);
        }
    }

    private void b(Writer writer) {
        writer.write(O);
        writer.write(H);
        writer.write(Q);
        writer.write(L);
        writer.write(R);
        writer.write(H);
        writer.write(this.b.l());
        writer.write(L);
        if (this.z != null) {
            writer.write(aa);
            writer.write(H);
            writer.write(this.z);
            writer.write(L);
        }
        if (this.A != null) {
            writer.write(ab);
            writer.write(H);
            writer.write(ec.e(this.A.getTime()));
            writer.write(L);
        }
    }

    private static void c(Writer writer) {
        writer.write(P);
        writer.write(H);
        writer.write(Q);
        writer.write(L);
    }

    private static String d(long l2) {
        int[] arrn = com.ibm.icu.a.af.b(l2, null);
        StringBuilder stringBuilder = new StringBuilder(15);
        stringBuilder.append(ec.a(arrn[0], 4));
        stringBuilder.append(ec.a(arrn[1] + 1, 2));
        stringBuilder.append(ec.a(arrn[2], 2));
        stringBuilder.append('T');
        int n2 = arrn[5];
        int n3 = n2 / 3600000;
        int n4 = (n2 %= 3600000) / 60000;
        int n5 = (n2 %= 60000) / 1000;
        stringBuilder.append(ec.a(n3, 2));
        stringBuilder.append(ec.a(n4, 2));
        stringBuilder.append(ec.a(n5, 2));
        return stringBuilder.toString();
    }

    private static String e(long l2) {
        return ec.d(l2) + "Z";
    }

    private static long c(String string, int n2) {
        boolean bl2;
        boolean bl3;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        block6: {
            block7: {
                int n9;
                n8 = 0;
                n7 = 0;
                n6 = 0;
                n5 = 0;
                n4 = 0;
                n3 = 0;
                bl3 = false;
                bl2 = false;
                if (string == null || (n9 = string.length()) != 15 && n9 != 16 || string.charAt(8) != 'T') break block6;
                if (n9 != 16) break block7;
                if (string.charAt(15) != 'Z') break block6;
                bl3 = true;
            }
            try {
                n8 = Integer.parseInt(string.substring(0, 4));
                n7 = Integer.parseInt(string.substring(4, 6)) - 1;
                n6 = Integer.parseInt(string.substring(6, 8));
                n5 = Integer.parseInt(string.substring(9, 11));
                n4 = Integer.parseInt(string.substring(11, 13));
                n3 = Integer.parseInt(string.substring(13, 15));
            }
            catch (NumberFormatException numberFormatException) {
                break block6;
            }
            int n10 = com.ibm.icu.a.af.a(n8, n7);
            if (n8 >= 0 && n7 >= 0 && n7 <= 11 && n6 >= 1 && n6 <= n10 && n5 >= 0 && n5 < 24 && n4 >= 0 && n4 < 60 && n3 >= 0 && n3 < 60) {
                bl2 = true;
            }
        }
        if (!bl2) {
            throw new IllegalArgumentException("Invalid date time string format");
        }
        long l2 = com.ibm.icu.a.af.a(n8, n7, n6) * 86400000L;
        l2 += (long)(n5 * 3600000 + n4 * 60000 + n3 * 1000);
        if (!bl3) {
            l2 -= (long)n2;
        }
        return l2;
    }

    private static int j(String string) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        boolean bl2;
        block5: {
            block4: {
                block7: {
                    char c2;
                    block6: {
                        bl2 = false;
                        n6 = 0;
                        n5 = 0;
                        n4 = 0;
                        n3 = 0;
                        if (string == null || (n2 = string.length()) != 5 && n2 != 7) break block5;
                        c2 = string.charAt(0);
                        if (c2 != '+') break block6;
                        n6 = 1;
                        break block7;
                    }
                    if (c2 != '-') break block5;
                    n6 = -1;
                }
                try {
                    n5 = Integer.parseInt(string.substring(1, 3));
                    n4 = Integer.parseInt(string.substring(3, 5));
                    if (n2 != 7) break block4;
                    n3 = Integer.parseInt(string.substring(5, 7));
                }
                catch (NumberFormatException numberFormatException) {
                    break block5;
                }
            }
            bl2 = true;
        }
        if (!bl2) {
            throw new IllegalArgumentException("Bad offset string");
        }
        n2 = n6 * ((n5 * 60 + n4) * 60 + n3) * 1000;
        return n2;
    }

    private static String b(int n2) {
        StringBuilder stringBuilder = new StringBuilder(7);
        if (n2 >= 0) {
            stringBuilder.append('+');
        } else {
            stringBuilder.append('-');
            n2 = -n2;
        }
        int n3 = n2 / 1000;
        int n4 = n3 % 60;
        n3 = (n3 - n4) / 60;
        int n5 = n3 % 60;
        int n6 = n3 / 60;
        stringBuilder.append(ec.a(n6, 2));
        stringBuilder.append(ec.a(n5, 2));
        stringBuilder.append(ec.a(n4, 2));
        return stringBuilder.toString();
    }

    private static String a(int n2, int n3) {
        String string = Integer.toString(n2);
        int n4 = string.length();
        if (n4 >= n3) {
            return string.substring(n4 - n3, n4);
        }
        StringBuilder stringBuilder = new StringBuilder(n3);
        for (int i2 = n4; i2 < n3; ++i2) {
            stringBuilder.append('0');
        }
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public boolean f() {
        return this.ao;
    }

    public dj g() {
        this.ao = true;
        return this;
    }

    public dj h() {
        ec ec2 = (ec)super.h();
        ec2.b = (b)this.b.h();
        ec2.ao = false;
        return ec2;
    }

    public /* synthetic */ Object i() {
        return this.h();
    }

    public /* synthetic */ Object j() {
        return this.g();
    }

    static {
        ai = new String[]{"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
        aj = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        try {
            B = dj.q();
        }
        catch (MissingResourceException missingResourceException) {
            B = null;
        }
    }
}

