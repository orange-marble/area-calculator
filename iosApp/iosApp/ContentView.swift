import SwiftUI


struct ContentView: View {
    @State var width = 2.0
    @State var height = 3.0

    var body: some View {
        let area = width*height
        
        VStack {
            LengthView(label: "Width", sliderValue: $width)
            LengthView(label: "Height", sliderValue: $height)
            Text("Area: \(area)").padding()
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

