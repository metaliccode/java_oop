// dengan menggunakan super key kita bisa mengakses method dan variabel yang ada di kelas induknya
package superkey;

class Shape {
    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {
    int getCorner() {
        return 4;
    }

    int getParentCorner() {
        // contoh super key
        return super.getCorner();
    }
}
