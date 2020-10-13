package Keas_TREE;

public class Pert_1_Tree {
    
    /*
        Di tree ada 
        - root
        - node
        - leaf
    
        Perbedaan tree dan Graf
        Tree -> tiap satu leaf hanya memiliki satu buah parent
        Graf -> tiap satu leaf boleh memiliki lebih dari satu buah parent
    
    Istilah dalam Tree
        - Sibling    = node - node yang memiliki parent yang sama
        - Ancestor   = semua simpul yang terletak dalam satu jalur dengan simpul tersebut, 
                       dari dirinya sampai ke paling atas (root).
        - Descendant = semua simpul yang terletak dalam satu jalur dengan simpul tersebut, 
                       dari dirinya sampai ke paling bawah (leaf).
    
    Level dari node - node yang telah dibuat
    
    Tree = sebuah struktur data yang dibuat secara rekursif dan harus memenuhi dua aturan :
        1. Sebuah node adalah sebuah Tree, node satu - satunya pada tree ini berfungsi sebagai root dan juga leaf
        2. Dari k buah tree T1 ~ Tk dan masing - 
    
    Binary Tree
    Maksimal memiliki dua anak. harus jelas anak kiri atau kanan
    
    Konsep Tree mirip dengan double LinkList tapi pointernya adalah left, right karena
    Tree mengeksekusi pengaksesan berdasarkan prioritas kiri dan kanan.
    
    Contoh Tree
          A         
         / \    
        B   H
       / \
     C    D
         / \
        E   F
       /     
      G

    Cara menampilkan data di Tree
    - preorder  = Konsep rekursif
      A -> B -> C -> D -> E -> G -> F -> H
        1. Parent
        2. Jalan kekiri bawah sampai habis, jika sudah habis maka naik lagi fokus kekanan
        3. Jika kanan ada child / yg juga jadi parent, maka di situ dulu. setelah itu 
           kembali melakukan langkah 2.
      Berdasarkan langkah preorder, maka cara pengaksesannya adalah : 
        1. Parent
        2. Parent kekiri, ditemui B, yang juga parent dari C, tetap prioritas kekiri, Akses C. 
           sudah habis, maka naik lagi ke B, cek Kanan ada D ternyata dia parent, maka turun kekiri
           menuju ke E, dan menuju ke G, sudah habis, maka naik lagi ke D, cek kanan ada F, bukan parent maka
           hanya diakses, akses selesai maka naik lagi ke D. naik lagi ke B, naik lagi ke A cek kanan ada H turun Ke H.
    
    - inorder   = 
    
           A                Scr PreOrder  : ABDGCEHIF       
         /   \              Scr InOrder   : DGBAHEICF
        B     C             Scr PostOrder :  
       /     /  \
      D      E   F
       \    / \
        G  H   I
       

        1. langsung dari kiri bawah
        2. Naik ke atas (parent), lalu ke kanan
    - postorder = 
        1. 
    
    - Level order
       mengeluarkan node - node berdasarkan level nya, mulai dari atas.
    
    FULL Binary Tree 
    Tiap node yang jadi parent memiliki bobot child yang sama. (Seimbang kiri dan kanan)
           A         
         /   \    
        B     D
       / \   / \
     C    E F   D
    
    COMPLETE Binary Tree
    Seluruh node sebelah kiri terisi penuh, node sebelah kanan pada level n - 1 ada yang kosong
    
    Incomplete Binary Tree selama tidak memenuhi Complete Bonary Tree maka itu adlh incomplete
    
    Skewed / Minimum BINARY Tree
    Hanya ada satu baris saja. jika hanya ada child kekanan maka disebut Right skewed dan sebaliknya disebut Left Skewed
    
    
    
    */
    
    
    
}
