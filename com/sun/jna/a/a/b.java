/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.a;

import com.sun.jna.a.a.a;
import com.sun.jna.a.a.c;
import java.awt.Component;
import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public abstract class b
implements DropTargetListener {
    private int a;
    private List b;
    private DropTarget c;
    private boolean d = true;
    private c e;
    private String f;

    public b(Component component, int n2) {
        this(component, n2, new DataFlavor[0]);
    }

    public b(Component component, int n2, DataFlavor[] arrdataFlavor) {
        this(component, n2, arrdataFlavor, null);
    }

    public b(Component component, int n2, DataFlavor[] arrdataFlavor, c c2) {
        this.a = n2;
        this.b = Arrays.asList(arrdataFlavor);
        this.e = c2;
        this.c = new DropTarget(component, n2, this, this.d);
    }

    protected DropTarget a() {
        return this.c;
    }

    public boolean b() {
        return this.d;
    }

    public void a(boolean bl2) {
        this.d = bl2;
        if (this.c != null) {
            this.c.setActive(bl2);
        }
    }

    protected int a(DataFlavor[] arrdataFlavor) {
        return this.a;
    }

    protected int a(DropTargetEvent dropTargetEvent) {
        int n2;
        DropTargetEvent dropTargetEvent2;
        int n3 = 0;
        int n4 = 0;
        Point point = null;
        DataFlavor[] arrdataFlavor = new DataFlavor[]{};
        if (dropTargetEvent instanceof DropTargetDragEvent) {
            dropTargetEvent2 = (DropTargetDragEvent)dropTargetEvent;
            n3 = ((DropTargetDragEvent)dropTargetEvent2).getDropAction();
            n4 = ((DropTargetDragEvent)dropTargetEvent2).getSourceActions();
            arrdataFlavor = ((DropTargetDragEvent)dropTargetEvent2).getCurrentDataFlavors();
            point = ((DropTargetDragEvent)dropTargetEvent2).getLocation();
        } else if (dropTargetEvent instanceof DropTargetDropEvent) {
            dropTargetEvent2 = (DropTargetDropEvent)dropTargetEvent;
            n3 = ((DropTargetDropEvent)dropTargetEvent2).getDropAction();
            n4 = ((DropTargetDropEvent)dropTargetEvent2).getSourceActions();
            arrdataFlavor = ((DropTargetDropEvent)dropTargetEvent2).getCurrentDataFlavors();
            point = ((DropTargetDropEvent)dropTargetEvent2).getLocation();
        }
        if (this.b(arrdataFlavor) && (n3 = this.a(dropTargetEvent, n3, n4, n2 = this.a(arrdataFlavor))) != 0 && this.b(dropTargetEvent, n3, point)) {
            return n3;
        }
        return 0;
    }

    protected int a(DropTargetEvent dropTargetEvent, int n2, int n3, int n4) {
        int n5;
        boolean bl2 = this.a(n2);
        if ((n2 & n4) == 0 && !bl2) {
            int n6;
            n2 = n6 = n4 & n3;
        } else if (bl2 && (n5 = n2 & n4 & n3) != n2) {
            n2 = n5;
        }
        return n2;
    }

    protected boolean a(int n2) {
        int n3 = com.sun.jna.a.a.a.a();
        if (n3 == -1) {
            return n2 == 0x40000000 || n2 == 1;
        }
        return n3 != 0;
    }

    private void a(String string, DropTargetEvent dropTargetEvent) {
    }

    protected int a(DropTargetDragEvent dropTargetDragEvent) {
        int n2 = this.a((DropTargetEvent)dropTargetDragEvent);
        if (n2 != 0) {
            dropTargetDragEvent.acceptDrag(n2);
        } else {
            dropTargetDragEvent.rejectDrag();
        }
        return n2;
    }

    public void dragEnter(DropTargetDragEvent dropTargetDragEvent) {
        this.a("enter(tgt)", dropTargetDragEvent);
        int n2 = this.a(dropTargetDragEvent);
        this.a(dropTargetDragEvent, n2, dropTargetDragEvent.getLocation());
    }

    public void dragOver(DropTargetDragEvent dropTargetDragEvent) {
        this.a("over(tgt)", dropTargetDragEvent);
        int n2 = this.a(dropTargetDragEvent);
        this.a(dropTargetDragEvent, n2, dropTargetDragEvent.getLocation());
    }

    public void dragExit(DropTargetEvent dropTargetEvent) {
        this.a("exit(tgt)", dropTargetEvent);
        this.a(dropTargetEvent, 0, null);
    }

    public void dropActionChanged(DropTargetDragEvent dropTargetDragEvent) {
        this.a("change(tgt)", dropTargetDragEvent);
        int n2 = this.a(dropTargetDragEvent);
        this.a(dropTargetDragEvent, n2, dropTargetDragEvent.getLocation());
    }

    public void drop(DropTargetDropEvent dropTargetDropEvent) {
        this.a("drop(tgt)", dropTargetDropEvent);
        int n2 = this.a(dropTargetDropEvent);
        if (n2 != 0) {
            dropTargetDropEvent.acceptDrop(n2);
            try {
                this.a(dropTargetDropEvent, n2);
                dropTargetDropEvent.dropComplete(true);
            }
            catch (Exception exception) {
                dropTargetDropEvent.dropComplete(false);
            }
        } else {
            dropTargetDropEvent.rejectDrop();
        }
        this.a(dropTargetDropEvent, 0, dropTargetDropEvent.getLocation());
    }

    protected boolean b(DataFlavor[] arrdataFlavor) {
        HashSet<DataFlavor> hashSet = new HashSet<DataFlavor>(Arrays.asList(arrdataFlavor));
        hashSet.retainAll(this.b);
        return !hashSet.isEmpty();
    }

    protected void a(DropTargetEvent dropTargetEvent, int n2, Point point) {
        if (this.e != null) {
            this.e.a(dropTargetEvent, n2, point);
        }
    }

    protected boolean b(DropTargetEvent dropTargetEvent, int n2, Point point) {
        return true;
    }

    protected abstract void a(DropTargetDropEvent var1, int var2);
}

