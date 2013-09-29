

function openTimePicker(timeId){
	JsWrapper.openTimePickerDialog(timeId);
	return false;
}

function onTimeChanged(timeId, newTime){
	document.getElementById(timeId).value = newTime;
}