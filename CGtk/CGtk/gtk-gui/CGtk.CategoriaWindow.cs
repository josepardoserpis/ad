
// This file has been generated by the GUI designer. Do not modify.
namespace CGtk
{
	public partial class CategoriaWindow
	{
		private global::Gtk.VBox vbox3;

		private global::Gtk.Table table1;

		private global::Gtk.Entry entry1;

		private global::Gtk.Label label1;

		private global::Gtk.HButtonBox hbuttonbox1;

		private global::Gtk.Button button1;

		private global::Gtk.Button button2;

		protected virtual void Build()
		{
			global::Stetic.Gui.Initialize(this);
			// Widget CGtk.CategoriaWindow
			this.Name = "CGtk.CategoriaWindow";
			this.Title = global::Mono.Unix.Catalog.GetString("CategoriaWindow");
			this.WindowPosition = ((global::Gtk.WindowPosition)(4));
			// Container child CGtk.CategoriaWindow.Gtk.Container+ContainerChild
			this.vbox3 = new global::Gtk.VBox();
			this.vbox3.Name = "vbox3";
			this.vbox3.Spacing = 6;
			// Container child vbox3.Gtk.Box+BoxChild
			this.table1 = new global::Gtk.Table(((uint)(1)), ((uint)(2)), false);
			this.table1.Name = "table1";
			this.table1.RowSpacing = ((uint)(6));
			this.table1.ColumnSpacing = ((uint)(6));
			// Container child table1.Gtk.Table+TableChild
			this.entry1 = new global::Gtk.Entry();
			this.entry1.CanFocus = true;
			this.entry1.Name = "entry1";
			this.entry1.IsEditable = true;
			this.entry1.InvisibleChar = '•';
			this.table1.Add(this.entry1);
			global::Gtk.Table.TableChild w1 = ((global::Gtk.Table.TableChild)(this.table1[this.entry1]));
			w1.LeftAttach = ((uint)(1));
			w1.RightAttach = ((uint)(2));
			w1.YOptions = ((global::Gtk.AttachOptions)(4));
			// Container child table1.Gtk.Table+TableChild
			this.label1 = new global::Gtk.Label();
			this.label1.Name = "label1";
			this.label1.LabelProp = global::Mono.Unix.Catalog.GetString("nombre");
			this.table1.Add(this.label1);
			global::Gtk.Table.TableChild w2 = ((global::Gtk.Table.TableChild)(this.table1[this.label1]));
			w2.XOptions = ((global::Gtk.AttachOptions)(4));
			w2.YOptions = ((global::Gtk.AttachOptions)(4));
			this.vbox3.Add(this.table1);
			global::Gtk.Box.BoxChild w3 = ((global::Gtk.Box.BoxChild)(this.vbox3[this.table1]));
			w3.Position = 0;
			w3.Expand = false;
			w3.Fill = false;
			// Container child vbox3.Gtk.Box+BoxChild
			this.hbuttonbox1 = new global::Gtk.HButtonBox();
			this.hbuttonbox1.Name = "hbuttonbox1";
			this.hbuttonbox1.LayoutStyle = ((global::Gtk.ButtonBoxStyle)(4));
			// Container child hbuttonbox1.Gtk.ButtonBox+ButtonBoxChild
			this.button1 = new global::Gtk.Button();
			this.button1.CanFocus = true;
			this.button1.Name = "button1";
			this.button1.UseStock = true;
			this.button1.UseUnderline = true;
			this.button1.Label = "gtk-ok";
			this.hbuttonbox1.Add(this.button1);
			global::Gtk.ButtonBox.ButtonBoxChild w4 = ((global::Gtk.ButtonBox.ButtonBoxChild)(this.hbuttonbox1[this.button1]));
			w4.Expand = false;
			w4.Fill = false;
			// Container child hbuttonbox1.Gtk.ButtonBox+ButtonBoxChild
			this.button2 = new global::Gtk.Button();
			this.button2.CanFocus = true;
			this.button2.Name = "button2";
			this.button2.UseStock = true;
			this.button2.UseUnderline = true;
			this.button2.Label = "Cancelar";
			this.hbuttonbox1.Add(this.button2);
			global::Gtk.ButtonBox.ButtonBoxChild w5 = ((global::Gtk.ButtonBox.ButtonBoxChild)(this.hbuttonbox1[this.button2]));
			w5.Position = 1;
			w5.Expand = false;
			w5.Fill = false;
			this.vbox3.Add(this.hbuttonbox1);
			global::Gtk.Box.BoxChild w6 = ((global::Gtk.Box.BoxChild)(this.vbox3[this.hbuttonbox1]));
			w6.Position = 1;
			w6.Expand = false;
			w6.Fill = false;
			this.Add(this.vbox3);
			if ((this.Child != null))
			{
				this.Child.ShowAll();
			}
			this.DefaultWidth = 400;
			this.DefaultHeight = 300;
			this.Show();
		}
	}
}
