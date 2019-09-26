package windows.example.m.cvandroid;

import java.util.ArrayList;

public class AppData {
    public static String[][] data = new String[][]{
            {"Linear Layout", "Linear Layout is a group of views that aligns all the children in one direction, vertically or horizontally. You can specify the direction of the layout with the Android attribute: orientation.", "https://image.flaticon.com/icons/png/512/38/38002.png"},
            {"Relative Layout", "Relative Layout is a layout whose arrangement is a arrangement that places widgets in it like layers, so that a widget can be located above / below other widgets or in other words Relative is a layout that is more free (Relative) so that it can be arranged in Anything.", "https://image.flaticon.com/icons/png/512/38/38002.png"},
            {"Frame layout", "Frame Layout is a Layout that is usually used to create overlapping objects.", "https://image.flaticon.com/icons/png/512/38/38002.png"},
            {"Scroll View", "Scroll View is a component that is used to scroll the screen of an android application.", "https://image.flaticon.com/icons/png/512/38/38002.png"},
            {"Recycle View", "The RecyclerView widget is a more advanced and flexible version of ListView. In the RecyclerView model, several different components work together to display your data. The overall container for your user interface is a RecyclerView object that you add to your layout", "https://image.flaticon.com/icons/png/512/38/38002.png"},
            {"Grid Layout", "Grid layout is one of the layouts used to set the layout on the panel. Gridlayout is part of the AWT library. Grid layout places components in the form of rectangular grids. The grid layout method will divide the screen area into a number of places in the same matrix size. Screen area is divided in row and column format, so that each component will have the same size, regardless of actual size. Every time there is a change in frame size, the size of each component will change.", "https://image.flaticon.com/icons/png/512/38/38002.png"},
            {"Text View", "TextView - used to display text.", "https://image.flaticon.com/icons/png/512/38/38002.png"},
            {"Image View", "ImageView - used to display images.", "https://image.flaticon.com/icons/png/512/38/38002.png"},
            {"Circle Image", "Circle image - used to make a circular image", "https://image.flaticon.com/icons/png/512/38/38002.png"},
            {"Bottom Navigation View ", "Bottom Navigation View functions to provide easy navigation by placing an additional menu at the bottom of the application.", "https://image.flaticon.com/icons/png/512/38/38002.png"},
            {"Progress Bar", "Progress Bar is a widget that is useful for displaying a processing in the form of a bar. ", "https://image.flaticon.com/icons/png/512/38/38002.png"},


    };
    public static ArrayList<App> getListApp(){
        ArrayList<App> list = new ArrayList<>();
        for (String[] aData : data) {
            App app = new App();
            app.setName(aData[0]);
            app.setFrom(aData[1]);
            app.setPhoto(aData[2]);
            list.add(app);
        }
        return list;
    }
}
