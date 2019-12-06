beforeEach ->
  placeholder = $('<div id="graph" style="width: 600px; height: 400px"></div>')
  $('#testUtil').append(placeholder)

afterEach ->
  $('#testUtil').empty()
