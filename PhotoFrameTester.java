class PhotoFrameTester{
public static void main(String[] local){
	PhotoFrame photoframe=new PhotoFrame(423,45,5,"sqre");
	photoframe.setMaterial(Material.WOOD);
	Color[] colors={Color.BLACK,Color.WHITE};
	photoframe.setColor(colors);
	photoframe.displayData();
}


}