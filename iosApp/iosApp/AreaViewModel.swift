import Foundation
import SwiftUI
import Combine


class ViewModel: ObservableObject {
    static func areaCalculation(width: Double, height: Double) -> Double { width*height }
    
    static let initialWidth = 2.0
    static let initialHeight = 3.0
    
    @Published public var width = initialWidth
    @Published public var height = initialHeight
    @Published public var area: Double?
    
    init() {
        Publishers.CombineLatest($width, $height)
            .map(ViewModel.areaCalculation)
            .assign(to: &$area)
    }
}

