#include<stdio.h>
#include<stdlib.h>

int main() {
    int sayi1,sayi2;
    char basharf;
    printf("Lutfen 2 tane sayi giriniz.\n");
    scanf("%d %d",&sayi1,&sayi2);
    printf("Lutfen isminizin bas harfini giriniz.\n");
    scanf(" %c",&basharf);
    printf("Ilk sayim : %d Ikinci sayim : %d Bas Harfim: %c",sayi1,sayi2,basharf);
}
