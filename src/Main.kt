class Main {

    data class Parkable(var vehicle: Vehicle)

    data class Parking(val vehicles: MutableSet<Vehicle>)

    enum class VehicleType {
        car, motocycle, minibus, bus
    }

    data class Vehicle(val plate: String, val type: VehicleType) {
        override fun equals(other: Any?): Boolean {
            if (other is Vehicle) {
                return this.plate == other.plate
            }
            return super.equals(other)
        }

        override fun hashCode(): Int {
            return this.plate.hashCode()
        }
    }

}