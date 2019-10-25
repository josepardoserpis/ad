using System;
using Gtk;

using CGtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel) {
        Build();

        treeView.AppendColumn("id", new CellRendererText(), "text", 0); //permite añadir columnas al treeview
        treeView.AppendColumn("nombre", new CellRendererText(), "text", 1);

        ListStore listStore = new ListStore(typeof(string), typeof(string));

        treeView.Model = listStore;

        listStore.AppendValues("1", "cat 1");//añade los valores por fila
        listStore.AppendValues("2", "cat 2");

        newAction.Activated += (sender, e) => Console.WriteLine("Has pulsado en newAction");

        newAction.Activated += (sender, e) => new CategoriaWindow();

        refreshStateActions();
        treeView.Selection.Changed += (sender, e) => refreshStateActions();


        quitAction.Activated += (sender, e) => Application.Quit();




    }
    //Si no has aplicado ningún cambio mantiene desactivados los botodes de editar y de deshacer.

    private void refreshStateActions() {
        bool hasSelectedRows = treeView.Selection.CountSelectedRows() > 0;
        editAction.Sensitive = hasSelectedRows;
        deleteAction.Sensitive = hasSelectedRows;
    }
    //Cuando cierra la aplicación deja de ejecutar.
    protected void OnDeleteEvent(object sender, DeleteEventArgs a) {
        Application.Quit();
        a.RetVal = true;
    }


}

