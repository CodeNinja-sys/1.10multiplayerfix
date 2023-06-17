/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.p;
import com.sun.jna.a.q;
import java.awt.Rectangle;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferInt;
import java.awt.image.MultiPixelPackedSampleModel;
import java.awt.image.Raster;
import java.awt.image.SampleModel;
import java.awt.image.SinglePixelPackedSampleModel;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class o {
    private static final int[] a = new int[]{128, 64, 32, 16, 8, 4, 2, 1};
    private static final Comparator b = new p();

    public static boolean a(Raster raster, q q2) {
        Object object;
        boolean bl2;
        Rectangle rectangle = raster.getBounds();
        SampleModel sampleModel = raster.getSampleModel();
        boolean bl3 = bl2 = sampleModel.getNumBands() == 4;
        if (raster.getParent() == null && rectangle.x == 0 && rectangle.y == 0 && ((DataBuffer)(object = raster.getDataBuffer())).getNumBanks() == 1) {
            if (sampleModel instanceof MultiPixelPackedSampleModel) {
                MultiPixelPackedSampleModel multiPixelPackedSampleModel = (MultiPixelPackedSampleModel)sampleModel;
                if (multiPixelPackedSampleModel.getPixelBitStride() == 1) {
                    return o.a(((DataBufferByte)object).getData(), rectangle.width, rectangle.height, q2);
                }
            } else if (sampleModel instanceof SinglePixelPackedSampleModel && sampleModel.getDataType() == 3) {
                return o.a(((DataBufferInt)object).getData(), rectangle.width, rectangle.height, bl2 ? -16777216 : 0xFFFFFF, q2);
            }
        }
        object = raster.getPixels(0, 0, rectangle.width, rectangle.height, (int[])null);
        return o.a((int[])object, rectangle.width, rectangle.height, bl2 ? -16777216 : 0xFFFFFF, q2);
    }

    public static boolean a(byte[] arrby, int n2, int n3, q q2) {
        HashSet hashSet = new HashSet();
        Cloneable cloneable = Collections.EMPTY_SET;
        int n4 = arrby.length / n3;
        for (int i2 = 0; i2 < n3; ++i2) {
            Cloneable cloneable2 = new TreeSet(b);
            int n5 = i2 * n4;
            int n6 = -1;
            for (int i3 = 0; i3 < n4; ++i3) {
                int n7 = i3 << 3;
                byte by2 = arrby[n5 + i3];
                if (by2 == 0) {
                    if (n6 < 0) continue;
                    cloneable2.add(new Rectangle(n6, i2, n7 - n6, 1));
                    n6 = -1;
                    continue;
                }
                if (by2 == 255) {
                    if (n6 >= 0) continue;
                    n6 = n7;
                    continue;
                }
                for (int i4 = 0; i4 < 8; ++i4) {
                    int n8 = n7 | i4;
                    if ((by2 & a[i4]) != 0) {
                        if (n6 >= 0) continue;
                        n6 = n8;
                        continue;
                    }
                    if (n6 < 0) continue;
                    cloneable2.add(new Rectangle(n6, i2, n8 - n6, 1));
                    n6 = -1;
                }
            }
            if (n6 >= 0) {
                cloneable2.add(new Rectangle(n6, i2, n2 - n6, 1));
            }
            Set set = o.a((Set)((Object)cloneable), cloneable2);
            hashSet.addAll(set);
            cloneable = cloneable2;
        }
        hashSet.addAll(cloneable);
        for (Cloneable cloneable2 : hashSet) {
            if (q2.a(((Rectangle)cloneable2).x, ((Rectangle)cloneable2).y, ((Rectangle)cloneable2).width, ((Rectangle)cloneable2).height)) continue;
            return false;
        }
        return true;
    }

    public static boolean a(int[] arrn, int n2, int n3, int n4, q q2) {
        HashSet hashSet = new HashSet();
        Cloneable cloneable = Collections.EMPTY_SET;
        for (int i2 = 0; i2 < n3; ++i2) {
            Cloneable cloneable2 = new TreeSet(b);
            int n5 = i2 * n2;
            int n6 = -1;
            for (int i3 = 0; i3 < n2; ++i3) {
                if ((arrn[n5 + i3] & n4) != 0) {
                    if (n6 >= 0) continue;
                    n6 = i3;
                    continue;
                }
                if (n6 < 0) continue;
                cloneable2.add(new Rectangle(n6, i2, i3 - n6, 1));
                n6 = -1;
            }
            if (n6 >= 0) {
                cloneable2.add(new Rectangle(n6, i2, n2 - n6, 1));
            }
            Set set = o.a((Set)((Object)cloneable), cloneable2);
            hashSet.addAll(set);
            cloneable = cloneable2;
        }
        hashSet.addAll(cloneable);
        for (Cloneable cloneable2 : hashSet) {
            if (q2.a(((Rectangle)cloneable2).x, ((Rectangle)cloneable2).y, ((Rectangle)cloneable2).width, ((Rectangle)cloneable2).height)) continue;
            return false;
        }
        return true;
    }

    private static Set a(Set set, Set set2) {
        HashSet hashSet = new HashSet(set);
        if (!set.isEmpty() && !set2.isEmpty()) {
            Rectangle[] arrrectangle = set.toArray(new Rectangle[set.size()]);
            Rectangle[] arrrectangle2 = set2.toArray(new Rectangle[set2.size()]);
            int n2 = 0;
            int n3 = 0;
            while (n2 < arrrectangle.length && n3 < arrrectangle2.length) {
                while (arrrectangle2[n3].x < arrrectangle[n2].x) {
                    if (++n3 != arrrectangle2.length) continue;
                    return hashSet;
                }
                if (arrrectangle2[n3].x == arrrectangle[n2].x && arrrectangle2[n3].width == arrrectangle[n2].width) {
                    hashSet.remove(arrrectangle[n2]);
                    arrrectangle2[n3].y = arrrectangle[n2].y;
                    arrrectangle2[n3].height = arrrectangle[n2].height + 1;
                    ++n3;
                    continue;
                }
                ++n2;
            }
        }
        return hashSet;
    }
}

